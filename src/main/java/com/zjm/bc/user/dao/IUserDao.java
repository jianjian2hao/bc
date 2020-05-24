package com.zjm.bc.user.dao;

import com.zjm.bc.user.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao {

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
   public UserPo getUserById(String id);
}
