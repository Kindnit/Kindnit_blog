package com.kindnit.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kindnit.dto.DetailedBlog;
import com.kindnit.dto.FirstPageBlog;
import com.kindnit.dto.RecommendBlog;
import com.kindnit.exception.NotFountException;
import com.kindnit.pojo.Comment;
import com.kindnit.pojo.Tag;
import com.kindnit.pojo.Type;
import com.kindnit.service.BlogService;
import com.kindnit.service.CommentService;
import com.kindnit.service.TagService;
import com.kindnit.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    BlogService blogService;

    @Autowired
    TagService tagService;

    @Autowired
    TypeService typeService;

    @Autowired
    private CommentService commentService;


    @GetMapping("/")
    public String toIndex(Model model, @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,6); ////pageNum从第几页开始，后面的参数则是一页有多少数据
        List<FirstPageBlog> allFirstPageBlog = blogService.getAllFirstPageBlog(); //查询到所有已发布的博客信息
        System.out.println("allFirstPageBlog：----》"+allFirstPageBlog);
        List<Type> types=typeService.findTypeListBefore(7); //首页的分类信息，限定展示5个
        List<Tag> allTag = tagService.getAllTag(); //查到所有的标签
        System.out.println("alltag:"+allTag);
        List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog(); //最新推荐
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(allFirstPageBlog);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("tags", allTag);
        model.addAttribute("types", types);
        model.addAttribute("recommendedBlogs", recommendedBlog);
        return "index";
    }

    //全局搜索
    @PostMapping("/search")
    public String toSearch(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                           Model model,@RequestParam String query){
        PageHelper.startPage(pageNum, 100);
        List<FirstPageBlog> searchBlog = blogService.getSearchBlog(query); //调用方法开始查询query的内容
        if(searchBlog.isEmpty()){
            return "searchNull"; //如果无搜索结果返回到无结果的页面
        }
        else{
            PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(searchBlog);
            model.addAttribute("pageInfo", pageInfo); //查到的信息
            model.addAttribute("query", query); //查询信息也传过去
            return "search";
        }

    }

    //到博客页面，并根据博客id查到评论与内容
    @GetMapping("/blog/{id}")
    public String toBlog(@PathVariable Long id, Model model){
        DetailedBlog detailedBlog = blogService.getDetailedBlog(id);
        List<Comment> comments = commentService.listCommentByBlogId(id);
        model.addAttribute("comments", comments);
        model.addAttribute("blog", detailedBlog);
        return "blog";
    }

    //底部最新博客
    @GetMapping("/footer/newblog")
    public String newblogs(Model model){
        model.addAttribute("newblogs",blogService.getRecommendedBlog());
        return "_fragments :: newblogList";
    }


}
