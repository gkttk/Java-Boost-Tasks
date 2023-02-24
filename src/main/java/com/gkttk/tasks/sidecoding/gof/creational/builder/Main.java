package com.gkttk.tasks.sidecoding.gof.creational.builder;

import com.gkttk.tasks.sidecoding.gof.creational.builder.Computer.ComputerBuilder;

public class Main {

    public static void main(String[] args) {

        String requiredHDD = "1000";
        String requiredRAM = "128";
        Computer computer = new ComputerBuilder(requiredHDD, requiredRAM).setGraphicCardEnabled(true)
                .setBluetoothEnabled(true).build();

        System.out.println(computer);


    }

}
