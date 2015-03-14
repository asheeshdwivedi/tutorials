package com.data.structures.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void testSearch() throws Exception {

        int [] input = new int[]{10, 90, 80 , 4, 76, 59, 33};
        new LinearSearch(input).search(4);

    }
}