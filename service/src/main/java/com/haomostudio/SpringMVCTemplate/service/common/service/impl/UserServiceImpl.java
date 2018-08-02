package com.haomostudio.SpringMVCTemplate.service.common.service.impl;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.dao.impl.HmUserDao;
import com.haomostudio.SpringMVCTemplate.service.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private HmUserDao hmUserDao;
    @Override
    public int createUser(HmUser hmUser) {
        hmUserDao.createUser(hmUser);
    }
}