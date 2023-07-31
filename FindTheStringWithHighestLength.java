package org.coding;

import java.util.Arrays;
import java.util.List;


public class FindTheStringWithHighestLength {

    public static void main(String[] args){

        List<String> nameList = Arrays.asList("java", "microservices", "neosoft", "webwerks", "tata consultancy servies");

                nameList.parallelStream()
                .map(item -> item.length())
                .max(Integer::compareTo)
                .stream()
                .forEach(System.out::println);


    }
}
