package com.lamdaer.blink.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lamdaer.blink.entity.Journal;
import com.lamdaer.blink.mapper.JournalMapper;
import com.lamdaer.blink.service.JournalService;
import com.lamdaer.blink.vo.JournalVo;

/**
 * <p>
 * 期刊 服务实现类
 * </p>
 * @author Lamdaer
 * @since 2020-10-17
 */
@Service
public class JournalServiceImpl extends ServiceImpl<JournalMapper, Journal> implements JournalService {
    @Override
    public JournalVo getLatest() {
        Journal latest = baseMapper.getLatest();
        JournalVo journalVo = new JournalVo();
        BeanUtils.copyProperties(latest, journalVo);
        return journalVo;
    }
}
