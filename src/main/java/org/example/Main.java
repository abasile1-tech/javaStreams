package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static int doubleNumber(int num) {
        return num * 2;
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amanda", "bob", "charlie", "dave");

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperNames);

        List<Integer> numbersTimesTwo = Stream.of(1, 2, 3, 4, 5).map(Main::doubleNumber).collect(Collectors.toList());

        System.out.println(numbersTimesTwo);
    }
}