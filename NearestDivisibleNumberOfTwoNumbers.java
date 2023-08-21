package org.coding;

/*
Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.


Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.
Example 2:

Input:
N = -15 , M = 6
Output:
-18
Explanation:
-12 and -18 are both similarly close to
-15 and divisible by 6. but -18 has
the maximum absolute value.
So, Output is -18
*/
public class NearestDivisibleNumberOfTwoNumbers {

    public static void main(String[] args) {

        int N = 13;
        int M = 4;

        int countList[] = new int[2];
        boolean conditionNotReached = true;
        int count = 1;
        if (N >= 0) {
            while (conditionNotReached) {
                int number = (count++) * M;
                if (number < N)
                    countList[0] = number;

                else if (number == N) {
                    System.out.println(number);
                    return;
                    // conditionNotReached = false;
                } else {
                    // System.out.println("Added 1 index");
                    countList[1] = number;
                    conditionNotReached = false;
                }
            }
        } else {
            while (conditionNotReached) {
                int number = (-1) * (count++) * M;
                if (number < N){
                    countList[1] = number;
                    conditionNotReached = false;
                }
                else if (number == N) {
                    System.out.println(number);
                    return;
                    // conditionNotReached = false;
                } else
                    countList[0] = number;

            }
        }

            for(int item : countList)
                System.out.println(item);


            if (N - countList[0] >= countList[1] - N){
               // System.out.println("1");
                System.out.println(countList[1]);
            }
            else{
               //  System.out.println("2");
                System.out.println(countList[0]);
            }

        }
    }

