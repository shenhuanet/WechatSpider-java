package com.shenhua.wechat_spider.exception;

public class WechatException extends RuntimeException {

    /**
     * RuntimeException
     */
    private static final long serialVersionUID = 1L;

    public WechatException() {
        super();
    }

    public WechatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WechatException(String message) {
        super(message);
    }

    public WechatException(Throwable cause) {
        super(cause);
    }

}
