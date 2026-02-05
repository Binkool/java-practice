package com.binayak.java8.stream.collector;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindDuplicatesFromList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 2, 4, 3, 7);

        Map<Integer, Long> collectedNum = numbers.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println("The collected Map is :: "+ collectedNum);
    }
}
