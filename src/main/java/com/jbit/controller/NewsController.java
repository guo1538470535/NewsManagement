package com.jbit.controller;

import com.jbit.entity.NewsComment;
import com.jbit.entity.NewsDetail;
import com.jbit.entity.business.JsonResult;
import com.jbit.service.NewsCommentService;
import com.jbit.service.NewsDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class NewsController {

    @Resource
    private NewsDetailService newsDetailService;

    @Resource
    private NewsCommentService newsCommentService;

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 评论页
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/view/{id}")
    public String index(@PathVariable Long id,Model model) {
        model.addAttribute("newsId",id);
        return "add";
    }

    /**
     * 查询所有新闻信息
     *
     * @return jackjson
     */
    @PostMapping("/list")
    @ResponseBody
    public List<NewsDetail> list() {
        return newsDetailService.findNews();
    }

    /**
     * 删除新闻及评论信息
     * @param id
     * @return
     */
    @RequestMapping("/del/{id}")
    @ResponseBody
    public JsonResult del(@PathVariable Long id){
        int res= newsDetailService.del(id);
        if(res!=0){
            return new JsonResult(true,"删除成功");
        }
        return new JsonResult("删除失败");
    }


    @PostMapping("/insert")
    public String insert(NewsComment newsComment){
        newsComment.setCreatedate(new Date());
        int res= newsCommentService.insertNewsComment(newsComment);
        if(res!=0){
            return "index";
        }
        return "add";
    }


    //同步请求 thymeleaf 解析
//    @GetMapping("/list")
//    public String list(Model model){
//        model.addAttribute("news",newsDetailService.findNews());
//        return "index";
//    }

}
