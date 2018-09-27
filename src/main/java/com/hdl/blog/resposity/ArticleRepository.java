package com.hdl.blog.resposity;

import com.hdl.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository  extends JpaRepository<Article, String>, JpaSpecificationExecutor<Article> {

    @Query(value = "select * from article a where a.articleTitle like CONCAT('%',:articleTitle,'%')", nativeQuery = true)
    List<Article> getArticleListByTitle(@Param("articleTitle") String articleTitle);

    @Query(value = "delete * from article a where a.title like CONCAT('%',:articleTitle,'%')", nativeQuery = true)
    void deleteByTitle(@Param("articleTitle") String articleTitle);

    @Query(value = "select count(article0_.article_id) as col_0_0_ from article article0", nativeQuery = true)
    Integer totalArticles();

}
