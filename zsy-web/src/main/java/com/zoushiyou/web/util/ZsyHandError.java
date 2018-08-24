package com.zoushiyou.web.util;

/**
 * 手动抛出异常
 * Author: QQ:511570155
 */
public class ZsyHandError extends RuntimeException {
    public ZsyHandError(String msg) {
        super(msg);
    }

    public ZsyHandError() {
        super();
    }
}
