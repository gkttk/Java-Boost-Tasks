package com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.factory;

import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.Circle;
import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.Shape;
import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.Square;

public class ShapeFactory implements AbstractFactory {


    @Override
    public Shape getCircle() {

        return new Circle();
    }

    @Override
    public Shape getSquare() {

        return new Square();
    }
}
