package org.coding;


public class FlattenJaggedArray {

    public static void main(String[] args){

        int arr[][] = {
                {1,2,3,4},
                {2,4},
                {2,7,5,7,8,9}
        };

        for(int index = 0, j = 0; index < arr.length; ){
            if(j >= arr[index].length){
                index++;
                j = 0;
            }
            else
                System.out.print(arr[index][j++]+" ");
        }
    }
}
