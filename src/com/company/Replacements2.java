package com.company;

public class Replacements2 {

    private String stringToFix = "hej      på  dig\n" +
            "   hejsan\n" +
            " hej      \n" +
            "     hej    hej";

    void fixString() {

        String newString = "";
        String[] array = stringToFix.split("\n");
        for (String line : array) {
            newString += line
                    .trim()
                    .replaceAll(" +", " ") + "\n";
        }
        System.out.println(newString);
    }
}
