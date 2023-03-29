package com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves;

import java.util.Arrays;

import com.gkttk.tasks.sidecoding.gof.structural.facade.Action;

public abstract class DwarvenMineWorker {

    public void goToSleep() {

        System.out.printf("%s goes to sleep.\n", name());

    }

    public void wakeUp() {

        System.out.printf("%s wakes up.\n", name());
    }

    public void goHome() {

        System.out.printf("%s goes home.\n", name());
    }

    public void goToMine() {

        System.out.printf("%s goes to the mine.\n", name());
    }

    public abstract void work();

    public abstract String name();

    public void doActions(Action...actions){

        Arrays.stream(actions).forEach(this::action);
    }

    private void action(Action action) {

        switch (action) {
            case GO_TO_SLEEP -> goToSleep();
            case WAKE_UP -> wakeUp();
            case GO_HOME -> goHome();
            case GO_TO_MINE -> goToMine();
            case WORK -> work();
            default -> System.out.println("Undefined action.");
        }
    }

}
