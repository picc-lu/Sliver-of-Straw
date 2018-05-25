package com.example.bin.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.example.base.entity.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lu
 * @since 2018-05-25
 */
@TableName("t_article")
public class Article extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;
    /**
     * 文章被哪位管理员提交
     */
    private Integer postByAdminId;
    /**
     * 文章的类别
     */
    private Integer articleGenreId;
    /**
     * 文章的标题
     */
    private String articleTitle;
    /**
     * 文章的提交时间
     */
    private Timestamp articleTime;
    /**
     * 文章主体
     */
    private String articleBody;
    /**
     * 文章点赞数
     */
    private Integer articleLikes;
    /**
     * 文章点击数
     */
    private Integer articleClick;
    /**
     * 创建时间
     */
    private Timestamp gmtCreate;
    /**
     * 修改时间
     */
    private Timestamp gmtModified;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getPostByAdminId() {
        return postByAdminId;
    }

    public void setPostByAdminId(Integer postByAdminId) {
        this.postByAdminId = postByAdminId;
    }

    public Integer getArticleGenreId() {
        return articleGenreId;
    }

    public void setArticleGenreId(Integer articleGenreId) {
        this.articleGenreId = articleGenreId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Timestamp getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Timestamp articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    public Integer getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(Integer articleLikes) {
        this.articleLikes = articleLikes;
    }

    public Integer getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    @Override
    public String toString() {
        return "Article{" +
        ", articleId=" + articleId +
        ", postByAdminId=" + postByAdminId +
        ", articleGenreId=" + articleGenreId +
        ", articleTitle=" + articleTitle +
        ", articleTime=" + articleTime +
        ", articleBody=" + articleBody +
        ", articleLikes=" + articleLikes +
        ", articleClick=" + articleClick +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}
