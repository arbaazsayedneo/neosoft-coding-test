package org.coding;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;;
import java.util.stream.Collectors;

// Find Majority element (Boyer-Moore Majority vote Algorithm)
// Given an integer array containing duplicates, return the majority element if present. A majority element appears more than n/2 times, where n is the array size.
// For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.
// output: {2, 2, 2, 2, 2, 2}
public class FindMajorityElement {


    public static void main(String[] args){
        List<Integer> integerArray = Arrays.asList(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2);


        List<Integer> collect = integerArray.stream()
                .filter(item -> {
                    int index = 0;
                    int count = 0;
                    while (index < integerArray.size() -1 ) {
                        if (item == integerArray.get(index++))
                            count++;
                    }
                    if (count >= integerArray.size() / 2)
                        return true;

                        return false;
                })
                .collect(Collectors.toList());


        for(int item : collect)
            System.out.print(item+" ");
    }

}





 /* Map.Entry<Integer, Integer> entry = integerArray.parallelStream()
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.summingInt(count -> BigInteger.ONE.intValue())))
                .entrySet()
                .parallelStream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();

        System.out.println((entry.getValue() > Long.valueOf(integerArray.size() / 2))
                ? IntStream.range(BigInteger.ZERO.intValue(), entry.getValue())
                .boxed()
                .map(__ -> entry.getKey())
                .collect(Collectors.toList())
                : "Not valid data found");*/
