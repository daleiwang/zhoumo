package com.wuhu.zhoumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuhu.zhoumo.config.CodeEnum;
import com.wuhu.zhoumo.dao.AdminDAO;
import com.wuhu.zhoumo.model.domain.AdminDO;
import com.wuhu.zhoumo.model.dto.AdminDTO;
import com.wuhu.zhoumo.model.param.AdminParam;

/**
 * @author sdl
 * @date 2018/6/12
 */
@RestController
public class AdminController {

    /**
     * DAO
     */
    @Autowired
    private AdminDAO adminDAO;

    /**
     * 登录
     * 
     * @param adminParam 登录参数
     * @return
     */
    @GetMapping("login")
    public AdminDTO login(AdminParam adminParam) {
        AdminDTO adminDTO = null;
        AdminDO adminDO = adminDAO.findByUserNameAndPassword(adminParam);
        if (null != adminDO) {
            adminDTO = new AdminDTO(CodeEnum.SUCCESS);
        } else {
            adminDTO = new AdminDTO(CodeEnum.LOGIN_ERROR);
        }
        return adminDTO;
    }
}
