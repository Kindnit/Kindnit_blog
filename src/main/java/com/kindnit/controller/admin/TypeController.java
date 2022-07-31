package com.kindnit.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kindnit.pojo.Type;
import com.kindnit.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/types")
    public String types(@RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum, Model model){
        PageHelper.startPage(pageNum,8); //pageNum从第几页开始，后面的参数则是一页有多少数据
        List<Type> allType = typeService.getAdminType(); //从数据库里查到所有的分类
        PageInfo<Type> pageInfo = new PageInfo<>(allType); //存入PageHelper的PageInfo中
        model.addAttribute("pageInfo",pageInfo); //传给前端
        return "/admin/types";
    }

    //去新增页面
    @GetMapping("/types/input")
    public String toAdd(Model model) {
        model.addAttribute("type", new Type());	//给前端返回type
        return "admin/types-input";
    }

    //Add
    @PostMapping("/types/add")
    public String Add(@Valid Type type, RedirectAttributes attributes) {
        System.out.println("前端输入过来的表单" + type); //这里拿到输入的type
        Type type1 = typeService.getTypeByName(type.getName()); //在这里我们进行校验
        if (type1 != null) { //如果有重复的分类我们将拒绝
            attributes.addFlashAttribute("message", "不允许添加重复的分类");
            return "redirect:/admin/types/input";
        }
        //添加操作
        typeService.saveType(type);
        attributes.addFlashAttribute("message", "添加成功");
        return "redirect:/admin/types";
    }

    //携带ID到编辑页面
    @GetMapping("/types/{id}/update")    //给前端返回我们要修改的ID的Type
    public String editInput(@PathVariable Long id,Model model){
        System.out.println(id);
        Type type = typeService.getTypeById(id);
        System.out.println(type);
        model.addAttribute("type",type);
        return "admin/types-input";
    }

    //修改
    @PostMapping("/types/update")
    public String editPost(@Valid Type type,RedirectAttributes attributes){
        System.out.println("前端传过来的表单" + type);
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 != null) {
            attributes.addFlashAttribute("message", "已存在重复的分类");
            return "redirect:/admin/types";
        }
        //添加操作
        typeService.updateType(type);
        attributes.addFlashAttribute("message", "修改成功");
        return "redirect:/admin/types";
    }

    //删除
    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes) {
        typeService.deleteType(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/types";
    }

}
