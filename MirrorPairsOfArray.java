package org.coding;
/*
Given an array of pairs of integers, find all symmetric pairs, i.e., pairs that mirror each other. For instance, pairs (x, y) and (y, x) are mirrors of each other.
For example:
Input:  {3, 4}, {1, 2}, {5, 2}, {7, 10}, {4, 3}, {2, 5}

Output:

{4, 3} | {3, 4}
{2, 5} | {5, 2}
*/
public class MirrorPairsOfArray {

    public static void main(String[] args){

        int array[][] = {
                {3,4},
                {1,2},
                {5,2},
                {7,10},
                {4,3},
                {2,5}
        };

        for(int i=0; i<array.length - 1;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i][0] == array[j][1] && array[i][1] == array[j][0]){
                    System.out.println("{ "+array[i][0]+","+array[i][1]+" } "+"{ "+array[j][0]+","+array[j][1]+" }");
                }
            }
        }
    }
}
