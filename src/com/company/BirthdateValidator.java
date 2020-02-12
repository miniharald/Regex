package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdateValidator {

    Scanner scan = new Scanner(System.in);
    boolean isValid = false;
    String input;
    String regex = "\\d{4}[\\d-]{2,6}[\\d -+]{1}[\\d]{1,4}";

    void run() {
        input = enterBirthdate();
        validateInput(input, regex);
        if (isValid) {
            System.out.println("Your birthdate is valid!");
        } else {
            System.out.println("Your birthdate is not valid!");
        }
    }

    private String enterBirthdate() {
        System.out.println("Enter your birthdate:");
        input = scan.nextLine();
        return input;
    }

    private void validateInput(String input, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(input);
        if (matcher.find() && input.length() < 16) {
            isValid = true;
        }
    }
}
