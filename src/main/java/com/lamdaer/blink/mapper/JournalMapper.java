package com.lamdaer.blink.mapper;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lamdaer.blink.entity.Journal;

/**
 * <p>
 * 期刊 Mapper 接口
 * </p>
 * @author Lamdaer
 * @since 2020-10-17
 */
public interface JournalMapper extends BaseMapper<Journal> {
    /**
     * 通过issue获取最新一期的期刊
     * @return
     */
    @Select("select * from journal order by issue desc limit 1")
    Journal getLatest();
}
