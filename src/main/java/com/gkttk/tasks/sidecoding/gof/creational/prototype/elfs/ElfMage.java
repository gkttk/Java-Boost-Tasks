package com.gkttk.tasks.sidecoding.gof.creational.prototype.elfs;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Mage;

public class ElfMage extends Mage {

    private final String helpType;

    public ElfMage(String helpType) {

        this.helpType = helpType;
    }

    public String getHelpType() {

        return helpType;
    }

    @Override
    public String toString() {

        return String.format("ElfMage helps in %s", this.helpType);
    }
}
