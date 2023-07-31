/*Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
Input:

X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 }

The vacant cells in X[] is represented by 0

Output:

X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }*/
package org.coding;

import java.util.Arrays;
import java.util.Scanner;

public class SortTwoArrays {

    public static void main(String args[]){
        sortArrays();
    }

    private static void sortArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array X: (m)");
        int m = sc.nextInt();
        System.out.println("Enter the size of array Y: (n) **m>=n**");
        int n = sc.nextInt();
        int[] X = new int[m];
        int[] Y = new int[n];
        try {
            if(n > m)
                throw new Exception("Value of n cannot be greater than m");
            else
            {
                System.out.println("Enter the values of array X: Note: It should have zero value exactly n number of times");
                for(int i=0; i<m; i++)
                    X[i] = sc.nextInt();
                System.out.println("Enter the values of array Y");
                for(int i=0; i<n; i++)
                    Y[i] = sc.nextInt();

                //counting for the number of zeroes
                int zeroCount = 0;
                for(int i=0; i<n; i++)
                {
                    if(X[i] == 0)
                        zeroCount++;
                }

                if(zeroCount != n)
                    throw new Exception("The number of Zeros in array X should be same as number of elements in array Y");

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // code of sorting the array
        Arrays.sort(X);

        int temp[] = new int[m-n];

        for(int i=0,j=n; i<m-n && j < m;i++,j++)
            temp[i] = X[j];

        X = temp;

        Arrays.sort(X);
        Arrays.sort(Y);

       /* System.out.println("Array X");
        for(int item : X)
            System.out.print(item+" ");*/
        System.out.println();
      /*  System.out.println("Array Y");
        for(int item : Y)
            System.out.print(item+" ");*/

        int xIndex = 0;
        int yIndex = 0;
        int zIndex = 0;

        int Z[] = new int[m];
        while(xIndex < X.length && yIndex < n)
        {
            if(X[xIndex] > Y[yIndex])
                Z[zIndex++] = Y[yIndex++];
            else if(X[xIndex] <= Y[yIndex])
                Z[zIndex++] = X[xIndex++];
        }
        while (xIndex < X.length){
            Z[zIndex++] = X[xIndex++];
        }

        while (yIndex < n){
            Z[zIndex++] = Y[yIndex++];
        }

        System.out.println();
        System.out.println("Displaying the final Sorted array");
        for(int item : Z)
            System.out.print(item+" ");
    }
}
