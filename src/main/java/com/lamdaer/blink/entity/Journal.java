package com.lamdaer.blink.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 期刊
 * </p>
 * @author Lamdaer
 * @since 2020-10-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Journal对象", description = "期刊")
public class Journal implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "期刊id")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
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
    
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    
    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    
    
}
