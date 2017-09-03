package com.data.structures.sort;

import com.data.structures.sort.utility.SortUtility;

/**
 * Created by asheeshdwivedi on 8/1/16.
 */
public class SelectionSort implements Sort {


    @Override
    public int[] sort(int[] input) {
        System.out.print("Input aray  ");
        SortUtility.print(input);
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    SortUtility.swap(i, j, input);
                    SortUtility.print(input);
                }
            }
        }
        System.out.print("Output aray  ");
        SortUtility.print(input);
        return input;
    }
}
