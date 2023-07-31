package org.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Given an unlimited supply of coins of given denominations, find the total number of distinct ways to get the desired change.
For example:
Input: S = { 1, 3, 5, 7 }, target = 8

The total number of ways is 6

{ 1, 7 }
{ 3, 5 }
{ 1, 1, 3, 3 }
{ 1, 1, 1, 5 }
{ 1, 1, 1, 1, 1, 3 }
{ 1, 1, 1, 1, 1, 1, 1, 1 }


Input: S = { 1, 2, 3 }, target = 4

The total number of ways is 4

{ 1, 3 }
{ 2, 2 }
{ 1, 1, 2 }
{ 1, 1, 1, 1 }
*/
public class CountOfGettingTheChange {
    public static void  main(String[] args){

        List<Integer> numbersList = Arrays.asList(1, 3, 5, 7);

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int count = 0;

    }
}
