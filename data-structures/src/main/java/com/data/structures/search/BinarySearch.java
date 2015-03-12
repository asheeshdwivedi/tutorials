package com.data.structures.search;

/**
 * Created by asheesh.dwivedi on 3/11/2015.
 *
 * Pseudo code
 * first = 0;
 * last = n - 1; {n} length of input
 * mid = (first + last)/2
 * loop while searchElement is not equal to input[mid] and fist < last
 * if searchElement < input[mid]
 *    first = mid + 1
 *  else
 *    last = mid - 1
 *  end if else block
 *   mid = (first+last)/2
 *   end loop
 * if fount print the location of searchElement
 *  else print not found
 */
public class BinarySearch implements Search {

    private final int [] input;

    public BinarySearch(int [] input){
        this.input = input;
    }
    @Override
    public void search(int searchElement) {
        int first = 0;
        int last = input.length;
        int mid = (first +last)/2;
        while((first < last) && (input[mid] != searchElement)){
            if(searchElement > input[mid]){
                first = mid+1;
            }else {
                last = mid-1;
            }
            mid = (first + last)/2;
        }
        if(input[mid] == searchElement){
            System.out.println("Element found at index  " + mid);
        }else{
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int [] input = new int[]{1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9};
        new BinarySearch(input).search(0);
    }
}
