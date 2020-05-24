package com.zjm.bc.user.service.impl;

import com.zjm.bc.user.dao.IUserDao;
import com.zjm.bc.user.po.UserPo;
import com.zjm.bc.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserPo getUserById(String id) throws Exception {
        return userDao.getUserById(id);
    }
}
