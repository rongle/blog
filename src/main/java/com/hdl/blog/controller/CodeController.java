package com.hdl.blog.controller;

import com.hdl.blog.util.VerifyCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

@Controller
public class CodeController {

    @GetMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws Exception{

        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", -1);

        response.setContentType("image/jpeg");

        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入会话session
        HttpSession session = request.getSession(true);
        //删除以前的
        session.removeAttribute("verCode");
        session.setAttribute("verCode", verifyCode.toLowerCase());

        int w = 116, h = 36;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }
}
