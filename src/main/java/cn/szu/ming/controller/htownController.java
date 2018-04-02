package cn.szu.ming.controller;

import cn.szu.ming.entity.htown;
import cn.szu.ming.entity.user;
import cn.szu.ming.service.htownService;
import cn.szu.ming.service.userService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class htownController {
    private static Logger logger = Logger.getLogger(htownController.class.getName());
    @Autowired
    htownService htownService1;
    @Autowired
    userService userService1;

    @RequestMapping("/home")
    public String htown(Model model){
        List<htown> list=htownService1.getHtowns();
        model.addAttribute("hl",list);
        return "home/home";
    }

    @RequestMapping("htown/addTown")
    public void addTown(Model model, htown htown1, HttpServletRequest request){
        String hname=htown1.getHname();
        if(htownService1.getTown(hname)!=null){
            model.addAttribute("msg",htown1.getHname()+"同乡会已被创建");
        }else{
            //新增同乡会
            htown1.setHnum(1);
            htownService1.addTown(htown1);
            //获取新增同乡会的hid
            htown h=htownService1.getTown(hname);
            //获得uid
            HttpSession session=request.getSession();
            user user1=(user)session.getAttribute("user");
            logger.debug(user1.getUid());
            logger.debug(htownService1.getTown(hname).getHid());
            userService1.setUhid(htownService1.getTown(hname).getHid(),user1.getUid());
        }
    }
}
