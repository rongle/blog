package com.hdl.blog.controller.api;

import com.hdl.blog.common.JsonResult;
import com.hdl.blog.entity.Article;
import com.hdl.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/article")
@CrossOrigin
public class ArticleController {

    private JsonResult jsonResult = new JsonResult();

    @Autowired
    private ArticleService articleService;


    @GetMapping("articleList")
    @ResponseBody
    public JsonResult articleList(Integer page, Integer limit){
        Page articleListBypage = articleService.findArticleListBypage(page, limit);
        List<Article> articleList = articleListBypage.getContent();
        return jsonResult.success(articleList);
    }

    @PostMapping("/addArticle")
    @ResponseBody
    public JsonResult addArticle(Article article){
        Date date = new Date();
        article.setArticleCreatedtime(date);
        articleService.addArticle(article);
        return jsonResult.success();
    }

    @GetMapping("/getArticleList")
    @ResponseBody
    public JsonResult<List<Article>> articleList(){
        List<Article> articleList = articleService.getArticleList();
        return jsonResult.success(articleList);
    }

    @GetMapping("/selectArticle")
    @ResponseBody
    public JsonResult<List<Article>> selectArticle(String title){
        List<Article> articleList = articleService.selectArticleByTitle(title);
        return jsonResult.success(articleList);
    }



    @GetMapping("/updateArticle")
    @ResponseBody
    public void updateArticle(Article article){
        articleService.updateArticle(article);
    }
}
