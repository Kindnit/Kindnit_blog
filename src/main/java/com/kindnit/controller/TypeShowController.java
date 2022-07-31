package com.kindnit.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kindnit.dto.FirstPageBlog;
import com.kindnit.dto.RecommendBlog;
import com.kindnit.pojo.Type;
import com.kindnit.service.BlogService;
import com.kindnit.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TypeShowController {
    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/types/{id}")
    public String types(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum,
                        @PathVariable Long id, Model model) {
        //首页点进来显示Type显示的传过来id：-1
        System.out.println("Type显示的传过来id："+id);
        List<Type> types = typeService.getAllType();
        System.out.println("Type显示的getAllType的Types："+types);
        //-1表示从首页导航点进来的，给它传最顶上的ID
        if (id == -1) {
            id = types.get(0).getId();
        }
        System.out.println("Type显示的id："+id);
        model.addAttribute("types", types);
        List<FirstPageBlog> blogs = blogService.getByTypeId(id);
        System.out.println("Type显示的getByTypeId的blogs："+blogs);
        PageHelper.startPage(pageNum, 100);
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(blogs);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("activeTypeId", id);
        return "types";
    }

}
