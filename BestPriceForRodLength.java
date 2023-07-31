package org.coding;

/*
Given a rod of length n and a list of rod prices of length i, where 1 <= i <= n, find the optimal way to cut the rod into smaller rods to maximize profit.
For example, consider the following rod lengths and values:
Input:

length[] = [1, 2, 3, 4, 5, 6, 7, 8]
price[] = [1, 5, 8, 9, 10, 17, 17, 20]

Rod length: 4

Best: Cut the rod into two pieces of length 2 each to gain revenue of 5 + 5 = 10

Cut           Profit
4                9
1, 3            (1 + 8) = 9
2, 2            (5 + 5) = 10
3, 1            (8 + 1) = 9
1, 1, 2         (1 + 1 + 5) = 7
1, 2, 1         (1 + 5 + 1) = 7
2, 1, 1         (5 + 1 + 1) = 7
1, 1, 1, 1      (1 + 1 + 1 + 1) = 4
*/

import java.util.Scanner;

public class BestPriceForRodLength {

    public static void main(String[] args){

        int length[] = {1,2,3,4,5,6,7,8};

        int price[] = {1,5,8,9,10,17,17,20};

        Scanner sc = new Scanner(System.in);
        int rodLength = sc.nextInt();

        int max = 0;


            max = price[rodLength - 1];
            for(int i = 1; i<=rodLength; i++){
                int parts = rodLength/i;
                int remainder = rodLength % i;

                int cost = 0;
                if(remainder == 0)
                    cost = parts * price[i-1];
                else
                    cost = parts * price[i-1] + price[remainder -1];

                if(cost >= max)
                    max = cost;
            }

        System.out.println("Max cost that can be gained: "+max);

    }
}
