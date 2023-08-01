package org.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
Given a list of tasks with deadlines and total profit earned on completing a task, find the maximum profit earned by executing the tasks within the specified deadlines. Assume that each task takes one unit of time to complete, and a task can’t execute beyond its deadline. Also, only a single task will be executed at a time.

For example, consider the following set of tasks with a deadline and the profit associated with it. If we choose tasks 1, 3, 4, 5, 6, 7, 8, and 9, we can achieve a maximum profit of 109. Note that task 2 and task 10 are left out.
Tasks	Deadlines	Profit
1	9	15
2	2	2
3	5	18
4	7	1
5	4	25
6	2	20
7	5	8
8	7	10
9	4	12
10	3	5
*/
public class HighestProfitWithinDeadline {

    public static void main(String[] args){

        List<List<Integer>> deadLineProfitList = new ArrayList<>();
        deadLineProfitList.add(Arrays.asList(9,15));
        deadLineProfitList.add(Arrays.asList(2,2));
        deadLineProfitList.add(Arrays.asList(5,18));
        deadLineProfitList.add(Arrays.asList(7,1));
        deadLineProfitList.add(Arrays.asList(4,15));
        deadLineProfitList.add(Arrays.asList(9,25));
        deadLineProfitList.add(Arrays.asList(2,20));
        deadLineProfitList.add(Arrays.asList(5,8));
        deadLineProfitList.add(Arrays.asList(7,10));
        deadLineProfitList.add(Arrays.asList(4,12));


        // sorting the array with highest profit margin

        boolean swappedSomething = true;
        System.out.println(deadLineProfitList);
        while(swappedSomething){
            swappedSomething = false;
            for(int i=0; i< deadLineProfitList.size()-1; i++){
                if(deadLineProfitList.get(i).get(1) > deadLineProfitList.get(i+1).get(1)){
                    // swapping logic
                    swappedSomething = true;
                    int deadLine = deadLineProfitList.get(i).get(0);
                    int profit = deadLineProfitList.get(i).get(1);
                    deadLineProfitList.remove(i);
                    deadLineProfitList.add(i,deadLineProfitList.get(i+1));
                    deadLineProfitList.remove(i+1);
                    deadLineProfitList.add(Arrays.asList(deadLine,profit));
                }
            }
        }


        System.out.println(deadLineProfitList);

        int maxProfit = 0;

        ABC:for(int i= deadLineProfitList.size()-1; i>=0; i--){
            while(deadLineProfitList.get(i).get(0) > 0){

                maxProfit += deadLineProfitList.get(i).get(1);
                // System.out.println("Inside while loop");
                for(int j=0; j< deadLineProfitList.size(); j++){
                   // System.out.println("Deduction of all deadlines");
                    int deadLineForDeduction = deadLineProfitList.get(j).get(0);
                    int profitForResubmission = deadLineProfitList.get(j).get(1);
                    deadLineProfitList.remove(j);
                    deadLineProfitList.add(j,Arrays.asList(--deadLineForDeduction,profitForResubmission));
                   // System.out.println(": "+deadLineProfitList);

                }
                continue ABC;
            }
        }
        System.out.println("Profit: "+maxProfit);
    }
}
