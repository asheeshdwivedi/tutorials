package com.designpatterns.decorator;

/**
 * Created by asheesh.dwivedi on 9/6/16.
 */
public interface GraphicalComponent {

     void paint();
     GraphicalComponent addComponent( Object content );

}
