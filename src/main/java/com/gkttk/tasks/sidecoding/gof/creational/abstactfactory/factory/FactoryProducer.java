package com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded){

        return rounded ? new RoundShapeFactory() : new ShapeFactory();


    }



}
