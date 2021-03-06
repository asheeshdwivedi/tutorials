package com.data.structures.sort.utility;

import com.data.structures.sort.Sort;

/**
 * Created by asheeshdwivedi on 8/1/16.
 */
public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] input) {
        System.out.print("Input aray  ");
        SortUtility.print(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j + 1] < input[j]) {
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
