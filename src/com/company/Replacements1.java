package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Replacements1 {

    String stringToFix = "hej\n" +
            "hejsan1\n" +
            "\n" +
            "hall100å\n" +
            "what's up";

    void fixString() {
        String newString = stringToFix.replaceAll("[0-9]", "");
        List<String> list = Arrays.asList(newString.split("\n"));
        List<String> newList = list
                .stream()
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}
