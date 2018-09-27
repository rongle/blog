package com.hdl.blog.service.impl;

import com.hdl.blog.entity.Article;
import com.hdl.blog.resposity.ArticleRepository;
import com.hdl.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> selectArticleByTitle(String title) {
        return articleRepository.getArticleListByTitle(title);
    }

    @Override
    public Article getArticleByID(String articleId) {
        return articleRepository.getOne(articleId);
    }


    @Override
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    @Override
    public void deleteArticleByTitle(String title) {
        articleRepository.deleteByTitle(title);
    }

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return articleRepository.saveAndFlush(article);
    }

    @Override
    public Page<Article> findArticleListBypage(Integer page, Integer limit) {
        //Sort sort = new Sort(Sort.Direction.DESC,"articleId");
        //Pageable pageable = PageRequest.of(page, limit, sort);
        Pageable pageable = PageRequest.of(page, limit);
        return articleRepository.findAll(pageable);
    }

    @Override
    public void deleteArticleById(String articleId) {
        articleRepository.deleteById(articleId);
    }
}
