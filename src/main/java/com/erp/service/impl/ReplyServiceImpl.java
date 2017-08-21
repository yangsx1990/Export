package com.erp.service.impl;

import com.erp.mapper.ReplyMapper;
import com.erp.model.Reply;
import com.erp.service.ReplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("replyService")
@Transactional
public class ReplyServiceImpl implements ReplyService
{
    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public List<Reply> getList(Reply reply)
    {
        return replyMapper.select(reply);
    }



    @Override
    public Reply getReplyById(Integer id)
    {
        return replyMapper.selectByPrimaryKey(id);
    }
}