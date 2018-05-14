package com.jbit.dao;

import com.jbit.entity.NewsDetail;

import java.util.List;

public interface NewsDetailMapper {

    /**
     * 查询所有新闻信息
     * @return
     */
    List<NewsDetail> findNews();


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_detail
     *
     * @mbg.generated
     */
    int insert(NewsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_detail
     *
     * @mbg.generated
     */
    int insertSelective(NewsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_detail
     *
     * @mbg.generated
     */
    NewsDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(NewsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(NewsDetail record);
}