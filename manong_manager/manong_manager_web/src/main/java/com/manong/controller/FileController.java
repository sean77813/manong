package com.manong.controller;

import com.manong.fastdfs.FastDFSClient;
import com.manong.fastdfs.FastDFSClient1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller("")
public class FileController {

    @ResponseBody
    @RequestMapping(value = "/uploadfile",method = RequestMethod.POST)
    public String uploadFile(@RequestParam MultipartFile uploadfile) throws IOException {
        System.out.println("=>uploadfile");
       String fileId  = FastDFSClient.uploadFile(uploadfile.getInputStream(),uploadfile.getOriginalFilename());
       if(fileId!=null){
           System.out.println("上传文件成功!=>fileId:"+fileId+"fileName:"+uploadfile.getOriginalFilename());
       }else{
           System.out.println("上传文件失败！");
       }
        return fileId+"----"+uploadfile.getOriginalFilename();
    }

    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String Test(@RequestParam("id")String id) throws IOException {
        System.out.println("=>test");
        System.out.println("=>id:"+id);
        return id;
    }
    @ResponseBody
    @RequestMapping(value = "/testfile",method = RequestMethod.POST)
    public String testFile(@RequestParam MultipartFile uploadfile) {
        System.out.println("=>testfile");
        System.out.println("=>fileName:"+uploadfile.getOriginalFilename());
        return "testfile";
    }
}
