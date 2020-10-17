package com.lamdaer.blink.vo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lamdaer
 * @createTime 2020/10/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JournalVo {
    @ApiModelProperty(value = "期刊id")
    private Long id;
    
    @ApiModelProperty(value = "期刊标题")
    private String title;
    
    @ApiModelProperty(value = "期刊内容")
    private String content;
    
    @ApiModelProperty(value = "图片链接")
    private String imageUrl;
    
    @ApiModelProperty(value = "期号")
    private Integer issue;
    
    @ApiModelProperty(value = "点赞数量")
    private Integer favoriteNum;
    
    @ApiModelProperty(value = "点赞状态 1点赞 0未点赞")
    private Integer likeStatus;
    
    @ApiModelProperty(value = "发布日期")
    private Date publishDate;
    
    @ApiModelProperty(value = "期刊类型 100电影 200音乐 300句子")
    private Integer type;
}
