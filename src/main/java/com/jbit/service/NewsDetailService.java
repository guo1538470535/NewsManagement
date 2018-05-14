package com.jbit.service;

import com.jbit.entity.NewsDetail;

import java.util.List;

public interface NewsDetailService {

    List<NewsDetail> findNews();

    int del(Long id);
}
