package cn.szu.ming.controller;

import cn.szu.ming.entity.htown;
import cn.szu.ming.service.htownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class htownController {
    @Autowired
    htownService htownService1;

    @RequestMapping("/homePage")
    public String htown(Model model){
        List<htown> list=htownService1.getHtowns();
        model.addAttribute("hl",list);
        return "home/home";
    }
}
