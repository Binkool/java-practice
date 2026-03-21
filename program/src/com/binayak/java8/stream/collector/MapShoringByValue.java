
package com.binayak.java8.stream.collector;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapShoringByValue {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A",12);
        inputMap.put("D",22);
        inputMap.put("F",15);
        inputMap.put("C",10);
        inputMap.put("B",11);
        inputMap.put("K",9);
        inputMap.put("M",25);
        inputMap.put("L",7);
        System.out.println("input Map is  :: "+ inputMap);
        Map<String, Integer> sortedByValueMap =
                inputMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2)-> e1, LinkedHashMap::new));
       System.out.println("output map is :: "+ sortedByValueMap);
         }
        }
