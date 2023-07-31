/*Find maximum difference between two array elements that satisfies given constraints
Given an integer array, find the maximum difference between two elements in it such that the smaller element appears before the larger element.
For example:
Input:  { 2, 7, 9, 5, 1, 3, 5 }

Output: The maximum difference is 7.

The pair is (2, 9)*/
package org.coding;

import java.util.Scanner;

public class MaximumDifferenceBetweenArrayElements {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the "+size+" elements of the array");
        int array[] = new int[size];

        for(int i=0; i<size; i++)
            array[i] = sc.nextInt();

        int difference = 0;
        for(int i=0; i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[j] - array[i] > difference)
                    difference = array[j] - array[i];
            }
        }

        System.out.println("The highest difference is "+difference);
    }
}
