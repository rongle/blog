package com.hdl.blog.controller;

import com.hdl.blog.config.WebSecurityConfig;
import com.hdl.blog.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ViewController {

    @GetMapping("/index")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Map map){
        map.put("username", username);
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "page/login/login";
    }

    @GetMapping("main")
    public String main(){
        return "page/main";
    }

    @GetMapping("newsList")
    public String newsList(){
        return "page/news/newsList";
    }

    @GetMapping("newsAdd")
    public String newsAdd(){
        return "page/news/newsAdd";
    }

    @GetMapping("images")
    public String images(){
        return "page/img/images";
    }

    @GetMapping("404")
    public String error(){
        return "page/404";
    }

    @GetMapping("userList")
    public String userList(){
        return "page/user/userList";
    }

    @GetMapping("userGrade")
    public String userGrade(){
        return "page/user/userGrade";
    }

    @GetMapping("userInfo")
    public String userInfo(){
        return "page/user/userInfo";
    }

    @GetMapping("userAdd")
    public String userAdd(){
        return "page/user/userAdd";
    }

    @GetMapping("changePwd")
    public String changePwd(){
        return "page/user/changePwd";
    }

    @GetMapping("basicParameter")
    public String basicParameter(){
        return "page/systemSetting/basicParameter";
    }

    @GetMapping("logs")
    public String logs(){
        return "page/systemSetting/logs";
    }

    @GetMapping("linkList")
    public String linkList(){
        return "page/systemSetting/linkList";
    }

    @GetMapping("icons")
    public String icons(){
        return "page/systemSetting/icons";
    }

    @GetMapping("linksAdd")
    public String linksAdd(){
        return "page/systemSetting/linksAdd";
    }

    @GetMapping("addressDoc")
    public String addressDoc(){
        return "page/doc/addressDoc";
    }

    @GetMapping("bodyTabDoc")
    public String bodyTabDoc(){
        return "page/doc/bodyTabDoc";
    }

    @GetMapping("navDoc")
    public String navDoc(){
        return "page/doc/navDoc";
    }

//
//    @GetMapping("")
//    public String (){
//        return "page/";
//    }


}
