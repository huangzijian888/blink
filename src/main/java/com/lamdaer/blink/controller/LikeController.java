package com.lamdaer.blink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamdaer.blink.common.Result;
import com.lamdaer.blink.service.JournalService;
import com.lamdaer.blink.vo.LikeVo;

import io.swagger.annotations.Api;

/**
 * @author lamdaer
 * @createTime 2020/10/17
 */
@Api(tags = "点赞操作")
@RestController
@RequestMapping("/blink/like")
@CrossOrigin
public class LikeController {
    @Autowired
    private JournalService journalService;
    
    @PostMapping
    public Result add(@RequestBody LikeVo likeVo) {
        journalService.likeAdd(likeVo);
        return Result.ok();
    }
    
    @PostMapping("cancel")
    public Result cancel(@RequestBody LikeVo likeVo) {
        journalService.cancelLike(likeVo);
        return Result.ok();
    }
}
