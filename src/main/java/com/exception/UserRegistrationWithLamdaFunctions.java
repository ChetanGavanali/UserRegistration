package com.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationWithLamdaFunctions {

    IUserRegistration validateFname = (fName) -> {
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid First Name",
                    UserRegistrationException.ExceptionType.INVALID);
        }
    };

    IUserRegistration validateLname = (lName) -> {
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lName);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid lName", UserRegistrationException.ExceptionType.INVALID);
        }
    };

    IUserRegistration validateEmail = (email) -> {
        String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid email", UserRegistrationException.ExceptionType.INVALID);
        }
    };

    IUserRegistration validatePhone = (phone) -> {
        String regex = "^[1-9]{2}( )[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid Phone", UserRegistrationException.ExceptionType.INVALID);
        }
    };

    IUserRegistration validatePassword = (password) -> {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid Password",
                    UserRegistrationException.ExceptionType.INVALID);
        }

    };
}
