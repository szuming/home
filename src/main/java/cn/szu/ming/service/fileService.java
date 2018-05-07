package cn.szu.ming.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface fileService {
    //添加单张图片
    public String uploadImg(MultipartFile file, String hImgName,String rootPath) throws IOException;

    //检查同乡会图片是否存在
    public boolean checkImg(String hname);


}
