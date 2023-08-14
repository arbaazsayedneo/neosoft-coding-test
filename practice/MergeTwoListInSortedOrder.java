package org.coding.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoListInSortedOrder {

    public static void main(String[] args){

        List<Integer> list1 = Arrays.asList(23,21,12,45,67,34,98,56);
        List<Integer> list2 = Arrays.asList(34,21,42,55,67,14,8,36);
        List<Integer> finalList = new ArrayList<>(list1.size() + list2.size());
        Collections.sort(list1);
        Collections.sort(list2);
        int x = 0, y = 0;

        while(x < list1.size() && y < list2.size()){
            if(list1.get(x) <= list2.get(y))
                finalList.add(list1.get(x++));
            else
                finalList.add(list2.get(y++));

        }

        while(x < list1.size())
            finalList.add(list1.get(x++));

        while(y < list2.size())
            finalList.add(list2.get(y++));

        System.out.println(finalList);
    }
}
