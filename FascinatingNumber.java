package org.coding;

import java.util.Arrays;

/*
Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
Example 1:

        Input:
        N = 192
        Output: Fascinating
        Explanation: After multiplication with 2
        and 3, and concatenating with original
        number, number will become 192384576
        which contains all digits from 1 to 9.
        Example 2:

        Input:
        N = 853
        Output: Not Fascinating
        Explanation: It's not a fascinating
        number.
*/
public class FascinatingNumber {

    public static void main(String[] args){

        int inputNumber = 192;

        String numberString = "";

        for(int i=1; i<=3; i++)
            numberString += (inputNumber * i);

        // System.out.println("Number: "+numberString);

        char[] sortedArray = new char[numberString.length()];

        for(int i = 0; i<numberString.length();i++){
            sortedArray[i] = numberString.charAt(i);
        }

        Arrays.sort(sortedArray);

        String finalString = null;
        for(int i=0; i < sortedArray.length;i++){
            finalString += sortedArray[i];
        }

        if(finalString.contains("123456789"))
            System.out.println("Facinating");
        else
            System.out.println("Not Fascinating");
    }
}
