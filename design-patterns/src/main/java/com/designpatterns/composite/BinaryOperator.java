package com.designpatterns.composite;

/**
 * Created by asheesh.dwivedi on 9/22/16.
 */
public abstract class BinaryOperator implements Expression {

    protected final Expression left;
    protected final Expression right;

    public BinaryOperator( Expression left, Expression right ) {
        this.left = left;
        this.right = right;
    }
}
