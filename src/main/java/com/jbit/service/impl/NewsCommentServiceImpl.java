package com.jbit.service.impl;

import com.jbit.dao.NewsCommentMapper;
import com.jbit.entity.NewsComment;
import com.jbit.service.NewsCommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("newsCommentService")
public class NewsCommentServiceImpl implements NewsCommentService {

    @Resource
    private NewsCommentMapper newsCommentMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertNewsComment(NewsComment newsComment) {
        return newsCommentMapper.insert(newsComment);
    }
}
