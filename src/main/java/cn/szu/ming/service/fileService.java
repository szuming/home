package cn.szu.ming.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface fileService {
    public String uploadImg(MultipartFile file, String hImgName,String rootPath) throws IOException;
}
