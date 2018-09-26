package com.hdl.blog.controller;


//import com.hdl.blog.config.WebSecurityConfig;
import com.hdl.blog.common.JsonResult;
import com.hdl.blog.config.WebSecurityConfig;
import com.hdl.blog.entity.User;
import com.hdl.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * (User)表控制层
 *
 * @author hdl
 * @since 2018-08-30 22:45:58
 */
@RestController
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public JsonResult admin(HttpServletRequest request, HttpSession session, String userName, String userPassword) throws Exception {
        JsonResult jsonResult = new JsonResult();
//        User userImpl = userService.getUser(user.getUserName(), user.getUserPassword());
        User userImpl = userService.getUser(userName, userPassword);


        //String verCodeInput = request.getParameter("verCode");
        String verCode = request.getSession().getAttribute("verCode").toString();

        if (userImpl != null){
//            if (verCodeInput != verCode){
//                return jsonResult.success(userImpl, "验证码错误");
//            }
            session.setAttribute(WebSecurityConfig.SESSION_KEY, userName);
            return jsonResult.success(userImpl);
        }
        return jsonResult.success();
    }
}