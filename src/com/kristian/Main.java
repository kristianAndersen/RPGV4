package com.kristian;

import com.kristian.armors.Armor;
import com.kristian.armors.armorType.ArmorCloth;
import com.kristian.heros.Hero;
import com.kristian.heros.heroType.HeroWarrior;
import com.kristian.prettyPrint.PrettyPrint;
import com.kristian.weapons.Weapon;
import com.kristian.weapons.weaponTypeMele.Stormcaller;

public class Main {

    public static void main(String[] args) {

        PrettyPrint pp = PrettyPrint.getInstance();
        Hero warrior =new HeroWarrior();
        Armor cloth = new ArmorCloth("legs");
        Weapon sword =new Stormcaller("Stormcaller","Melee");

        pp.printHero(warrior);
        warrior.addXP(800);
        pp.printHero(warrior);
/*
        pp.printArmor(cloth);
        cloth.levelUp(9);
        pp.printArmor(cloth);

*/

    }

}

