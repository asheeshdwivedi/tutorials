package com.designpatterns.composite;

/**
 * Created by asheesh.dwivedi on 9/22/16.
 */
public class Constant implements Expression {

    private final double value;

    public Constant( double value ) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
