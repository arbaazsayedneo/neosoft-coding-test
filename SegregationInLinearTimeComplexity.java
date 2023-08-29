package org.coding;
/*
Given an array of positive and negative integers, segregate them in linear time and constant space. The output should print all negative numbers, followed by all positive numbers.
For example:
Input:  [9, -3, 5, -2, -8, -6, 1, 3]
Output: [-3, -2, -8, -6, 5, 9, 1, 3]
*/
public class SegregationInLinearTimeComplexity {

    public static void main(String[] args){

        int[] input = {9,-3,5,0,-8,-6,1,3};

        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        for(int index=0; index < input.length; index++){
            if(input[index] > 0)
                positiveCount++;
            else if(input[index] == 0)
                negativeCount++;
            else
                zeroCount++;
        }

        int zeroIndex = 0;
        if(zeroCount > 0)
            zeroIndex = negativeCount;


        int finalList[] = new int[input.length];
        int negetiveInsertionCount = 0;
        int positiveInsertionCount = (zeroCount == 0) ? negativeCount - 1 : (negativeCount+zeroCount) ;

        // System.out.println("negativeInsertionCount: "+negetiveInsertionCount);
        // System.out.println("positiveInsertionCount: "+positiveInsertionCount);
        // System.out.println("ZeroIndex: "+zeroIndex);

        for(int index = 0; index < input.length; index++){
            // System.out.println("Element: "+input[index]);
            if(input[index] < 0){
                // System.out.println("case 1");
                finalList[negetiveInsertionCount++] = input[index];
            }
            else if(input[index] > 0){
                // System.out.println("case 2");
                finalList[positiveInsertionCount++] = input[index];
            }
            else{
                // System.out.println("case 3");
                finalList[zeroIndex++] = input[index];
            }
        }


        // printing the array
        for(int item: finalList)
            System.out.print(item+" ");
    }
}
