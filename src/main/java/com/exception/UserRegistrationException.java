package com.exception;

public class UserRegistrationException extends Throwable {
    public ExceptionType exceptionType;
    public String message;

    public enum ExceptionType {
        EMPTY, NULL, INVALID;
    }

    public UserRegistrationException(ExceptionType exceptionType, String message) {
        this.exceptionType = exceptionType;
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserRegistrationException{" + "exceptionType=" + exceptionType + ", message='" + message + '\'' + '}';
    }

}
