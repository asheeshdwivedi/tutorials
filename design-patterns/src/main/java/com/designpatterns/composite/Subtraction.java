package com.designpatterns.composite;

/**
 * Created by asheesh.dwivedi on 9/22/16.
 */
public class Subtraction extends BinaryOperator {

    public Subtraction( Expression left, Expression right ) {
        super( left, right );
    }

    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
