package org.coding;

import java.time.LocalDateTime;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args){
        Random random = new Random();

        int[] numbers = new int[10000000];

        for(int i=0; i< numbers.length; i++)
            numbers[i] = random.nextInt(100000);

        System.out.println("Before Sorting");
        printArray(numbers);

        System.out.println("Start time: "+ LocalDateTime.now());
        mergeSort(numbers);
        System.out.println("End time: "+ LocalDateTime.now());


        System.out.println("After Sorting");
        printArray(numbers);


    }

    private static void printArray(int[] arr){
        for(int i=0; i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    private static void mergeSort(int[] arr){

        int inputLength = arr.length;

        if(inputLength < 2)
            return;
        int midIndex = inputLength / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i=0; i<leftHalf.length; i++)
            leftHalf[i] = arr[i];

        for(int i = midIndex, j=0; j < rightHalf.length && i < inputLength; i++,j++)
            rightHalf[j] = arr[i];

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // merge two sorted arrays in one large array
        merge(arr,leftHalf,rightHalf);

    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftLength && j < rightLength){
            if(leftHalf[i] <= rightHalf[j])
                inputArray[k++] = leftHalf[i++];
            else
                inputArray[k++] = rightHalf[j++];
        }

        while(i < leftLength)
            inputArray[k++] = leftHalf[i++];
        while(j < rightLength)
            inputArray[k++] = rightHalf[j++];


    }
}
