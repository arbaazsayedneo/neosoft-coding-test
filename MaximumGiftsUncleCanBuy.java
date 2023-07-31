package org.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MaximumGiftsUncleCanBuy {

    public static void main(String[] args){

        // creating a list of list of the pairs which will keep the day number and the gift cost in the list
        /*List<List<Integer>>  giftCostPair = new ArrayList<>();
        giftCostPair.add(Arrays.asList(1,3));
        giftCostPair.add(Arrays.asList(2,3));
        giftCostPair.add(Arrays.asList(3,2));
        giftCostPair.add(Arrays.asList(4,1));
        giftCostPair.add(Arrays.asList(5,3));*/
/*
        int possible = 0; // variable which will keep a track of number of possibilities the uncle can buy a gift
        int currentCash = 0; // variable which will keep a track of the current cash uncle has

        for(int i=0; i< giftCostPair.size(); i++)
        {
            // incrementing current cash everyday
            currentCash++;

            // checking for the condition if the gift can be bought on the given day
            if(currentCash >= giftCostPair.get(i).get(1))
            {
                currentCash -= giftCostPair.get(i).get(1);
                possible++;
            }
        }

        // printing the number of possible days when uncle can buy a gift for his nephew
        System.out.println("possible count: "+possible);*/

        List<List<Integer>>  giftCostPair = new ArrayList<>();
        giftCostPair.add(Arrays.asList(1,3));
        giftCostPair.add(Arrays.asList(2,3));
        giftCostPair.add(Arrays.asList(3,2));
        giftCostPair.add(Arrays.asList(4,1));
        giftCostPair.add(Arrays.asList(5,3));

        AtomicInteger count = new AtomicInteger(0);
        AtomicInteger currentCash = new AtomicInteger(0);

        long possibilityCount =
                 giftCostPair.parallelStream()
                .flatMap(item -> item.stream())
                .filter(item -> count.getAndIncrement() % 2 != 0)
                .collect(Collectors.toList())
                .parallelStream()
                .filter(item -> {
                    currentCash.incrementAndGet();
                    if(currentCash.get()>= item)
                    {
                        for(int i=0; i<item; i++)
                            currentCash.decrementAndGet();

                        return true;
                    }
                    else
                        return false;
                }).count();

        System.out.println(possibilityCount);
    }
}
