

/**
 * Created by asheesh.dwivedi on 11/25/16.
 */

import java.util.LinkedList;
import java.util.List;

/**
 1. Modify the program to support TextField with border
 2. Modify the program to support TextField with scrollbar

 */

/*
* Result Should after adding Border
* ===================HERE THE BORDER STARTS=====================
Start TextField .....
This is First Line
This is Second Line
This is Third Line
This is Fourth Line
End TextField .....
===================HERE THE BORDER ENDS=====================
*
 */


/*
* Result Should after adding Border and ScrollBar
===================HERE THE BORDER STARTS=====================
*************Render Scroll Bar *******************8
Start TextField .....
This is First Line
This is Second Line
This is Third Line
This is Fourth Line
End TextField .....
===================HERE THE BORDER ENDS=====================
*/

interface GraphicalComponent{

    void paint();
    void addComponent( Object content );

}

class TextField implements GraphicalComponent {

    private List<String> line = new LinkedList<>();

    @Override
    public void paint() {
        System.out.println("Start TextField .....");
        line.stream().forEach( System.out::println );
        System.out.println("End TextField .....");

    }

    @Override
    public void addComponent(Object content) {
        assert(content instanceof String);
        this.line.add( (String) content );
    }

}


public class MainGraphicalComponent{

    public static void main( String[] args ) {
        GraphicalComponent component = constructAndAddLine();
        component.paint();
    }


    private static GraphicalComponent constructAndAddLine() {
        GraphicalComponent toReturn = new TextField();
        toReturn.addComponent( "This is First Line" );
        toReturn.addComponent( "This is Second Line" );
        toReturn.addComponent( "This is Third Line" );
        toReturn.addComponent( "This is Fourth Line" );
        toReturn.addComponent( "This is Fifth Line" );
        return toReturn;
    }

}

