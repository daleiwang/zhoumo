package com.wuhu.zhoumo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wuhu.zhoumo.model.domain.AdminDO;
import com.wuhu.zhoumo.model.param.AdminParam;

/**
 * @author sdl
 * @date 2018/6/11
 */
@Mapper
public interface AdminDAO {

    /**
     * 根据用户名密码查询
     * 
     * @param adminParam 参数
     * @return 对象
     */
    @Select("SELECT * FROM `zhoumo`.`admin` where userName =#{userName} and password =#{password};")
    AdminDO findByUserNameAndPassword(AdminParam adminParam);
}
