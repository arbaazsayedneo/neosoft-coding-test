package org.coding;
/*
Write code to print all combinations of positive integers in increasing order that sum to a given positive number.
For Example:
Input:  N = 3

1 1 1
1 2
3

Input:  N = 4

1 1 1 1
1 1 2
1 3
2 2
4

Input:  N = 5

1 1 1 1 1
1 1 1 2
1 1 3
1 2 2
1 4
2 3
5
*/
// Solution referred from https://www.techiedelight.com/print-combinations-integers-sum-given-number/
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintAllNumbersWhichMakeTheTargetSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        findCombination(target);
    }

    private static void findCombination(int target){
        int combinationList[] = new int[target];
        int startIndex= 0;
        printCombinations(combinationList,startIndex,target,target);
    }

    private static void printCombinations(int[] combinationList,int startIndex, int target, int sumLeft){
        int prevNum = (startIndex > 0 )? combinationList[startIndex-1]:1;
        for(int k=prevNum; k<=target; k++){

            combinationList[startIndex] = k;

            if(sumLeft  > k)
                printCombinations(combinationList,startIndex + 1,target,sumLeft-k);

            if(sumLeft == k)
                System.out.println(Arrays.stream(combinationList).limit(startIndex+1)
                        .boxed()
                        .collect(Collectors.toList()));

        }
    }
}
