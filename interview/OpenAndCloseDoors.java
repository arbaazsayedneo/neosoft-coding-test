package org.coding.interview;

public class OpenAndCloseDoors {

    public static void main(String[] args){

        solution1();
        solution2();

    }

    private static void solution1(){
        int doorArray[] = new int[1000];

        for(int i=0; i < doorArray.length; i++)
            doorArray[i] = 0;

        for(int i = 1; i<=1000; i++){
            for(int j = 1; j * i <= 1000; j++){
                int doorIndex = (j * i) -1;

                if(doorArray[doorIndex] == 1)
                    doorArray[doorIndex] = 0;
                else if(doorArray[doorIndex] == 0)
                    doorArray[doorIndex] = 1;
            }
        }

        int openCount = 0;
        for(int i=0; i<doorArray.length;i++){
            if(doorArray[i] == 1){
                System.out.println("Door open No: "+(i+1));
                openCount++;
            }

        }

        System.out.println("Doors open: "+openCount);
    }

    private static void solution2() {
        int doors = 1000;
        int finalCount = (int) Math.sqrt(doors);

        for (int seq = 1; seq <= finalCount; seq++)
            System.out.println(seq * seq);

    }
}
