package org.coding;

/*
Given an array of distinct integers, shuffle it according to the given order of elements.
For example:
Input:
nums[] = { 1, 2, 3, 4, 5 }
pos[] = { 3, 2, 4, 1, 0 }

Output:

nums[] = { 5, 4, 2, 1, 3 }

i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
In other words, update nums[pos[i]] = nums[i] for every index i.
*/
public class ShuffleTheArray {

    public static void main(String args[]){


        int [] nums = { 1, 2, 3, 4, 5 };
        int pos[] = { 3, 2, 4, 1, 0 };
        int finalList[] = new int[nums.length];

        if(nums.length != pos.length)
            System.exit(0);

        for(int i=0; i<nums.length;i++)
            finalList[pos[i]] = nums[i];

        for(int item: finalList)
            System.out.print(item+" ");

    }
}
