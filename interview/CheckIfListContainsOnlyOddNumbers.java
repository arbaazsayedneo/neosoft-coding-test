package org.coding.interview;

import java.util.Arrays;
import java.util.List;

public class CheckIfListContainsOnlyOddNumbers {

    public static void main(String[] args){

        List<Integer> integerList = Arrays.asList(2,4,1,6,4,7,8,3,4,5,6);
        boolean isOddPresent = checkForOddNumber(integerList);
        System.out.println("Odd value presrent: "+isOddPresent);

    }

    private static boolean checkForOddNumber(List<Integer> integerList){

        for(int i=0; i<integerList.size(); i++)
        {
            if(integerList.get(i) % 2 != 0)
                return true;
        }

        return false;
    }
}
