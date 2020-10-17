package com.lamdaer.blink.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lamdaer
 * @createTime 2020/10/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlinkException extends RuntimeException {
    private Integer code;
    private String message;
}
