package com.lankin.rest.service;

import com.lankin.rest.model.Article;

import java.util.List;

public interface ArticleService {

    Article saveArticle (Article article);
    List <Article> getAllArticles();
}
