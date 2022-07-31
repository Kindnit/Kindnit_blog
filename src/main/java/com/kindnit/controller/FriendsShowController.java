package com.kindnit.controller;

import com.kindnit.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 友链显示控制器
 * @Date: Created in 21:12 2020/6/27
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) {
        model.addAttribute("friendlinks",friendLinkService.listFriendLink());
        return "friends";
    }

}