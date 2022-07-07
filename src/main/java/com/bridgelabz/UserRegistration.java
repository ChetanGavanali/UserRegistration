package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void checkValidFirstName(String firstName) {

        boolean isFirstName;
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
        Pattern patternObject = Pattern.compile(firstNameRegex);
        if (firstName == null) {
            isFirstName = false;
        }
        Matcher matcherObject = patternObject.matcher(firstName);
        isFirstName = matcherObject.matches();

        if (isFirstName)
            System.out.println(firstName + " is Valid ");
        else
            System.err.println(firstName + " is Invalid Format");
    }

    public static void checkValidLastName(String lastName) {

        boolean isLastName;
        String lastNameRegex = "[A-Z][a-z]{3,}";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        if (lastName == null) {
            isLastName = false;
        }
        Matcher matcherObject = patternObject.matcher(lastName);
        isLastName = matcherObject.matches();

        if (isLastName)
            System.out.println(lastName + " is Valid");
        else
            System.err.println(lastName + " is Invalid Format");
    }
    public static void checkValidEmail(String email) {

        boolean isEmail;
        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        Pattern patternObject = Pattern.compile(emailRegex);
        if (email == null) {
            isEmail = false;
        }
        Matcher matcherObject = patternObject.matcher(email);
        isEmail = matcherObject.matches();

        if (isEmail)
            System.out.println(email + " is a Valid Email address");
        else
            System.out.println(email + " is Invalid Format");
    }
    public static void checkValidMobileNumber(String mobileNumber) {

        boolean isMobileNumber;
        String mobileNumberRegex = "^[0-9]{2}[ ]{1}[0-9]{10}$";
        Pattern patternObject = Pattern.compile(mobileNumberRegex);
        if (mobileNumber == null) {
            isMobileNumber = false;
        }
        Matcher matcherObject = patternObject.matcher(mobileNumber);
        isMobileNumber = matcherObject.matches();

        if (isMobileNumber)
            System.out.println(mobileNumber + " is a Valid  Mobile Number");
        else
            System.out.println(mobileNumber + " is Invalid Format");
    }
    public static void checkValidPassword(String password) {

        boolean isPassword;
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@])*).{8,}";
        Pattern patternObject = Pattern.compile(passwordRegex);
        if (password == null) {
            isPassword = false;
        }
        Matcher matcherObject = patternObject.matcher(password);
        isPassword = matcherObject.matches();

        if (isPassword)
            System.out.println(password + " is a Valid  Password");
        else
            System.out.println(password + " Invalid Password");
    }

        public static void main(String[] args) {

        System.out.println("Welcome To User Registration");
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = scannerObject.next();
        checkValidFirstName(firstName);

        System.out.println("Enter Your Last Name");
        String lastName = scannerObject.next();
        checkValidLastName(lastName);

        System.out.println("Enter Your Email Address");
        String email = scannerObject.next();
        checkValidEmail(email);

        System.out.println("Enter Your Mobile Number");
        String mobileNumber = scannerObject.next();
        checkValidMobileNumber(mobileNumber);

        System.out.println("Enter Your Password");
        String password = scannerObject.next();
        checkValidPassword(password);

        scannerObject.close();
    }
}