package cn.szu.ming.controller;

import cn.szu.ming.entity.user;
import cn.szu.ming.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
    @Autowired
    userService userService1;

    @RequestMapping("/testUser")
    public String getUser(int uid, Model model){
         user u=userService1.getUser(uid);
         model.addAttribute("username",u.getUsername());
         return "welcome";
    }

}
