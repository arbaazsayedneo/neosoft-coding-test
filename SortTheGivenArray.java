package org.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheGivenArray {

    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1,4,5,-4,-2,6,-1,3,-3,-2);

        numList.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
