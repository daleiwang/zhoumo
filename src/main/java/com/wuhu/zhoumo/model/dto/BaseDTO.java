package com.wuhu.zhoumo.model.dto;

import com.wuhu.zhoumo.config.CodeEnum;

import lombok.Data;

/**
 * @author sdl
 * @date 2018/6/15
 */
@Data
public class BaseDTO {

    /**
     * 成功状态
     */
    private Boolean success;
    /**
     * CODE
     */
    private String code;
    /**
     * message
     */
    private String message;

    /**
     * 构造方法
     */
    public BaseDTO(CodeEnum codeEnum) {
        this.code = codeEnum.code();
        this.success = codeEnum.success();
        this.message = codeEnum.message();
    }
}
