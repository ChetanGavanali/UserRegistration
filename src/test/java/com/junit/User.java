package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    final String NAME = "^[A-Z]{1}[a-z]{2,}$";
    final String EMAIL = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
    final String PHONE = "^[0-9]{2}\\s{1}[0-9]{10}$";
    final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";

    public boolean firstName(String name) {

        Pattern pattern = Pattern.compile(NAME);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean lastName(String name) {

        Pattern pattern = Pattern.compile(NAME);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean email(String email) {

        Pattern pattern = Pattern.compile(EMAIL);
        Matcher match = pattern.matcher(email);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean phoneNumber(String phone) {

        Pattern pattern = Pattern.compile(PHONE);
        Matcher match = pattern.matcher(phone);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean password(String password) {

        Pattern pattern = Pattern.compile(PASSWORD);
        Matcher match = pattern.matcher(password);
        System.out.println(match.matches());
        return match.matches();
    }
}
