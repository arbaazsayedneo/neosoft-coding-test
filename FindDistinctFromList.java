package org.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctFromList {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Arbaaz", "Saurabh", "Arbaaz", "vedant", "Acchutam", "Arbaaz");
        names.stream()
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
