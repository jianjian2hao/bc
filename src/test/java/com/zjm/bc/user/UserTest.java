package com.zjm.bc.user;

import com.zjm.bc.user.po.UserPo;
import com.zjm.bc.user.service.IUserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;


@MapperScan(basePackages={"com.zjm.bc.*.dao"})
@ComponentScan(basePackages = {"com.zjm.bc"})
@SpringBootTest
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void getUserById() throws Exception {
        UserPo userPo = userService.getUserById("6e8037954493");
        System.out.println(userPo.toString());
    }

}
