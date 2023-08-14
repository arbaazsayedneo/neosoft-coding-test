package org.coding.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountOfDistinctCharactersInString {

    public static void main(String[] args){
        String str = "iuqgfiufgqbacbvygfuqvfbjqbxmxoiwdoixomwoqihduihchcoqnd";

        Map<Character,Integer> countingMap = new HashMap<>();

        char[] charArray = str.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(countingMap.containsKey(charArray[i]))
            {
                int previousCount = countingMap.get(charArray[i]);
                countingMap.put(charArray[i],previousCount + 1);
            }
            else
                countingMap.put(charArray[i],1);
        }

        System.out.println(countingMap);
/*        System.out.println("Printing the final Results: ");
        Set<Character> characters = countingMap.keySet();

        Iterator<Character> iterator = characters.iterator();

        while(iterator.hasNext()){
            int key = iterator.next();
            System.out.print("Key: "+key);
            System.out.println("   Count: "+countingMap.get(key));*/

    }
}
