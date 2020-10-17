package com.lamdaer.blink.service.impl;

import com.lamdaer.blink.entity.Journal;
import com.lamdaer.blink.mapper.JournalMapper;
import com.lamdaer.blink.service.JournalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 期刊 服务实现类
 * </p>
 *
 * @author Lamdaer
 * @since 2020-10-17
 */
@Service
public class JournalServiceImpl extends ServiceImpl<JournalMapper, Journal> implements JournalService {

}
