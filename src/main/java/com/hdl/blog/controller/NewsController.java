package com.hdl.blog.controller;

import com.hdl.blog.entity.Article;
import com.hdl.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class NewsController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articleList")
    @ResponseBody
    public Map articleList(@RequestParam(value = "page") Integer page,
                                     @RequestParam(value = "limit") Integer limit){
        List<Article> articleList = articleService.findArticleListBypage(page, limit).getContent();
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg", "");
        map.put("data", articleList);
        return map;
    }

    @GetMapping("/deleteArticle")
    @ResponseBody
    public String deleteArticle(@RequestParam(value = "id") String id){
        articleService.deleteArticleById(id);
        return "";
    }
}
