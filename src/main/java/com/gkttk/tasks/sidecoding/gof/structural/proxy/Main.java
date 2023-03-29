package com.gkttk.tasks.sidecoding.gof.structural.proxy;

import com.gkttk.tasks.sidecoding.gof.structural.proxy.tower.IvoryTower;
import com.gkttk.tasks.sidecoding.gof.structural.proxy.tower.WizardTower;
import com.gkttk.tasks.sidecoding.gof.structural.proxy.tower.WizardTowerProxy;

public class Main {

    public static void main(String[] args) {

        WizardTower wizardTower = new WizardTowerProxy(new IvoryTower());
        wizardTower.enter(new Wizard("Red wizard"));
        wizardTower.enter(new Wizard("White wizard"));
        wizardTower.enter(new Wizard("Black wizard"));
        wizardTower.enter(new Wizard("Green wizard"));
        wizardTower.enter(new Wizard("Brown wizard"));
    }

}
