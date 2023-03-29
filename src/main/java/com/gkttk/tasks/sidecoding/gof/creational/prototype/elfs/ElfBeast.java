package com.gkttk.tasks.sidecoding.gof.creational.prototype.elfs;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Beast;

public class ElfBeast extends Beast {

    private final String helpType;

    public ElfBeast(String helpType) {

        this.helpType = helpType;
    }


    public String getHelpType() {

        return helpType;
    }

    @Override
    public String toString() {

        return String.format("ElfBeast helps in %s", this.helpType);
    }
}
