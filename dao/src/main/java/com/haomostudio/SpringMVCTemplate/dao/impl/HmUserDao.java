package com.haomostudio.SpringMVCTemplate.dao.impl;


import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;

public interface HmUserDao {
    int deleteByPrimaryKey(String id);

    int insert(HmUser record);

    int createUser(HmUser record);

    HmUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HmUser record);

    int updateByPrimaryKey(HmUser record);


}