package org.coding.logical.cache;

import java.util.ArrayDeque;
import java.util.Deque;

public class LRUCache {

    private static Deque<Integer> cacheQueue = new ArrayDeque<>(10);

    private static void addNewElement(int item){

        if(cacheQueue.size() < 10)
            cacheQueue.addLast(item);
        else
        {
            cacheQueue.removeFirst();
            cacheQueue.addLast(item);
        }
    }

    private static void getElement(int item){
        if(cacheQueue.contains(item)) {
            cacheQueue.removeFirstOccurrence(item);
            cacheQueue.addLast(item);
        }
    }

    public static void main(String[] args){

        cacheQueue.add(10);
        cacheQueue.add(20);
        cacheQueue.add(30);
        cacheQueue.add(40);
        cacheQueue.add(50);
        cacheQueue.add(60);
        cacheQueue.add(70);
        cacheQueue.add(80);
        cacheQueue.add(90);
        cacheQueue.add(100);



        System.out.println("Initial: "+cacheQueue);

        LRUCache.getElement(30);
        System.out.println("After getting elemt 30: "+cacheQueue);

        LRUCache.addNewElement(200);
        System.out.println("After adding the element: "+cacheQueue);

    }
}
