package org.coding;

import java.util.Scanner;

public class NoOfAlphabetsInCamelCase {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        String word = sc.next();

        int wordCount = 0;

        if(!word.isEmpty())
            wordCount++;

        char[] array = word.toCharArray();

        for(char item : array){
            if(item >= 65 && item <= 90)
                wordCount++;
        }

        System.out.println(wordCount);


    }


}
