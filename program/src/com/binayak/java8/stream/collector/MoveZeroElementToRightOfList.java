package com.binayak.java8.stream.collector;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroElementToRightOfList {

    public static void main(String[] args) {
        List<Integer> inputs = List.of(1, -2, 0, 3, 0, 7, -1,0);

        List<Integer> output =
                Stream.concat(inputs.stream().filter(Objects::nonNull)
                        .filter(input -> input !=0).sorted(),
                        inputs.stream().filter(Objects::nonNull)
                        .filter(input -> input ==0) ).collect(Collectors.toList());

        System.out.println("the output is :: " + output);


    }



}
