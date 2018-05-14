package com.jbit.service.impl;

import com.jbit.dao.NewsCommentMapper;
import com.jbit.dao.NewsDetailMapper;
import com.jbit.entity.NewsDetail;
import com.jbit.service.NewsDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("newsDetailService")
public class NewsDetailServiceImpl implements NewsDetailService {

    @Resource
    private NewsDetailMapper newsDetailMapper;
    @Resource
    private NewsCommentMapper newsCommentMapper;

    @Override
    public List<NewsDetail> findNews() {
        return newsDetailMapper.findNews();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int del(Long id) {
        int res=newsCommentMapper.deleteByNewsId(id); //删除评论(子表)
        res+= newsDetailMapper.deleteByPrimaryKey(id); //删除主表
        return res;
    }
}
