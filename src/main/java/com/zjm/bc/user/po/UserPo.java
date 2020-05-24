package com.zjm.bc.user.po;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString(of = {"userName","password"},exclude = {"id"})
public class UserPo {

    private String id;

    private String userName;

    private String password;

}
