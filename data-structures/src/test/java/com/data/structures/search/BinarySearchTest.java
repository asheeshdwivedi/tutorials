package com.data.structures.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testSearch() throws Exception {
        int [] input = new int[]{1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9};
        new BinarySearch(input).search(0);
    }
}