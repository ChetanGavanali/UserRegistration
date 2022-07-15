package com.exception;

@FunctionalInterface
public interface IUserRegistration {

    boolean validate(String value) throws UserRegistrationException;
}

