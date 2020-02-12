package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplifiedMailValidator {

    Scanner scan = new Scanner(System.in);
    boolean isValid = false;
    String input;
    String regex = "([a-zA-Z0-9._-]{2,})@([a-zA-Z0-9-_]{2,})\\.([a-zA-Z]{2,})";

    void run() {
        input = enterMail();
        validateInput(input, regex);
        if (isValid) {
            System.out.println("Your mail is valid!");
        } else {
            System.out.println("Your mail is not valid!");
        }
    }

    private String enterMail() {
        System.out.println("Enter your E-Mail:");
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
