package com.lamdaer.blink.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lamdaer.blink.common.BlinkException;
import com.lamdaer.blink.entity.Journal;
import com.lamdaer.blink.mapper.JournalMapper;
import com.lamdaer.blink.service.JournalService;
import com.lamdaer.blink.vo.JournalVo;
import com.lamdaer.blink.vo.LikeVo;

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
    
    @Override
    public Boolean likeAdd(LikeVo likeVo) {
        return updateLike(likeVo, 1);
        
    }
    
    @Override
    public Boolean cancelLike(LikeVo likeVo) {
        return updateLike(likeVo, 0);
    }
    
    public Boolean updateLike(LikeVo likeVo, Integer operationType) {
        Journal journal = baseMapper.selectById(likeVo.getId());
        if (journal == null) {
            throw new BlinkException(20001, "journal is not exist.");
        }
        UpdateWrapper<Journal> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", likeVo.getId());
        updateWrapper.eq("type", likeVo.getType());
        if (operationType == 1) {
            updateWrapper.set("favorite_num", journal.getFavoriteNum() + 1);
            updateWrapper.set("like_status", 1);
            
        } else {
            updateWrapper.set("favorite_num", journal.getFavoriteNum() - 1);
            updateWrapper.set("like_status", 0);
        }
        int update = baseMapper.update(new Journal(), updateWrapper);
        return update > 0;
    }
}
