package com.gkttk.tasks.sidecoding.gof.creational.builder;

public class Computer {

    //required params
    private final String HDD;
    private final String RAM;

    //optional params
    private final boolean graphicCardEnabled;
    private final boolean bluetoothEnabled;

    private Computer(ComputerBuilder builder) {

        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.graphicCardEnabled = builder.graphicCardEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    public String getHDD() {

        return HDD;
    }

    public String getRAM() {

        return RAM;
    }

    public boolean isGraphicCardEnabled() {

        return graphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {

        return bluetoothEnabled;
    }

    @Override
    public String toString() {

        return "Computer{" + "HDD='" + HDD + '\'' + ", RAM='" + RAM + '\'' + ", graphicCardEnabled="
                + graphicCardEnabled + ", bluetoothEnabled=" + bluetoothEnabled + '}';
    }

    public static class ComputerBuilder {

        //required params
        private final String HDD;
        private final String RAM;

        //optional params
        private boolean graphicCardEnabled;
        private boolean bluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {

            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {

            this.graphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {

            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {

            return new Computer(this);
        }


    }
}
