package com.gkttk.tasks.sidecoding.gof.creational.prototype.elfs;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Warlord;

public class ElfWarlord extends Warlord {

    private final String helpType;

    public ElfWarlord(String helpType) {

        this.helpType = helpType;
    }

    public String getHelpType() {

        return helpType;
    }

    @Override
    public String toString() {

        return String.format("ElfWarlord helps in %s", this.helpType);
    }
}
