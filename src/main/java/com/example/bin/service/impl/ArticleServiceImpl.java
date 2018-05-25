package com.example.bin.service.impl;

import com.example.bin.entity.Article;
import com.example.bin.mapper.ArticleMapper;
import com.example.bin.service.ArticleService;
import com.example.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lu
 * @since 2018-05-25
 */
@Service
public class ArticleServiceImpl extends BaseServiceImpl<ArticleMapper, Article> implements ArticleService {

}
