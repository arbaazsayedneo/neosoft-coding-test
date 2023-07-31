package org.coding;

import java.util.Arrays;

/*Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.
For Example:
Input:  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }

Output: { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 }
*/
public class SortingArraysWithZeroOne {

    public static void main(String[] args){

        int array[] = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int item: array)
        {
            if(item == 0)
                count0++;
            else if(item == 1)
                count1++;
            else
                count2++;
        }

       /* System.out.println("count0: "+count0);
        System.out.println("count3: "+count1);
        System.out.println("count2: "+count2);*/

      xyz:  for(int i=0; i<array.length;i++)
        {
            while(count0-- != 0){
                array[i] = 0;
                continue xyz;
            }
            count0 = 0;
            while(count1-- != 0){
                array[i] = 1;
                continue xyz;
            }

            count1 = 0;
            while(count2-- != 0){
                array[i] = 2;
                continue xyz;
            }
        }

        for(int item: array)
            System.out.print(item+" ");

    }


}
