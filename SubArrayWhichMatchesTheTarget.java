package org.coding;

import java.util.ArrayList;
import java.util.List;

/*
Find a subarray having the given sum in an integer array.
For example:
Input:  nums[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, target = 15
Output: {6, 0, 9}

Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = 15
Output: {1, -4, 7, 6, 1, 4} or {4, 1, 10}

Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = -3
Output: {1, -4} or {-7, 1, -4, 7}
*/
public class SubArrayWhichMatchesTheTarget {

    public static void main(String[] args){

        int num[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        List<Integer> finalList = new ArrayList<>();
        int target = 15;

        int sum = 0;
        for(int i=0;i<num.length;i++){
            finalList.add(num[i]);
            sum += num[i];
            for(int j=i+1; j<num.length;j++){
                sum += num[j];
                if(sum==target){
                    finalList.add(num[j]);
                    System.out.println(finalList);
                    sum = 0;
                    finalList.clear();
                }
            }
            sum=0;
            finalList.clear();
        }
    }
}
