package org.coding.practice;

public class ReverseWordsOfAGivenString {

    public static void main(String[] args){

        String inputString = "Hello this is arbaaz speaking";
        String finalString = "";
       // System.out.println(inputString.substring(0,4)); //Hell
        int startIndex = 0;
        int endIndex = 0;
        for(int index=0; index<inputString.length(); index++){

            if(inputString.charAt(index) != ' ')
                endIndex++;

            if(inputString.charAt(index) == ' '){
               // System.out.println("First word found: "+inputString.substring(startIndex,endIndex+1));
                String reverse = reverse(inputString.substring(startIndex, endIndex));
                finalString += reverse;
                finalString += ' ';
                startIndex = endIndex + 1;
                endIndex = endIndex + 1;
            }
        }

        System.out.println("Final output: "+finalString);
    }


    private static String reverse(String str){
        String reverse = "";

        for(int i = str.length()-1; i>=0; i--)
            reverse += str.charAt(i);

       // System.out.println(reverse);
        return reverse;
    }
}
