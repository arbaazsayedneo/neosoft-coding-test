package org.coding;
/*
Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
For example,
Input:  {1, 2, 3}, k = 2
Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}

Input:  {1, 2, 3, 4}, k = 2
Output: {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}

Input:  {1, 2, 1}, k = 2
Output: {1, 1}, {1, 2}, {2, 2}
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationsOfElementsInArrayWithGivenSize {

    public static void main(String[] args){
        List<Integer> input = Arrays.asList(1,2,3,4);
        int k = 3;

        List<Integer> distinctSet = input.stream().distinct().collect(Collectors.toList());
        List<Integer> printList = new ArrayList<>(k);

        for(int i=0; i < distinctSet.size();i++){
            int count = 0;
            while(count++ != k)
                printList.add(distinctSet.get(i));

            System.out.println(printList);
            printList.clear();
            count = 1;

            printList.add(distinctSet.get(i));
            for(int j=0; j < distinctSet.size() && count != k; j++){
                if(j == i)
                    continue;
                printList.add(distinctSet.get(j));
                count++;
            }

            System.out.println(printList);
            printList.clear();
            count = 0;
        }


    }
}
