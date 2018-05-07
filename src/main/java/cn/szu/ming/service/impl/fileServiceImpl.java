package cn.szu.ming.service.impl;

import cn.szu.ming.service.fileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@Service
public class fileServiceImpl implements fileService {

    @Override
    public String uploadImg(MultipartFile file, String hImgName,String rootPath) throws IOException {
        String filePath=rootPath+ "resource/img/hTownImg/"+hImgName+".jpg";
        File temp=new File(filePath);
        if(!temp.getParentFile().exists())temp.mkdirs();        //如果目录不存在则创建
        file.transferTo(temp);      //将图片写入
        return filePath;
    }
}
