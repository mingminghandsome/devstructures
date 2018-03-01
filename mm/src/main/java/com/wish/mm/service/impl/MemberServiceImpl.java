package com.wish.mm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wish.mm.dao.sg.entity.Member;
import com.wish.mm.dao.sg.mapper.MemberMapper;
import com.wish.mm.service.MemberService;

/**
 * 
 * @author mingminghandsome
 *
 */
@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberMapper memberMapper;

    @Override
   public int deleteByPrimaryKey(Integer memberId) {
    	return memberMapper.deleteByPrimaryKey(memberId);
    }

    public int insert(Member record) {
    	return memberMapper.insert(record);
    }

    public int insertSelective(Member record) {
    	return memberMapper.insertSelective(record);
    }

    public Member selectByPrimaryKey(Integer memberId) {
    	return memberMapper.selectByPrimaryKey(memberId);
    }

    public int updateByPrimaryKeySelective(Member record) {
    	return memberMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Member record) {
    	return memberMapper.updateByPrimaryKey(record);
    }
}
