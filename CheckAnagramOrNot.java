package org.coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not.
An anagram of a string is another string that contains the same characters, only the order of characters can be different.
For example, act and tac are an anagram of each other.

Note:-

If the strings are anagrams you have to return True or else return False

|s| represents the length of string s.


Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation: Characters in both the strings are
        not same, so they are not anagrams.
*/
public class CheckAnagramOrNot {

    public static void main(String[] args){

        String str1 =  "geeksforgeeks";  //"allergy";
        String str2 =  "forgeeksgeeks"; //"allergic"

        System.out.println("Anagram: "+checkForAnagrams(str1,str2));

    }

    private static boolean checkForAnagrams(String str1, String str2){

        if(str1.length() != str2.length())
            return false;

        Map<Character,Integer> string1Map = new HashMap<>();
        Map<Character,Integer> string2Map = new HashMap<>();

        for(int i=0; i < str1.length(); i++)
        {
            try {
                Integer count = string1Map.get(str1.charAt(i));
                string1Map.put(str1.charAt(i),++count);
            }
            catch(Exception e){
                string1Map.put(str1.charAt(i), 1);
            }
        }
        // check for map values
        // System.out.println(string1Map);

        // repeat same process for String 2
        for(int j=0; j < str2.length(); j++)
        {
            try {
                Integer count = string2Map.get(str2.charAt(j));
                string2Map.put(str2.charAt(j),++count);
            }
            catch(Exception e){
                string2Map.put(str2.charAt(j), 1);
            }
        }

        // System.out.println(string2Map);
        // System.out.println("Equal: "+string1Map.equals(string2Map)); comes true for geekforgeeks
        return equalityCheck(string1Map,string2Map);
    }

    private static boolean equalityCheck(Map<Character,Integer> map1, Map<Character,Integer> map2){

        Set<Character> map1Keys = map1.keySet();
        Iterator<Character> iterator = map1Keys.iterator();

        while(iterator.hasNext()){
            try {
                char key  = iterator.next();;
                if(map1.get(key) != map2.get(key))
                    throw new Exception("Not an Anagram");
            }
            catch (Exception e){
                return false;
            }
        }
            return true;
    }
}
