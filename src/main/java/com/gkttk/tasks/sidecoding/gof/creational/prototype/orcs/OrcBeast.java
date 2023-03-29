package com.gkttk.tasks.sidecoding.gof.creational.prototype.orcs;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Beast;

public class OrcBeast extends Beast {

    private final String weapon;

    public OrcBeast(String weapon) {

        this.weapon = weapon;
    }

    public String getWeapon() {

        return weapon;
    }

    @Override
    public String toString() {

        return String.format("Orcish wolf attacks with %s", this.weapon);
    }
}
