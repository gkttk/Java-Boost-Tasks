package com.gkttk.tasks.sidecoding.gof.creational.prototype.orcs;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Warlord;

public class OrcWarlord extends Warlord {

    private final String weapon;

    public OrcWarlord(String weapon) {

        this.weapon = weapon;
    }

    public String getWeapon() {

        return weapon;
    }

    @Override
    public String toString() {

        return String.format("Orcish warlord attacks with %s", this.weapon);
    }
}
