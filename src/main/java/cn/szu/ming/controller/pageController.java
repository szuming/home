package cn.szu.ming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/toReg")
    public String toReg(){
        return "home/reg";
    }

    @RequestMapping("/toLog")
    public  String toLog(){return "home/log";}

    @RequestMapping("/toLogout")
    public String toLogout(){return "home/logout";}

    @RequestMapping("toAddTown")
    public String toAddTown(){
        return "htown/addTown";
    }
}
