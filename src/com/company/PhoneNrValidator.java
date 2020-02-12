package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNrValidator {

    Scanner scan = new Scanner(System.in);
    boolean isValid = false;
    String input;
    String regex = "0{1}[\\d]{1}([\\d-]){1,3}([ \\d]){1,6}([\\d]){2}";

    void run() {
        input = enterPhoneNumber();
        validateInput(input, regex);
        if (isValid) {
            System.out.println("Your phone number is valid!");
        } else {
            System.out.println("Your phone number is not valid!");
        }
    }

    private String enterPhoneNumber() {
        System.out.println("Enter your phone number:");
        input = scan.nextLine();
        return input;
    }

    private void validateInput(String input, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(input);
        if (matcher.find() && input.length() < 14) {
            isValid = true;
        }
    }
}
