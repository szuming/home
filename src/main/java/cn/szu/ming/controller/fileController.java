package cn.szu.ming.controller;

import cn.szu.ming.service.fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class fileController {
    @Autowired
    fileService fileService1;


    @RequestMapping(value = "manTownImg",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView uploadImg(ModelAndView view, HttpServletRequest request,@RequestParam(value = "himg") MultipartFile multipartFile, @RequestParam(value = "hImgName")String hImgName) throws IOException {
        if(multipartFile.getSize()>0){     ///如果上传的文件大小大于0，执行上传
            String rootPath="E:\\j2ee\\spring\\home\\src\\main\\webapp\\statics\\img\\";        //获得要储存的路径
            String filePath=fileService1.uploadImg(multipartFile,hImgName,rootPath);        //储存文件后返回文件的所在位置的绝对路径
            System.out.println(filePath);
        }
        view.setViewName("redirect:manTown");
        return view;
    }
}
