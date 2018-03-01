package com.wish.mm.service;

import com.wish.mm.dao.sg.entity.Member;

/**
 * 
 * @author mingminghandsome
 *
 */
public interface MemberService {
	int deleteByPrimaryKey(Integer memberId);

	int insert(Member record);

	int insertSelective(Member record);

	Member selectByPrimaryKey(Integer memberId);

	int updateByPrimaryKeySelective(Member record);

	int updateByPrimaryKey(Member record);
}
