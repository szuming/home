package cn.szu.ming.controller;

import cn.szu.ming.entity.user;
import cn.szu.ming.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class userController {
    @Autowired
    userService userService1;

    @RequestMapping("testUser")
    public String getUser(int uid, Model model){
         user u=userService1.getUser(uid);
         model.addAttribute("username",u.getUsername());
         return "welcome";
    }


    //注册账号
    @RequestMapping("reg")
    public String reg(Model model, user user1,HttpServletRequest request){
        if(userService1.getUser(user1.getUsername())!=null){
            model.addAttribute("message","fail");
        }else{
            userService1.addUser(user1);
            HttpSession session=request.getSession();
            session.setAttribute("user",user1);
            model.addAttribute("username",user1.getUsername());
            model.addAttribute("message","suc");
        }
        return "home/regInfo";
    }


    //登陆
    @RequestMapping("log")
    public String log(Model model,user user1,HttpServletRequest request){
        user1=userService1.getUser(user1.getUsername(),user1.getPassword());
        if(user1!=null){
            HttpSession session=request.getSession();
            session.setAttribute("user",user1);
            model.addAttribute("username",user1.getUsername());
            return "home/home";
        }else{
            model.addAttribute("message","fail");
            return "home/log";
        }
    }

}
