package org.coding;

import java.util.Arrays;
import java.util.List;

/*
Check if the sentence is pangram.
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

*/
public class Panagram {

    public static void main(String[] args){

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        List<Character> alphabets = Arrays.asList('a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        int count = 0;
        for(int index = 0; index < alphabets.size(); index++){

            for(int i=0; i < sentence.length(); i++){
                if(sentence.charAt(i) == alphabets.get(index))
                {
                    count++;
                    break;
                }
            }
        }

        if(count == 26)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
