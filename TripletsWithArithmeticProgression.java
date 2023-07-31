package org.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a sorted array of distinct positive integers, print all triplets that forms an arithmetic progression with an integral common difference.
An arithmetic progression is a sequence of numbers such that the difference between the consecutive terms is constant. For instance, sequence 5, 7, 9, 11, 13, 15, … is an arithmetic progression with a common difference of 2.
For Example:
Input:  A[] = { 5, 8, 9, 11, 12, 15 }

Output:
5 8 11
9 12 15


Input:  A[] = { 1, 3, 5, 6, 8, 9, 15 }

Output:
1 3 5
1 5 9
3 6 9
1 8 15
3 9 15
*/
public class TripletsWithArithmeticProgression {

    public static void main(String[] args){

        List<Integer> sortedList = Arrays.asList(1,3,5,6,8,9,15);

        List<List<Integer>> finalProgressionList = new ArrayList<>();

        for(int i=0; i <  sortedList.size();i++){

            for(int j=i+1; j < sortedList.size();j++){
                for(int k = j+1; k <sortedList.size();k++){
                   if((sortedList.get(k) - sortedList.get(j)) == (sortedList.get(j) - sortedList.get(i)))
                    finalProgressionList.add(Arrays.asList(sortedList.get(i), sortedList.get(j), sortedList.get(k)));
                }
            }
        }


        finalProgressionList.stream()
                .forEach(System.out::println);
    }
}
