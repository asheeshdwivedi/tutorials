package com.data.structures.search;

import com.data.structures.Stack;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by asheeshdwivedi on 1/10/16.
 */
public class StackTest {

    @Test
    public void testPush() throws Stack.StackOverflowException, Stack.StackUnderflowException {
        Stack<Integer> stack = new Stack<>();
        Integer integerToPush = 10;
        stack.push(10);
        Assert.assertEquals(integerToPush, stack.peek());
    }

    @Test
    public void testPop()throws Stack.StackOverflowException, Stack.StackUnderflowException {
        Stack<Integer> stack = new Stack<>();
        Integer integerToPush = 10;
        stack.push(10);
        stack.pop();
        Assert.assertEquals( stack.getSize() , 0);
    }
}
