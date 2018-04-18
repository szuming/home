package cn.szu.ming.controller;


import cn.szu.ming.entity.jointown;
import cn.szu.ming.entity.user;
import cn.szu.ming.service.jointownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class jointownController {
    @Autowired
    jointownService jointownService1;

    //申请加入同乡会
    @RequestMapping(value = "joinTown",method = RequestMethod.GET)
    public String joinTown1(Model model, @RequestParam(value = "hid")int hid, @RequestParam(value = "hname")String hname, HttpServletRequest request) {
        //从session获得uid
        HttpSession session = request.getSession();
        user user1 = (user) session.getAttribute("user");
        //检查是否已经加入同乡会
        if (user1.getUhid() != null) {
            model.addAttribute("msg", "你已加入一个同乡会");
            return "admin/msg";
        } else {
            //插入joinTown
            jointown jointown1 = new jointown(hname, user1.getUsername(), hid, user1.getUid());
            jointownService1.insert(jointown1);
            model.addAttribute("msg","已申请加入"+jointown1.getHname()+"同乡会， 请等待管理员处理");
            return "admin/msg";
        }
    }
}
