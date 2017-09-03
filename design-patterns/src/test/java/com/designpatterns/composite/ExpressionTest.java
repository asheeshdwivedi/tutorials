package com.designpatterns.composite;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by asheesh.dwivedi on 9/22/16.
 */
public class ExpressionTest {

    @Test
    public void testConstant() {
        double testValue = 3.0;
        Expression e = new Constant( testValue );
        Assert.assertEquals( e.getValue(), testValue, 0.00 );
    }

    @Test
    public void testAddition() {
        double left = 3.0;
        double right = 3.0;
        Expression e = new Addition( new Constant( left ) , new Constant( right ) );
        Assert.assertEquals( e.getValue(), left+right , 0.00 );
    }

    @Test
    public void testSubtraction() {
        double left = 3.0;
        double right = 3.0;
        Expression e = new Subtraction( new Constant( left ) , new Constant( right ) );
        Assert.assertEquals( e.getValue(), left-right , 0.00 );
    }

    @Test
    public void testMultiplication() {
        double left = 3.0;
        double right = 3.0;
        Expression e = new Multiplication( new Constant( left ) , new Constant( right ) );
        Assert.assertEquals( e.getValue(), left*right , 0.00 );
    }

    @Test
    public void testDivision() {
        double left = 3.0;
        double right = 3.0;
        Expression e = new Division( new Constant( left ) , new Constant( right ) );
        Assert.assertEquals( e.getValue(), left/right , 0.00 );
    }

    @Test
    public void testExpression(){
        Expression e = new Division(
                new Multiplication( new Addition( new Constant( 5 )  , new Constant( 3 ))  , new Constant( 10 ) ),
                new Addition( new Constant( 6 ) , new Constant( 3 ) )
        );
        Assert.assertEquals( e.getValue(), 8.88888 , 0.00001 );
    }


}
