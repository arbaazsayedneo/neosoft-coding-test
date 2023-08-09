package org.coding;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class ConvertListToAMapInStreamApi {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numberList = new ArrayList<>(10);
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        numberList.add(60);
        numberList.add(70);
        numberList.add(80);
        numberList.add(90);
        numberList.add(100);

        AtomicInteger sum = new AtomicInteger();
        numberList.stream()
                .peek(item -> sum.getAndSet(sum.get() + item))
                .collect(Collectors.toList());

        System.out.println("Sum: "+sum);

        Map<Integer,Integer> map = new HashMap<>();
        AtomicInteger count = new AtomicInteger(1);

         numberList.stream()
                 .peek(item -> map.put(count.getAndIncrement(),item))
                 .forEach(item -> System.out.println());

        Iterator<Integer> iterator = map.keySet()
                .iterator();

        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
    }
}
