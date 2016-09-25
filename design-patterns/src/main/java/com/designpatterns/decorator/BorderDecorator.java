package com.designpatterns.decorator;

/**
 * Created by asheesh.dwivedi on 9/6/16.
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator( GraphicalComponent next ) {
        super( next );
    }

    @Override
    public void paint() {
        System.out.println("===================HERE THE BORDER STARTS=====================");
        super.paint();
        System.out.println("===================HERE THE BORDER ENDS=====================");
    }
}
