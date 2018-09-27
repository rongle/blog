package com.hdl.blog.controller.api;

import com.hdl.blog.common.JsonResult;
import com.hdl.blog.entity.Menu;
import com.hdl.blog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private JsonResult jsonResult = new JsonResult();

    @Autowired
    private MenuService menuService;

    @PostMapping("/addMenu")
    @ResponseBody
    public JsonResult addMenu(Menu menu){
        menuService.addMenu(menu);
        return jsonResult.success();
    }

    @GetMapping("/getMenu")
    @ResponseBody
    public JsonResult getMenu(){
        List<Menu> menuList = menuService.findAll();
        return jsonResult.success(menuList);
    }

}
