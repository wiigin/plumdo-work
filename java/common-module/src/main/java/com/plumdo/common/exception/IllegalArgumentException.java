package com.plumdo.common.exception;

/**
 * 非法参数异常
 *
 * @author wengwenhui
 * @date 2018年4月2日
 */
class IllegalArgumentException extends BaseException {

    private static final long serialVersionUID = 1L;

    IllegalArgumentException(String ret, String msg) {
        super(ret, msg);
    }

}
