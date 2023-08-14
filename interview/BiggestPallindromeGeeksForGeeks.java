package org.coding.interview;

public class BiggestPallindromeGeeksForGeeks {

    public static void main(String[] args){

        String str = "forgeeksskeegfor";

        for(int index = 0; index < str.length(); index++){
            if(reverse(str).equals(str))
            {
                System.out.println("Biggest Pallindrome: "+str);
                break;
            }
            else {

            }
        }
    }

    private static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    private static String shortenFromLeft(String str){
        StringBuilder builder = new StringBuilder();

        for(int index = 1; index < str.length(); index++)
            builder.append(str.charAt(index));

        return builder.toString();
    }

    private static String shortenFromRight(String str){
        StringBuilder builder = new StringBuilder();

        for(int index = 0; index < str.length() - 1; index++)
            builder.append(str.charAt(index));

        return builder.toString();
    }
}
