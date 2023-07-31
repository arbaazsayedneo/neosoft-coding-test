
/*Replace every array element with the product of every other element
Given an integer array, replace each element with the product of every other element without using the division operator.
For example:
Input:  { 1, 2, 3, 4, 5 }
Output: { 120, 60, 40, 30, 24 }

Input:  { 5, 3, 4, 2, 6, 8 }
Output: { 1152, 1920, 1440, 2880, 960, 720 }*/

package org.coding;

import java.util.Scanner;


public class MultipleOfEveryOtherNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<size; i++)
        array[i] = sc.nextInt();

        int product = 1;

        System.out.println("================||||||||||||||================================");
        System.out.println();
        int[] products = new int[size];
       for(int i=0; i<size; i++)
       {
           for(int j=0; j<size; j++){
               if(j==i)
                   continue;
               else
                   product *= array[j];

           }
           products[i] = product;
           product = 1;
       }

       for(int item: products)
           System.out.print(item+"  ");


        System.out.println();
        System.out.println();

        System.out.println("================||||||||||||||================================");
    }
}
