package org.coding.interview;

public class Pallindrome {

    public static void main(String[] args){

        String str1 = "yabcdcbabcddcbaz";
        String str2 = "yabcdcbabcddcbaz";

        String iteration1 = null;
        String iteration2 = null;

        for(int i = str1.length() -1; i>=0; i--){

            String reverse = reverse(str1);
            if(reverse.equals(str1))
            {
                iteration1 = reverse;
                break;
            }

            str1 = shortenByOneCharacter(str1);
        }

        // second check

        for(int i=0; i < str2.length();i++){
            String reverse = reverse(str2);
           // System.out.println("Reverse: "+reverse);
            if(reverse.equals(str2))
            {
                iteration2 = reverse;
                break;
            }

            str2 = shortenByOneCharacterFromLeft(str2);
        }

        if(iteration2 == null && iteration1 != null)
            System.out.println("Biggest Pallindrome: "+iteration1);
        else if(iteration1 == null && iteration2 != null)
        System.out.println("Biggest Pallindrome: "+iteration2);

        else if(iteration1.length() > iteration2.length())
            System.out.println("Pallindrome: "+iteration1);
        else
            System.out.println("Pallindrome: "+iteration2);
    }

    private static String reverse(String str){
        StringBuilder builder = new StringBuilder();

        builder.append(str);
        StringBuilder reverse = builder.reverse();
        return reverse.toString();
    }

    private static String shortenByOneCharacter(String str){
        StringBuilder builder = new StringBuilder();

        for(int i=0; i < str.length() - 1; i++)
            builder.append(str.charAt(i));

        return builder.toString();
    }

    private static String shortenByOneCharacterFromLeft(String str){
        StringBuilder builder = new StringBuilder();

        for(int i= 1; i<str.length(); i++)
            builder.append(str.charAt(i));

        return builder.toString();
    }
}
