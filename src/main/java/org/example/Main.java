package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amanda", "bob", "charlie", "dave");

        names.stream().map(String::toUpperCase).forEach(name -> System.out.println(name));
    }
}