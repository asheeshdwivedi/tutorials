package com.data.structures.search;

/**
 * Created by asheesh.dwivedi on 3/11/2015.
 *
 * Pseudo code
 * ==>Start at location of input from 0 {i}
 * ==>loop while current value is not equal to searchElement and counter {i} should be less the the length of (input - 1)
 * ==>end loop
 * ==>if fount print the location of searchElement
 * ===>else print not found
 */

/**
 * If we see the the comparison
 */
public class LinearSearch implements Search{

    private final int [] input;

    public LinearSearch(int[] input) {
        this.input = input;
    }


    @Override
    public void search(int searchElement) {
        int i = 0;  //counter {i}
        while((input[i] != searchElement)&& i < input.length-1)
            i++;
        if(input[i] == searchElement){
            System.out.println("Item found at index ==> " +i);
        }else{
            System.out.println("Item not found ");
        }
    }

}
