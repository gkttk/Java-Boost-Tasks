package com.gkttk.tasks.sidecoding.gof.creational.prototype.factory;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Beast;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Mage;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Warlord;

public class HeroFactoryImpl implements HeroFactory {

    private final Mage mage;
    private final Warlord warlord;
    private final Beast beast;

    public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {

        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
    }

    @Override
    public Mage createMage() {

        return this.mage.copy();
    }

    @Override
    public Warlord createWarlord() {

        return this.warlord.copy();
    }

    @Override
    public Beast createBeast() {

        return this.beast.copy();
    }
}
