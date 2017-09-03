package com.designpatterns.decorator;

/**
 * Created by asheesh.dwivedi on 9/6/16.
 */
public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator( GraphicalComponent next ) {
        super( next );
    }

    @Override
    public void paint() {
        System.out.println("*************Render Scroll Bar *******************8");
        super.paint();
    }
}
