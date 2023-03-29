package com.gkttk.tasks.sidecoding.gof.creational.prototype.factory;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Beast;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Mage;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Warlord;

public interface HeroFactory {

    Mage createMage();
    Warlord createWarlord();
    Beast createBeast();

}
