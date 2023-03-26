package com.bridgelab.review1;

public class SecondLargest {
    public static void main (String [] args)
    {
        int temp, size;
        int [] array = {20, 60, 45, 90, 80, 70};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("second largest number is:: "+array[size-2]);
    }
}