package org.coding.practice;

public class ReplaceOccurancesOfGivenCharacter {

    public static void main(String[] args) {

        String str = "jvfeqkfvjahcvheqjvtycsgcvvamncbqgfwkbdkjqf";

        char charToReplace = 'q';
        char replacement = 'A';

        // String replacedString = str.replace(charToReplace, replacement);
        // System.out.println(replacedString);

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charToReplace)
                charArray[i] = replacement;
        }

        str = null;
        for (int i = 0; i < charArray.length; i++)
            str += charArray[i];


        System.out.println(str);
    }
}
