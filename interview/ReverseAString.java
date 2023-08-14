package org.coding.interview;

public class ReverseAString {

    public static void main(String[] args){

        String firstString = "ABCDEFGHIJKL";
        String reverse = reverse(firstString);

        System.out.println("Reverse: "+reverse);

    }

    private static String reverse(String str){
        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int j = charArray.length -1; j>=0; j--)
            builder.append(charArray[j]);

        return builder.toString();
    }
}
