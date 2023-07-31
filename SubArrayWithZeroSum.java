/*Print all subarrays with 0 sum
Given an integer array, print all subarrays with zero-sum.
For  example:
Input:  { 4, 2, -3, -1, 0, 4 }

Subarrays with zero-sum are

{ -3, -1, 0, 4 }
{ 0 }

Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

Subarrays with zero-sum are

{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }*/
package org.coding;

import java.util.Scanner;

public class SubArrayWithZeroSum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<size; i++)
            array[i] = sc.nextInt();

        // finding sub arrays with sum 0

        int sum = 0;

        for(int i=0; i<size; i++)
        {
            for(int j=i; j<size; j++){
                if(array[i] == 0){
                    System.out.println(array[i]);
                    break;
                }
                else
                    sum += array[j];

                if(sum == 0)
                {
                    for(int k = i; k<=j; k++)
                        System.out.print(array[k]+" ");
                }
            }
            System.out.println();
            sum = 0;
        }

    }
}
