package com.gkttk.tasks.sidecoding.gof.structural.proxy.tower;

import com.gkttk.tasks.sidecoding.gof.structural.proxy.Wizard;

public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3;
    private final WizardTower targetTower;
    private int currentNumWizards;

    public WizardTowerProxy(WizardTower targetTower) {

        this.targetTower = targetTower;
    }

    @Override
    public void enter(Wizard wizard) {

        if (currentNumWizards < NUM_WIZARDS_ALLOWED) {
            this.currentNumWizards++;
            targetTower.enter(wizard);
        } else {
            System.out.printf("Wizard %s is not allowed to enter\n", wizard.getName());
        }

    }
}
