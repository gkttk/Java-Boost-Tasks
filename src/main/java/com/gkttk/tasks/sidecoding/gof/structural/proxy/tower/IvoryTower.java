package com.gkttk.tasks.sidecoding.gof.structural.proxy.tower;

import com.gkttk.tasks.sidecoding.gof.structural.proxy.Wizard;

public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {

        System.out.printf("Wizard %s enter the tower.\n", wizard.getName());
    }
}
