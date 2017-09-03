package com.data.structures.sort.utility;

/**
 * Created by asheeshdwivedi on 8/1/16.
 */
public class SortUtility {

    public static void swap(int i , int j , int [] input){
        int k = input[i];
        input[i] = input[j];
        input[j] = k;
    }

    public static void print(int[] input) {
        StringBuffer buffer = new StringBuffer(" [ ");
        for (int i : input) {
            buffer.append(i).append(",");
        }
        buffer.append(" ] ");
        System.out.println(buffer);
    }
}
