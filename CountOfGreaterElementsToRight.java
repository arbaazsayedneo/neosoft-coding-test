package org.coding;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array having distinct elements, find the surpasser count for each element in it. In other words, for each array element, find the total number of elements to its right, which are greater than it.
For example:
Input:  { 4, 6, 3, 9, 7, 10 }

Output: { 4, 3, 3, 1, 1, 0 }
*/
public class CountOfGreaterElementsToRight {

    public static void main(String[] args){

        int[] input = { 4, 6, 3, 9, 7, 10 };
        List<Integer> finalList = new ArrayList<>();
        int count = 0;
        for(int i=0; i < input.length; i++){
            for(int j = i+1; j < input.length; j++){
                if(input[i] < input[j])
                    count++;
            }
            finalList.add(count);
            count = 0;
        }

        System.out.println(finalList);
    }
}
