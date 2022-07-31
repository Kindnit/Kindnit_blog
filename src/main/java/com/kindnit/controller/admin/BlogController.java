package com.kindnit.controller.admin;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kindnit.dto.BlogQuery;
import com.kindnit.dto.SearchBlog;
import com.kindnit.dto.ShowBlog;
import com.kindnit.pojo.Blog;
import com.kindnit.pojo.Tag;
import com.kindnit.pojo.Type;
import com.kindnit.pojo.User;
import com.kindnit.service.BlogService;
import com.kindnit.service.TagService;
import com.kindnit.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private TagService tagService;

    public void setTypeAndTag(Model model){
        //这里是负责给博客新增页面传递分类和标签的方法
        model.addAttribute("types",typeService.getAdminType());
        model.addAttribute("tags", tagService.getAdminTag());
    }

    //去博客页面，显示博客
    @GetMapping("/blogs")
    public String toBlog(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,5); //pageNum从第几页开始，后面的参数则是一页有多少数据
        List<BlogQuery> allBlogQuery = blogService.getAllBlogQuery(); //这里查到所有的BlogQuery属性信息
        PageInfo<BlogQuery> blogsPageInfo = new PageInfo<>(allBlogQuery); //封装到Pagehelper
        System.out.println(allBlogQuery);
        model.addAttribute("blogsPageInfo",blogsPageInfo); //传到前端
        setTypeAndTag(model); //调用方法，将所有的分类和标签传到前端
        model.addAttribute("href", "/admin/blogs"); //返回首页和尾页的请求
        return "admin/blogs";
    }

    //博客搜索
    @PostMapping("/blogs/search")
    public String blogSearch(SearchBlog searchBlog, Model model,
                             @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,5);
        System.out.println(searchBlog); //从前端得到的信息
        //通过前端得到的信息来查询对应BlogQuery类型的信息
        List<BlogQuery> allBlogQuery = blogService.searchByTitleOrTypeOrRecommend(searchBlog);
        PageInfo<BlogQuery> blogsPageInfo = new PageInfo<>(allBlogQuery); //封装到Pagehelper
        model.addAttribute("blogsPageInfo",blogsPageInfo);
        setTypeAndTag(model);
        model.addAttribute("message", "查询成功");
        return "admin/blogs :: blogList";//返回bloglist片段，不然会在网页嵌套一个网页
    }

    //去新增页面
    @GetMapping("/blogs/input")
    public String toBlogAdd(Model model){
        setTypeAndTag(model);  //传递type和标签
        return "admin/blogs-input";
    }

    //增加blog
    @PostMapping("/blogs/add")
    public String blogAdd(Blog blog, RedirectAttributes attributes, HttpSession session){
        System.out.println("前端传过来的blog：" + blog);
        //这里是提前将user在session中拿到并存入blog中
        blog.setUser((User) session.getAttribute("user"));
        //设置blog的type
        blog.setType(typeService.getTypeById(blog.getTypeId()));
        //设置blog中的typeID属性
        blog.setTypeId(blog.getType().getId());
        //设置blog中tags属性
        blog.setTags(tagService.getTagByString(blog.getTagIds()));
        //设置博客id这里得到的是前端中传递过来的
        blog.setUserId(blog.getUser().getId());
        blogService.saveBlog(blog);
        attributes.addFlashAttribute("message", "新增成功");
        return "redirect:/admin/blogs";
    }

    //去编辑
    @GetMapping("/blogs/{id}/update")
    public String toBlogUpdate(@PathVariable Long id,Model model,Blog blog){
        System.out.println("前段传来的toBlogUpdate的id："+id);
        ShowBlog blogById = blogService.getBlogById(id);
        List<Type> adminType = typeService.getAdminType();
        Type typeById = typeService.getTypeById(blogById.getTypeId());
        System.out.println("前段传来的toBlogUpdate的id查到的typeById："+typeById);
        List<Tag> adminTag = tagService.getAdminTag();
        System.out.println("前段传来的toBlogUpdate的id查到的adminTag："+adminTag);
        model.addAttribute("blog",blogById);
        model.addAttribute("types",typeById);
        model.addAttribute("types",adminType);
        model.addAttribute("tags",adminTag);
        return "admin/blogs-input";
    }

    //修改博客
    @PostMapping("/blogs/update")
    public String updateBlog(ShowBlog showBlog, RedirectAttributes attributes){
        //设置blog中tags属性
        blogService.updateBlog(showBlog);
        System.out.println(showBlog.getTagIds());
        System.out.println("updateBlog的showBlog"+showBlog);
        attributes.addFlashAttribute("message", "修改成功");
        return "redirect:/admin/blogs";
    }

    //删除
    @GetMapping("/blogs/{id}/delete")
    public String deleteBlog(@PathVariable Long id, RedirectAttributes attributes){
        blogService.deleteBlog(id);
        attributes.addFlashAttribute("message","删除成功");
        return "redirect:/admin/blogs";
    }

    @GetMapping("/footer/newblog")
    public String newblogs(Model model){
        model.addAttribute("newblogs",blogService.getRecommendedBlog());
        return "_fragments :: newblogList";
    }
}
