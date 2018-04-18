package cn.szu.ming.controller;

import cn.szu.ming.entity.user;
import cn.szu.ming.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "reg",method = RequestMethod.GET)
    public String toReg(){
        return "home/reg";
    }
    @RequestMapping(value = "reg",method = RequestMethod.POST)
    public String reg(Model model, user user1,HttpServletRequest request){
        if(userService1.getUser(user1.getUsername())!=null){
            model.addAttribute("msg","fail");
        }else{
            userService1.addUser(user1);
            user1=userService1.getUser(user1.getUsername(),user1.getPassword());
            HttpSession session=request.getSession();
            session.setAttribute("user",user1);
            model.addAttribute("username",user1.getUsername());
            model.addAttribute("msg","suc");
        }
        return "redirect:home";
    }


    //登陆
    @RequestMapping(value = "log",method = RequestMethod.GET)
    public  String toLog(){return "home/log";}
    @RequestMapping(value = "log",method = RequestMethod.POST)
    public String log(Model model,user user1,HttpServletRequest request){
        user1=userService1.getUser(user1.getUsername(),user1.getPassword());
        if(user1!=null){
            HttpSession session=request.getSession();
            session.setAttribute("user",user1);
            model.addAttribute("username",user1.getUsername());
            return "redirect:home";
        }else{
            model.addAttribute("message","fail");
            return "home/log";
        }
    }

    //注销
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String toLogout(Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        //从在线名单中消除
        String username=(String)session.getAttribute("username");

        session.invalidate();       //销毁对话
        model.addAttribute("msg","成功注销");
        return "admin/msg";
    }

}
