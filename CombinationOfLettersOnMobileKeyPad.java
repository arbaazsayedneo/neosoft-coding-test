package org.coding;

import java.util.*;

/*
Given a sequence of numbers between 2 and 9, print all possible combinations of words formed from the mobile keypad which has english alphabets associated with each key.
Input: [2, 3, 4]

Output:
ADG BDG CDG AEG BEG CEG AFG BFG CFG ADH BDH CDH AEH BEH CEH AFH BFH CFH ADI BDI CDI AEI BEI CEI AFI BFI CFI
*/
public class CombinationOfLettersOnMobileKeyPad {

    public static void main(String[] args){

        Map<Integer, List<Character>> keyPadList = new HashMap<>();
        keyPadList.put(2,List.of('A','B','C'));
        keyPadList.put(3,List.of('D','E','F'));
        keyPadList.put(4,List.of('G','H','I'));
        keyPadList.put(5,List.of('J','K','L'));
        keyPadList.put(6,List.of('M','N','O'));
        keyPadList.put(7,List.of('P','Q','R','S'));
        keyPadList.put(8,List.of('T','U','V'));
        keyPadList.put(9,List.of('W','X','Y','Z'));

        int input[] = {2,3,4};
        boolean innerIterationNotSuccessful = false;

        for(int index = 0; index < input.length; index++){

            int countList[] = new int[input.length];

            Arrays.fill(countList,0);

            String combination = keyPadList.get(input[index]).get(countList[index]) +"";

            for(int innerIndex = 0;innerIndex < input.length; innerIndex++){
                int listIndex = 0;
                if(innerIndex == index) continue;

                while(listIndex < keyPadList.get(input[innerIndex]).size()){
                    combination += keyPadList.get(input[innerIndex]).get(countList[listIndex++]);
                }

            }

            System.out.println(combination);
        }
    }
}
