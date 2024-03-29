package com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves;

public class DwarvenCartOperator extends DwarvenMineWorker {

    @Override
    public void work() {

        System.out.printf("%s moves gold chunks out of the mine.\n", name());
    }

    @Override
    public String name() {

        return "Dwarf cart operator";
    }
}
