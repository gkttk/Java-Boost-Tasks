package com.gkttk.tasks.sidecoding.gof.structural.facade;

import java.util.List;

import com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves.DwarvenMineWorker;

public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade(List<DwarvenMineWorker> workers) {

        this.workers = workers;
    }


    public void startNewDay() {

        makeActions(workers, Action.WAKE_UP, Action.GO_TO_MINE);
    }

    public void digOutGold() {

        makeActions(workers, Action.WORK);
    }

    public void endDay() {

        makeActions(workers, Action.GO_HOME, Action.GO_TO_SLEEP);
    }

    private void makeActions(List<DwarvenMineWorker> workers, Action... actions) {

        workers.forEach(worker -> worker.doActions(actions));
    }

}
