package org.coding;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertMapToListUsingStreamApi {
    public static void main(String[] args){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        map.put(6,60);
        map.put(7,70);
        map.put(8,80);
        map.put(9,90);
        map.put(10,100);

        List<Integer> list = new ArrayList<>(map.size());

        map.keySet()
                .stream()
                .peek(item -> list.add(map.get(item)))
                .collect(Collectors.toList());

        System.out.println(list);




    }



}
