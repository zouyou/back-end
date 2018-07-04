package com.zoushiyou.web.util;

/**
 * 手动抛出异常
 * Author: QQ:511570155
 */
public class ZsyauthorizedException extends RuntimeException {
    public ZsyauthorizedException(String msg) {
        super(msg);
    }

    public ZsyauthorizedException() {
        super();
    }
}
