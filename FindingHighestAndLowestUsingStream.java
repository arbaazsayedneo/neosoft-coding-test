package org.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingHighestAndLowestUsingStream {

    public static void main(String[] args){
        List<Integer> numberList = Arrays.asList(44,11,55,22,44,87,45,56,32,56,44,35,24,76);

        Integer highest = numberList.parallelStream()
                .max(Comparator.comparing(Integer::intValue))
                .get();

        Integer minimum = numberList.parallelStream()
                .min(Comparator.comparing(Integer::intValue))
                .get();


        System.out.println("Maximum "+highest);
        System.out.println("Minimum "+minimum);
    }
}
