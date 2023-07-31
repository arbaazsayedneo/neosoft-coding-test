package org.coding;

import java.util.ArrayList;
import java.util.List;

/*
Find the closest pair to a given sum in two sorted arrays
Given two sorted arrays, find a pair whose sum is closest to a given sum where the pair consists of elements from each array.
For example:
Input:
first[] = { 1, 8, 10, 12 }
second[] = { 2, 4, 9, 15 }
target = 11
Output: The closest pair is [1, 9]

Input:
first[] = { 10, 12, 15, 18, 20 }
second[] = { 1, 4, 6, 8 }
target = 22
Output: The closest pair is [18, 4]
*/
public class ClosetPairWithTargetSum {

    public static void main(String[] args){

        int first[] = {10,12,15,18,20};
        int second[] = {1,4,6,8};
        int target = 22;

       /* int first[] = { 1, 8, 10, 12 };
        int second[] = { 2, 4, 9, 15 };
        int target = 11;*/

        List<Integer> finalList = new ArrayList<>();
        int closest = target - first[0] + second[0];
        xyz: for(int i=0; i<first.length;i++){
            for(int j=0; j<second.length;j++){
                if((first[i]+second[j]) < target && (target - (first[i]+second[j])) < closest)
                {
                    finalList.clear();
                    finalList.add(0,first[i]);
                    finalList.add(1,second[j]);
                    continue ;
                }
                if(first[i] + second[j] == target)
                {
                    finalList.clear();
                    finalList.add(0,first[i]);
                    finalList.add(1,second[j]);
                    break xyz;
                }
            }
        }
        finalList.stream()
                        .forEach(System.out::println);
    }
}
