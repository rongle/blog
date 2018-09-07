package com.hdl.blog.controller.api;

import com.hdl.blog.common.JsonResult;
import com.hdl.blog.entity.User;
import com.hdl.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private JsonResult jsonResult = new JsonResult();

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    @ResponseBody
    public JsonResult getUser(User user){
        User userImpl = userService.getUser(user.getUserName(), user.getUserPassword());
        if (userImpl != null){
            return jsonResult.success(userImpl);
        }else {
            return jsonResult.success();
        }
    }
}
