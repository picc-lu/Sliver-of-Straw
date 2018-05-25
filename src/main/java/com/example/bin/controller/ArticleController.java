package com.example.bin.controller;


import com.example.bin.entity.Article;
import com.example.bin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Lu
 * @since 2018-05-24
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {this.articleService = articleService;}

    @RequestMapping("/CRUD/{id}")
    @ResponseBody
    public Article selectArticleById(@PathVariable("id") Long id) {
        return articleService.selectById(id);
    }
}

