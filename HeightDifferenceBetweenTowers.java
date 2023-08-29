package org.coding;

import java.util.Arrays;

/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as
{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
The difference between
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.
The difference between
the largest and the smallest is 17-6 = 11.
*/
public class HeightDifferenceBetweenTowers {

    public static void main(String[] args){

        int K=2;
        int N=4;
        int arr[] = { 1, 5, 8, 10 };

        Arrays.sort(arr);
        boolean isCountNotReached = true;
        int count = 0;


        while (isCountNotReached){
            if(count == 0)
                arr[count++] += K;
            else{
               if(arr[count - 1] > arr[count])
                     arr[count++] += K;
                else
                   arr[count++] -= K;
            }
            if(count == arr.length -1) isCountNotReached=false;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1] - arr[0]);
    }
}
