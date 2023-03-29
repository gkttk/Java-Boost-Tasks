package com.gkttk.tasks.sidecoding.gof.creational.prototype;

import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Beast;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Mage;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.types.Warlord;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.elfs.ElfBeast;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.elfs.ElfMage;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.elfs.ElfWarlord;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.factory.HeroFactory;
import com.gkttk.tasks.sidecoding.gof.creational.prototype.factory.HeroFactoryImpl;

public class Main {

    public static void main(String[] args) {

        HeroFactory factory = new HeroFactoryImpl(new ElfMage("casting"), new ElfWarlord("protecting"),
                new ElfBeast("barking"));

        //Beasts
        Beast beast1 = factory.createBeast();
        Beast beast2 = factory.createBeast();

        System.out.println(beast1);
        System.out.println(beast2);
        System.out.println("Are beasts the same: " + (beast1 == beast2));

        //Mages
        Mage mage1 = factory.createMage();
        Mage mage2 = factory.createMage();

        System.out.println(mage1);
        System.out.println(mage2);
        System.out.println("Are mages the same: " + (mage1 == mage2));

        //Warlords
        Warlord warlord1 = factory.createWarlord();
        Warlord warlord2 = factory.createWarlord();

        System.out.println(warlord1);
        System.out.println(warlord2);
        System.out.println("Are warlords the same: " + (warlord1 == warlord2));
    }

}
