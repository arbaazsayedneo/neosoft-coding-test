package org.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Find the smallest window in an array sorting which will make the entire array sorted
Given an integer array, find the smallest window sorting which will make the entire array sorted in increasing order.
For example:
Input:  { 1, 2, 3, 7, 5, 6, 4, 8 }
Output: Sort the array from index 3 to 6

Input:  { 1, 3, 2, 7, 5, 6, 4, 8 }
Output: Sort the array from index 1 to 6
*/
public class SmallestWindowForSorting {

    public static void main(String[] args){

        int input[] = { 1, 3, 2, 7, 5, 6, 4, 8 };  //{ 1, 2, 3, 7, 5, 6, 4, 8 };

        int copy[] = new int[input.length];

        for(int i=0; i<input.length;i++)
            copy[i] = input[i];

        List<Integer> indexPair = new ArrayList<>(2);
        Arrays.sort(copy);

        XYZ: for(int i=0; i<input.length; i++){
            if(input[i] != copy[i]) {
                indexPair.add(i);
                for (int j = input.length - 1; j >= 0; j--) {
                    if (input[j] != copy[j]) {
                        indexPair.add(j);
                        break XYZ;
                    }
                }
            }
        }

        System.out.println("Index: "+indexPair);
    }
}
