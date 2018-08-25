package com.hdl.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * (Article)表实体类
 *
 * @author hdl
 * @since 2018-08-23 00:43:35
 */
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(
            generator = "uuid"
    )
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid"
    )
    @Column(name = "article_id")
    private String articleId;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_author")
    private String articleAuthor;

    @Column(name = "article_abstract")
    private String articleAbstract;

    @Column(name = "article_status")
    private Integer articleStatus;

    @Column(name = "article_img")
    private String articleImg;

    @Column(name = "article_look")
    private Integer articleLook;

    @Column(name = "article_category")
    private String articleCategory;

    @Column(name = "article_top")
    private boolean articleTop;

    @Column(name = "article_commentCount")
    private Integer articleCommentcount;

    @Column(name = "article_readCount")
    private Integer articleReadcount;


    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @Column(name = "article_createdTime")
    private Date articleCreatedtime;

    @Column(name = "article_content")
    private String articleContent;


    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleAbstract() {
        return articleAbstract;
    }

    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public Integer getArticleLook() {
        return articleLook;
    }

    public void setArticleLook(Integer articleLook) {
        this.articleLook = articleLook;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public boolean getArticleTop() {
        return articleTop;
    }

    public void setArticleTop(boolean articleTop) {
        this.articleTop = articleTop;
    }

    public Integer getArticleCommentcount() {
        return articleCommentcount;
    }

    public void setArticleCommentcount(Integer articleCommentcount) {
        this.articleCommentcount = articleCommentcount;
    }

    public Integer getArticleReadcount() {
        return articleReadcount;
    }

    public void setArticleReadcount(Integer articleReadcount) {
        this.articleReadcount = articleReadcount;
    }

    public Date getArticleCreatedtime() {
        return articleCreatedtime;
    }

    public void setArticleCreatedtime(Date articleCreatedtime) {
        this.articleCreatedtime = articleCreatedtime;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

}