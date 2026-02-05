package com.binayak.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
 * Given a list of integers. Find even integers
 *
 */
public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> givenNumbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        givenNumbers.stream().filter(Objects::nonNull).filter(number -> number % 2 == 0).forEach(System.out::println);
    }

}
