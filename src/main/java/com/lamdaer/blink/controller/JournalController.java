package com.lamdaer.blink.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamdaer.blink.common.Result;
import com.lamdaer.blink.service.JournalService;
import com.lamdaer.blink.vo.JournalVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 期刊 前端控制器
 * </p>
 * @author Lamdaer
 * @since 2020-10-17
 */
@Api(tags = "期刊")
@RestController
@RequestMapping("/blink/journal")
@CrossOrigin
public class JournalController {
    @Autowired
    private JournalService journalService;
    
    @ApiOperation("获取最新一期")
    @GetMapping("latest")
    public Result getLatest() {
        JournalVo latest = journalService.getLatest();
        return Result.ok().data("latest", latest);
    }
    
}

