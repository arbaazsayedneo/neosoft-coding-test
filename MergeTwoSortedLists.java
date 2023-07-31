package org.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(2,4,1,3,2,4,5,2);
        List<Integer> list2 = Arrays.asList(5,3,4,1,7,9,10,4,5,2);

        Collections.sort(list1);
        Collections.sort(list2);

        List<Integer> finalList = new ArrayList<>(list1.size() + list2.size());

        int i=0;
        int j=0;

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j))
                finalList.add(list1.get(i++));
            else
                finalList.add(list2.get(j++));
        }

        while(i<list1.size())
            finalList.add(list1.get(i++));

        while(j < list2.size())
            finalList.add(list2.get(j++));


        finalList
                .stream()
                .forEach(System.out::println);
    }
}
