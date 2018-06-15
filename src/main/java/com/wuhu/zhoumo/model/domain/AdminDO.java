package com.wuhu.zhoumo.model.domain;

import lombok.Data;

/**
 * @author sdl
 * @date 2018/6/12
 */
@Data
public class AdminDO {

    /**
     * id
     */
    private int id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

}
