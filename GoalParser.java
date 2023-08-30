package org.coding;
/*
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.



Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"
*/
public class GoalParser {

    public static void main(String[] args){


        String input = "(al)G(al)()()G";// "G()()()()(al)";// "G()(al)";

        StringBuilder interpretedString = new StringBuilder();

        for(int index=0; index < input.length(); index++){

            if(input.charAt(index) == 'G')
                interpretedString.append("G");
            else if(input.charAt(index) == '(' && input.charAt(index + 1) == ')')
                interpretedString.append("o");
            else if(input.charAt(index) == '(' && input.charAt(index + 1) == 'a')
                interpretedString.append("al");
        }

        System.out.println(interpretedString.toString());

    }
}
