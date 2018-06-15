package com.wuhu.zhoumo.config;

/**
 * @author sdl
 * @date 2018/6/15
 */
public enum CodeEnum {
    /**
     * 操作成功
     */
    SUCCESS(true, "1000", "操作成功"),
    /**
     * 数据不存在
     */
    DATA_NOT_FOUND(false, "1001", "数据不存在"),
    /**
     * 数据删除失败
     */
    DELETE_FAILED(false, "1002", "数据删除失败"),
    /**
     * 数据新增失败
     */
    INSERT_FAILED(false, "1003", "数据新增失败"),
    /**
     * 数据更新失败
     */
    UPDATE_FAILED(false, "1004", "数据更新失败"),
    /**
     * 接口访问超时
     */
    SOCKET_TIMEOUT(false, "1005", "接口访问超时"),
    /**
     * 加密失败
     */
    ENCRYPT_ERROR(false, "1006", "加密失败"),
    /**
     * 解密失败
     */
    DECRYPT_ERROR(false, "1007", "解密失败"),
    /**
     * 参数异常
     */
    PARAMS_ERROR(false, "1008", "参数异常"),
    /**
     * 服务器内部错误
     */
    UNKNOWN_ERROR(false, "1009", "服务器内部错误"),
    /**
     * 用户名或密码错误
     */
    LOGIN_ERROR(false, "1010", "用户名或密码错误");

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
    CodeEnum(Boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    /**
     * 结果
     *
     * @return 操作结果
     */
    public Boolean success() {
        return this.success;
    }

    /**
     * 编号
     *
     * @return 操作结果编号
     */
    public String code() {
        return this.code;
    }

    /**
     * 说明
     *
     * @return 操作结果说明
     */
    public String message() {
        return this.message;
    }
}
