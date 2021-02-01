package com.kristian;

import com.kristian.armors.Armor;
import com.kristian.armors.armorType.ArmorCloth;
import com.kristian.armors.armorType.ArmorLeather;
import com.kristian.armors.armorType.ArmorPlate;
import com.kristian.heros.Hero;
import com.kristian.heros.heroType.HeroWarrior;
import com.kristian.prettyPrint.PrettyPrint;
import com.kristian.weapons.Weapon;
import com.kristian.weapons.weaponType.WeaponMelee;
import com.kristian.weapons.weaponType.WeaponRanged;


public class Main {

    public static void main(String[] args) {

        PrettyPrint pp = PrettyPrint.getInstance();

        Hero warrior =new HeroWarrior();

        Armor leather = new ArmorLeather("Head");
        Armor cloth = new ArmorCloth("body");
        Armor plate =new ArmorPlate("legs");

        Weapon sword =new WeaponMelee("Stormcaller",5);
        Weapon bow =new WeaponRanged("David Bowi",1);

        pp.printHero(warrior);
        warrior.addArmor(plate);
        pp.printHero(warrior);
        warrior.addArmor(cloth);
        pp.printHero(warrior);
       // warrior.addArmor(cloth);
       // pp.printHero(warrior);
       //
       //

       // warrior.addArmor(cloth);
       // pp.printHero(warrior);

        warrior.addWeapon(sword);
        pp.printHero(warrior);
       // pp.printWeapon(bow);
        warrior.addWeapon(bow);
        pp.printHero(warrior);

        warrior.addXP(400);
        pp.printHero(warrior);
        //warrior.addWeapon(sword);







       /*
        pp.printHero(warrior);
        warrior.addXP(800);
        pp.printHero(warrior);
        */


        /*

        cloth.levelUpArmor(9);
        pp.printArmor(cloth);
        */

    }

}

