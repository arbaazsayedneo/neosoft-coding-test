package org.coding.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AverageOfAllNumbersInGivenList {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(43,23,54,12,54,78,45,34,55,34);
        int sum = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
         sum+= iterator.next();

        System.out.println("Average: "+(sum/ numbers.size()));
    }
}
