package com.gkttk.tasks.sidecoding.gof.creational.factory;

import com.gkttk.tasks.sidecoding.gof.creational.factory.model.Shape;

public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        Shape square = factory.getShape("SQUARE");

        circle.draw();
        square.draw();

    }

}
