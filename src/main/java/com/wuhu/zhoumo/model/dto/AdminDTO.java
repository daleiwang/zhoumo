package com.wuhu.zhoumo.model.dto;

import com.wuhu.zhoumo.config.CodeEnum;

import lombok.Data;

/**
 * @author sdl
 * @date 2018/6/11
 */
@Data
public class AdminDTO extends BaseDTO {

    /**
     * 构造方法
     *
     * @param codeEnum
     */
    public AdminDTO(CodeEnum codeEnum) {
        super(codeEnum);
    }
}
