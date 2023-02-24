package com.gkttk.tasks.sidecoding.gof.creational.abstactfactory;

import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.factory.AbstractFactory;
import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.factory.FactoryProducer;
import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.Shape;

public class Main {

    public static void main(String[] args) {

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape roundedCircle = roundedShapeFactory.getCircle();
        Shape roundedSquare = roundedShapeFactory.getSquare();

        Shape circle = shapeFactory.getCircle();
        Shape square = shapeFactory.getSquare();

        roundedCircle.draw();
        roundedSquare.draw();

        circle.draw();
        square.draw();

    }

}
