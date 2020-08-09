package com.upgrad.hiringWheels.Exception;

public class UserNotRegisterException extends Exception{
    public UserNotRegisterException() {
    }

    public UserNotRegisterException(String message) {
        super(message);
    }

    public UserNotRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotRegisterException(Throwable cause) {
        super(cause);
    }

    public UserNotRegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
