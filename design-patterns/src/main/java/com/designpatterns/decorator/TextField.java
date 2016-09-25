package com.designpatterns.decorator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by asheesh.dwivedi on 9/6/16.
 */
public class TextField implements GraphicalComponent {

    private List<String> line = new LinkedList<>(  );

    @Override
    public void paint() {
        System.out.println("Start TextField .....");
        line.stream().forEach( System.out::println );
        System.out.println("End TextField .....");
    }
    
    @Override
    public GraphicalComponent addComponent(Object content) {
        assert(content instanceof String);
        this.line.add( (String) content );
        if(this.line.size() > 3 ){
            return new ScrollBarDecorator(this);
        }else{
            return this;
        }
    }
}
