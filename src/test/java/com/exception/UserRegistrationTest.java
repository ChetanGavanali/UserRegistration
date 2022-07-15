package com.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void whenGivenFirstNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.fName("Chetan");
        Assertions.assertEquals("valid", firstName);
    }

    @Test
    public void whenGivenFirstNameWithInvalidFName() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.fName("chetan");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.fName(" ");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.fName(null);
        } catch (NullPointerException nullPointerException) {
            Assertions.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenLastNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.lName("Gavanali");
        Assertions.assertEquals("valid", lastName);
    }

    @Test
    public void whenGivenLastNameWithSmallLetter() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.lName("Gavanali");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter a valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.lName("");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.lName(null);
        } catch (NullPointerException nullPointerException) {
            Assertions.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenEmailValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String Email = validator.email("abc.xyz@blz.com");
        Assertions.assertEquals("valid", Email);
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.email("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter valid Email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.email("");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter valid Email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.email(null);
        } catch (NullPointerException nullPointerException) {
            Assertions.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPhoneNumberValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.number("91 9449441490");
        Assertions.assertEquals("valid", PhoneNo);
    }

    @Test
    public void whenGivenMobileNoWithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.number("91 9876544321");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobileNoWithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.number("");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter the Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobilNoStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.number(null);
        } catch (NullPointerException nullPointerException) {
            Assertions.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPasswordValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String password = validator.password("Abcd@123");
        Assertions.assertEquals("valid", password);
    }

    @Test
    public void whenGivenPasswordWithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.password("nckdf.fdike3");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter valid password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.password("");
        } catch (UserRegistrationException userRegistrationException) {
            Assertions.assertEquals("Enter Password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.password(null);
        } catch (NullPointerException nullPointerException) {
            Assertions.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }
}
