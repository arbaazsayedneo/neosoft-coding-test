package org.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Find index of 0 to be replaced to get the maximum length sequence of continuous ones
Given a binary array, find the index of 0 to be replaced with 1 to get the maximum length sequence of continuous ones.
For example, consider the array { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }. We need to replace index 7 to get the continuous sequence of length 6 containing all 1’s.*/
public class FindPositionOfZero {

    public static void main(String[] args){

        List<Integer> binaryList = Arrays.asList(0, 0, 1, 0, 1, 1, 1, 0, 1, 1);

        List<List<Integer>> combinationsOfOnes = new ArrayList<>();
        int index = 0;
        for(int i=0; i<binaryList.size(); i++){
            if(binaryList.get(i) == 1){
                combinationsOfOnes.get(index++).add(i);
            }
        }

    }
}
