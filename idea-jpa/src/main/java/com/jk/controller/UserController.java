package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserService;

import com.jk.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("toUser")
    public String toUser(){
        return "showUserList";
    }
    @RequestMapping("queryUser")
    @ResponseBody
    public  List<User> queryUser(){
        List<User> users = userService.queryUser();
        System.out.println("11111111");
        System.out.println("最后一次测试更新提交");
        System.out.println("提交指定分支测试!!!");
        return users;
    }

    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(User user){
        userService.addUser(user);
    }
    @RequestMapping("delUser")
    @ResponseBody
    public void delUser(Integer[] ids){
        userService.delUser(ids);
    }
    //插件
   @RequestMapping("upload")
   @ResponseBody
    public String upload(HttpServletRequest request, @RequestParam(value="picFile",required=false) MultipartFile file){
        String path = FileUtil.FileUpload(file, request);
        if(path.contains("null")) {
            return null;
        }else {
            return path;
        }
    }
}
