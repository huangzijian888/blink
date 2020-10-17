package com.lamdaer.blink.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lamdaer.blink.common.BlinkException;
import com.lamdaer.blink.common.Result;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lamdaer
 * @createTime 2020/10/17
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BlinkException.class)
    @ResponseBody
    public Result customError(BlinkException e) {
        e.printStackTrace();
        log.error(e.toString());
        return Result.error().code(e.getCode()).message(e.getMessage());
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception e) {
        e.printStackTrace();
        log.error(e.toString());
        return Result.error().message("发生了错误");
    }
    
}
