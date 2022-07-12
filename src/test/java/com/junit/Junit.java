package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Junit {

    @Test
    public void firstNameHappy() {
        User user = new User();
        boolean output =user.firstName("Chetan");
        Assertions.assertTrue(output);
    }
    @Test
    public void firstNameSad() {
        User user = new User();
        boolean output = user.firstName("c");
        Assertions.assertFalse(output);
    }
    @Test
    public void lastNameHappy() {
        User user = new User();
        boolean output = user.lastName("Gavanali");
        Assertions.assertTrue(output);
    }
    @Test
    public void lastNameSad() {
        User user = new User();
        boolean output = user.lastName("g");
        Assertions.assertFalse(output);
    }
    @Test
    public void phoneNumberHappy() {
        User user = new User();
        boolean output = user.phoneNumber("91 9449441490");
        Assertions.assertTrue(output);
    }

    @Test
    public void phoneNumberSad() {
        User user = new User();
        boolean output = user.phoneNumber("123");
        Assertions.assertFalse(output);
    }

    @Test
    public void passwordHappy() {
        User user = new User();
        boolean output = user.password("Ab$@99A9");
        Assertions.assertTrue(output);
    }

    @Test
    public void passwordSad() {
        User user = new User();
        boolean output = user.password("aa");
        Assertions.assertFalse(output);
    }

    @Test
    public void emailHappy() {
        User user = new User();
        boolean output = user.email("abc.xyz@bl.co.in");
        Assertions.assertTrue(output);
    }

    @Test
    public void emailSad() {
        User user = new User();
        boolean output = user.email("@@gmail.com");
        Assertions.assertFalse(output);
    }

}