package org.coding;

import java.util.Arrays;
import java.util.List;

/*Find the largest subarray having an equal number of 0’s and 1’s
Given a binary array containing 0’s and 1’s, find the largest subarray with equal numbers of 0’s and 1’s.
For Example:
Input:  { 0, 0, 1, 0, 1, 0, 0 }

Output: Largest subarray is { 0, 1, 0, 1 } or { 1, 0, 1, 0 }*/
public class LargestSubArrayWithZeroAndOne {

    public static void main(String args[]){
        List<Integer> binaryArray = Arrays.asList(0,0,1,0,1,0,0);

        int zeroCount = 0;
        int oneCount = 0;

        // checking if the size is even and thgen further code

        if(binaryArray.size() % 2 == 0){

            //check if count of zero and one match
            for (int item : binaryArray)
            {
                if (item == 0)
                    zeroCount++;
                else
                    oneCount++;
            }
            if(zeroCount == oneCount)
            {
                for (int item : binaryArray)
                    System.out.print(item + " ");
            }
            else {
                if(zeroCount < oneCount)
                {
                    for(int i=0; i<zeroCount;i++)
                        System.out.print(" 1, 0 ");
                }
                else
                {
                    for (int i=0; i<oneCount; i++)
                        System.out.print("1, 0, ");
                }
            }
        }
        else {
            for (int item : binaryArray)
            {
                if (item == 0)
                    zeroCount++;
                else
                    oneCount++;
            }
            if(zeroCount < oneCount)
            {
                for(int i=0; i<zeroCount;i++)
                    System.out.print(" 1, 0 ");
            }
            else
            {
                for (int i=0; i<oneCount; i++)
                    System.out.print("1, 0, ");
            }
        }
    }
}
