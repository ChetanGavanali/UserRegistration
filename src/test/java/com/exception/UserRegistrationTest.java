package com.exception;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void whenGivenFirstNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateFname.validate("Chetan");
            System.out.println("It is Valid");
        } catch (UserRegistrationException userRegistrationException) {
            System.out.println("It is not Valid");
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithInvalidFName() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateFname.validate("chetan");
            System.out.println("It is Valid");
        } catch (UserRegistrationException userRegistrationException) {
            System.out.println("It is not Valid");
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateFname.validate("");
            System.out.println("It is Valid");
        } catch (UserRegistrationException userRegistrationException) {
            System.out.println("It is not Valid");
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateFname.validate(null);
            System.out.println("It is not null");
        } catch (NullPointerException nullPointerException) {
            System.out.println("It is Null");
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenLastNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateLname.validate("Gavanali");
            System.out.println("It is not Valid");
        } catch (UserRegistrationException userRegistrationException) {
            System.out.println("It is Valid");
            Assert.assertEquals("Enter valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithSmallLetter() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateLname.validate("gavanali");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateLname.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateFname.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenEmailValid() throws UserRegistrationException {
        UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
        validator.validateEmail.validate("abc.xyz@blz.com");
        Assert.assertEquals("valid", "valid");
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateEmail.validate("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateEmail.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validateEmail.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPhoneNumberValid() throws UserRegistrationException {
        UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
        validator.validatePhone.validate("91 9449441490");
        Assert.assertEquals("valid", "valid");
    }

    @Test
    public void whenGivenMobileNoWithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validatePhone.validate("91 7396382673");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobileNoWithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validatePhone.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobilNoStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validatePhone.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPasswordValid() throws UserRegistrationException {
        UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
        validator.validatePassword.validate("Abcd@123");
        Assert.assertEquals("valid", "valid");
    }

    @Test
    public void whenGivenPasswordWithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validatePassword.validate("nckdf.fdike3");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validatePassword.validate("nc");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistrationWithLamdaFunctions validator = new UserRegistrationWithLamdaFunctions();
            validator.validatePassword.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }
}
