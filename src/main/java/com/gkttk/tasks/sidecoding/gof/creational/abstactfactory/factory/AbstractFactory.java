package com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.factory;

import com.gkttk.tasks.sidecoding.gof.creational.abstactfactory.model.Shape;

public interface AbstractFactory {

    Shape getCircle();

    Shape getSquare();

}
