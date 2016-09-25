package com.designpatterns.decorator;

/**
 * Created by asheesh.dwivedi on 9/6/16.
 */
public class Main {

    public static void main( String[] args ) {
        GraphicalComponent component = constructAndAddLine();
        component = new BorderDecorator( component );
        component.paint();
    }

    private static GraphicalComponent constructAndAddLine() {
        GraphicalComponent toReturn = new TextField();
        toReturn =  toReturn.addComponent( "This is First Line" );
        toReturn = toReturn.addComponent( "This is Second Line" );
        toReturn = toReturn.addComponent( "This is Third Line" );
        toReturn = toReturn.addComponent( "This is Fourth Line" );
        toReturn = toReturn.addComponent( "This is Fifth Line" );
        return toReturn;
    }
}
