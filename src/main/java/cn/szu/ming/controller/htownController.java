package cn.szu.ming.controller;

import cn.szu.ming.entity.htown;
import cn.szu.ming.entity.jointown;
import cn.szu.ming.entity.user;
import cn.szu.ming.service.fileService;
import cn.szu.ming.service.htownService;
import cn.szu.ming.service.jointownService;
import cn.szu.ming.service.userService;
import cn.szu.ming.util.Aspect.LogAspect;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    @Autowired
    jointownService jointownService1;
    @Autowired
    fileService fileService1;


    //获取所有同乡会
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String htown(Model model,@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "12")int pageSize){
        List<htown> list=htownService1.getHtowns(pageNum,pageSize);
        PageInfo page=new PageInfo(list);
        model.addAttribute("hl",list);
        model.addAttribute("pages",page.getPages());
        model.addAttribute("pageNum",pageNum);
        return "home/home";
    }


    //创建同乡会
    @RequestMapping(value = "addTown",method = RequestMethod.GET)
    public String toAddTown(){
        return "htown/addTown";
    }
    @RequestMapping(value = "addTown",method = RequestMethod.POST)
    public ModelAndView addTown(ModelAndView view, htown htown1, HttpServletRequest request){
        //获取要创建的同乡会名称
        String hname=htown1.getHname();
        //从session获得uid
        HttpSession session=request.getSession();
        user user1=(user)session.getAttribute("user");
        //检查是否已经加入同乡会
        if(user1.getUhid()!=null){
            view.addObject("msg","你已加入同乡会，无法再创建");
            view.setViewName("redirect:admin/msg");
            return view;
        }
        //检测同乡会是否被创建
        if(htownService1.getTown(hname)!=null){
            view.addObject("msg",htown1.getHname()+"同乡会已被创建");
            view.setViewName("redirect:admin/msg");
            return view;
        }else{
            //新增同乡会
            htown1.setHnum(1);
            htownService1.addTown(htown1);
            //获取新增同乡会的hid
            htown h=htownService1.getTown(hname);
            //创建者更新所属同乡会id并设为超级管理员
            userService1.setUhidAndType(htownService1.getTown(hname).getHid(),user1.getUid(),2);
            view.setViewName("redirect:home");
            return view;
        }
    }

    //查看同乡会信息
    @RequestMapping(value = "checkTown",method = RequestMethod.GET)
    public ModelAndView checkTown(ModelAndView view,int hid){
        //根据hid查询htown
        htown htown1=htownService1.getTown(hid);
        view.addObject("h",htown1);
        view.setViewName("htown/checkTown");
        return view;
    }

    //进入同乡会
    @RequestMapping(value = "myTown",method = RequestMethod.GET)
    public ModelAndView myTown(ModelAndView view,HttpServletRequest request){
        //获取uid
        HttpSession session=request.getSession();
        user user1=(user)session.getAttribute("user");
        int uid=user1.getUid();
        //根据uid查询uhid
        htown h=htownService1.getTownByUid(uid);
        if(h==null){            //判断是否有加入同乡会
            view.addObject("msg","您还未加入同乡会");
            view.setViewName("admin/msg");
            return view;
        }
        view.addObject("h",h);
        //查询同乡会下的所有user
        List<user> userList=userService1.getUsers(h.getHid());
        view.addObject("userList",userList);
        view.setViewName("htown/myTown");
        return view;
    }

    //管理同乡会
    @RequestMapping(value = "manTown",method = RequestMethod.GET)
    public ModelAndView manTown(ModelAndView view,HttpServletRequest request){
        HttpSession session=request.getSession();
        user user1=(user)session.getAttribute("user");
        htown htown1;
        //判断是否是管理员
        if(user1==null){    //检验是否有登陆
            view.addObject("msg","请先登陆");
            view.setViewName("admin/msg");
            return view;
        }else{
            //检查是否为同乡会管理员
            int type=user1.getType();
            if(type==0){     //不是管理员
                view.addObject("msg","对不起，你不是同乡会管理员");
                view.setViewName("admin/msg");
                return view;
            }else {       //普通管理员
                if(type==2){//创建者，有增加管理员权限
                    view.addObject("creater","1");
                }
                //展示同乡会信息
                htown1=htownService1.getTownByUid(user1.getUid());
                view.addObject("town",htown1);
                //展示所有成员
            }
        }
        //展示所有同乡会成员
        List<user> users=userService1.getUsers(htown1.getHid());
        view.addObject("users",users);

        //展示所有管理员
        List<user> manUsers=userService1.getManUsers(htown1.getHid());
        view.addObject("manUsers",manUsers);

        //展示所有申请者
        List<jointown> applyers=jointownService1.getApplyers(htown1.getHid());
        view.addObject("applyers",applyers);

        //是否有同乡会照片，有则显示，无则显示szu.jpg
        String imgName="szu.jpg";
        if(fileService1.checkImg(htown1.getHname()))imgName=htown1.getHname();
        view.addObject("imgName",imgName);

        view.setViewName("htown/manTown");
        return view;

    }

    //修改同乡会信息
    @RequestMapping(value = "manTown",method = RequestMethod.POST)
    public ModelAndView manTown(ModelAndView view,htown htown1,HttpServletRequest request){
        //修改同乡会信息
        htownService1.updateHtown(htown1);
        view.setViewName("redirect:manTown");
        return view;
    }

    //管理申请
    @RequestMapping(value = "manUser",method = RequestMethod.GET)
    public ModelAndView manUser(ModelAndView view, @ModelAttribute jointown jointown1, @RequestParam(value = "allow")String allow){
        //判断allow
        if(allow.equals("yes")){        //批准
            logger.debug(jointown1.getJhid());
            //修改user的uhid
            userService1.setUhidAndType(jointown1.getJhid(),jointown1.getJuid(),0);
        }
        //删除jointown
        jointownService1.del(jointown1.getJid());
        view.setViewName("redirect:manTown");
        return view;
    }

    /**
     * 增加管理员
     * @param view
     * @param username
     * @return
     */
    @RequestMapping(value = "manUser",method = RequestMethod.POST)
    public ModelAndView manUser(ModelAndView view,@RequestParam(value = "username")String username){
        //根据username获取uid
        int uid=userService1.getUser(username).getUid();
        userService1.updateTypeById(uid);
        view.setViewName("redirect:manTown");
        return view;
    }
}
