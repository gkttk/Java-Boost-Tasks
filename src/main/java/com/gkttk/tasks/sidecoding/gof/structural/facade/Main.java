package com.gkttk.tasks.sidecoding.gof.structural.facade;

import java.util.List;

import com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves.DwarvenCartOperator;
import com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves.DwarvenGoldDigger;
import com.gkttk.tasks.sidecoding.gof.structural.facade.dwarves.DwarvenTunnelDigger;

public class Main {

    public static void main(String[] args) {

        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade(
                List.of(new DwarvenGoldDigger(), new DwarvenCartOperator(), new DwarvenTunnelDigger()));

        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }

}
