package com.gkttk.tasks.sidecoding.gof.creational.prototype.orcs;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Mage;

public class OrcMage extends Mage {

    private final String weapon;

    public OrcMage(String weapon) {

        this.weapon = weapon;
    }

    public String getWeapon() {

        return weapon;
    }

    @Override
    public String toString() {

        return String.format("Orcish mage attacks with %s", this.weapon);
    }
}
