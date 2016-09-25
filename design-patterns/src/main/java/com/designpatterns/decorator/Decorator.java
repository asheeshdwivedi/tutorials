package com.designpatterns.decorator;

/**
 * Created by asheesh.dwivedi on 9/6/16.
 */
public abstract class Decorator implements GraphicalComponent{

    private GraphicalComponent next;

    public Decorator(GraphicalComponent next){
        this.next = next;
    }
    @Override
    public void paint() {
        this.next.paint();
    }

    @Override
    public GraphicalComponent addComponent( Object content ) {
        return this;
    }
}
