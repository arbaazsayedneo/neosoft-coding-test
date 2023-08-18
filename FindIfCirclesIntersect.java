package org.coding;
/*
Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.Find out whether they touch(at one or more than one points).

Example 1:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=8
Output:
0
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 8 respectively
do not touch each other.
Example 2:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=18
Output:
1
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 18 respectively
touch each other at two points.
*/
public class FindIfCirclesIntersect {

    public static void main(String[] args){

        int r1 = 5;
        int r2 = 8;
        int x1 = 3;
        int x2 = 14;
        int y1 = 4;
        int y2 = 18;

        double disTanceBetweenCenters = Math.sqrt(((x2-x1) * (x2-x1)) +((y2-y1) * (y2-y1)));

        if((int)disTanceBetweenCenters == (r1+r2))
            System.out.println("Meeting at one point");
        else if((int)disTanceBetweenCenters < (r1+r2))
            System.out.println("Meeting");
        else
            System.out.println("Do not meet");
    }
}
