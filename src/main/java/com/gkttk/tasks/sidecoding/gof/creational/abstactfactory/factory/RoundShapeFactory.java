package com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.factory;

import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.RoundCircle;
import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.RoundSquare;
import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.Shape;

public class RoundShapeFactory implements AbstractFactory {

    @Override
    public Shape getCircle() {

        return new RoundCircle();
    }

    @Override
    public Shape getSquare() {

        return new RoundSquare();
    }
}
