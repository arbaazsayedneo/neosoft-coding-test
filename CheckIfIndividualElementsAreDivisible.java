package org.coding;
/*
Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly
*/
public class CheckIfIndividualElementsAreDivisible {

    public static void main(String[] args){
        int number = 1234;

        int divisibilityCount = checkFordivisibility(number);

        System.out.println("Divisibility Count: "+divisibilityCount);


    }


    private static int checkFordivisibility(int number){
        int divisibleCount = 0;
        // get the individual element and check for divisibility
        int permananent = number;
        String numberString = number + "";

        char[] charArray = numberString.toCharArray();

        for(int i=0; i<charArray.length; i++){
            int innerNumber = number % 10;
            if(permananent % innerNumber == 0)
                divisibleCount++;

            number = number/10;
        }

        return divisibleCount;
    }
}
