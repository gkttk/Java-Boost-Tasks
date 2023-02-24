package com.gkttk.tasks.sidecoding.gof.creational.factory;

import com.gkttk.tasks.sidecoding.gof.creational.factory.model.Circle;
import com.gkttk.tasks.sidecoding.gof.creational.factory.model.Shape;
import com.gkttk.tasks.sidecoding.gof.creational.factory.model.Square;

public class ShapeFactory {


    Shape getShape(String type){
        if(type == null){
            return null;
        }

        switch (type){
            case "CIRCLE": {
                return new Circle();
            }
            case "SQUARE": {
                return new Square();
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }

}
