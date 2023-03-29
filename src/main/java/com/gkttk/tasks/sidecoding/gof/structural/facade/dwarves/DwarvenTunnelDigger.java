package com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves;

public class DwarvenTunnelDigger extends DwarvenMineWorker {

    @Override
    public void work() {

        System.out.printf("%s creates another promising tunnel.\n", name());
    }

    @Override
    public String name() {

        return "Dwarven tunnel digger";
    }
}
