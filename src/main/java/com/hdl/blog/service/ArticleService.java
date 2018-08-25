package com.hdl.blog.service;

import com.hdl.blog.entity.Article;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleService {

    List<Article> getArticleList();

    Page<Article> findArticleListBypage(Integer page, Integer size);

    Article getArticleByID(String articleId);

    List<Article> selectArticleByTitle(String articleTitle);

    void deleteArticle(Article article);

    void deleteArticleById(String articleId);

    void deleteArticleByTitle(String articleTitle);

    Article addArticle(Article article);

    Article updateArticle(Article article);
}
