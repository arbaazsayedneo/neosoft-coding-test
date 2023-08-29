package org.coding;
/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
*/
public class ReverseStringWordWithoutReversingOrderOfWords {

    public static void main(String[] args){

        String input = "Let's take LeetCode contest";

        String reverseSentence = "";
        int frontIndex = 0;
        int backIndex = 0;

        for(int index = 0; index < input.length(); index++){
            if(input.charAt(index) == ' ')
            {
                String reverse = reverse(input.substring(backIndex,frontIndex));
                backIndex = ++frontIndex;
                reverseSentence += reverse;
                reverseSentence += " ";
                continue;
            }
            else if(index == input.length()-1){
                reverseSentence += reverse(input.substring(backIndex,frontIndex+1)) + " ";
                continue;
            }
            frontIndex++;
        }

        System.out.println(reverseSentence);

    }

    private static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
