package com.lamdaer.blink.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lamdaer.blink.entity.Journal;
import com.lamdaer.blink.vo.JournalVo;

/**
 * <p>
 * 期刊 服务类
 * </p>
 * @author Lamdaer
 * @since 2020-10-17
 */
public interface JournalService extends IService<Journal> {
    /**
     * 获取最新一期
     * @return 期刊vo
     */
    JournalVo getLatest();
}
