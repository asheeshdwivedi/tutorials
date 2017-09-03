package com.data.structures.search;

import org.junit.Test;

import java.net.URL;
import java.net.URLClassLoader;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testSearch() throws Exception {
        System.out.println(BinarySearch[].class.getName());
        int [] input = new int[]{1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9};
        new BinarySearch(input).search(0);
    }
}