package com.zjm.bc.user.service;

import com.zjm.bc.user.po.UserPo;

public interface IUserService {

    UserPo getUserById(String id) throws Exception;
}
