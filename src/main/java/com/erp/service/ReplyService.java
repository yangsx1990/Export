package com.erp.service;


import com.erp.model.Reply;

import java.util.List;

public interface ReplyService
{
    List<Reply> getList(Reply reply);


    Reply getReplyById(Integer id);
}
