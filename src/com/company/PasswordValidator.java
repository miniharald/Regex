package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    Scanner scan = new Scanner(System.in);
    boolean isValid = false;
    String input;
    String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@£_#$%€^&+=!])(?=\\S+$).{8,}";

    void run() {
        input = enterPassword();
        validateInput(input, regex);
        if (isValid) {
            System.out.println("Your password is valid!");
        } else {
            System.out.println("Your password is not valid!");
        }
    }

    private String enterPassword() {
        System.out.println("Enter your password:");
        input = scan.nextLine();
        return input;
    }

    private void validateInput(String input, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(input);
        if (matcher.find()) {
            isValid = true;
        }
    }
}
