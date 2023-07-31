package org.coding;

import java.util.*;

/*
Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
For example:
Input:  { 1, 2, 3, 1, 2, 1 }
Output: { 1, 1, 1, 2, 2, 3 }

Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }
*/
public class RearrangingArrayWithRelativePosition {

    public static void main(String[] args){

        int input[] = {1,2,3,1,2,1};

        List<Integer> countList = new ArrayList<>(input.length);
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        List<Integer> finalList = new ArrayList<>();

        for(int i=0; i<input.length;i++)
            uniqueSet.add(input[i]);

        Arrays.sort(input);
        int num = input[0];
        int count = 1;

        for(int i=1; i<input.length;i++){
            if(num == input[i])
                count++;
            else {
                countList.add(count);
                num = input[i];
                count = 1;
            }
        }
        countList.add(count);

        System.out.println(countList);
        Iterator<Integer> iterator = uniqueSet.iterator();
        for(int i=0; i<uniqueSet.size() && iterator.hasNext();i++){
            int item = iterator.next();
            for(int j=0; j< countList.get(i);j++)
                finalList.add(item);
        }

        System.out.println(finalList);


    }
}
