package com.kristian;

import com.kristian.armors.Armor;
import com.kristian.armors.armorType.ArmorCloth;
import com.kristian.armors.armorType.ArmorLeather;
import com.kristian.armors.armorType.ArmorPlate;
import com.kristian.heros.Hero;
import com.kristian.heros.heroType.HeroMage;
import com.kristian.heros.heroType.HeroRanger;
import com.kristian.heros.heroType.HeroWarrior;
import com.kristian.prettyPrint.PrettyPrint;
import com.kristian.weapons.Weapon;
import com.kristian.weapons.weaponType.WeaponMagic;
import com.kristian.weapons.weaponType.WeaponMelee;
import com.kristian.weapons.weaponType.WeaponRanged;


public class Main {

    public static void main(String[] args) {

        PrettyPrint pp = PrettyPrint.getInstance();

        Hero warrior =new HeroWarrior();
        Hero mage =new HeroMage();
        Hero ranger=new HeroRanger();

        Armor plate =new ArmorPlate("body");
        Armor helmet = new ArmorLeather("head");
        Armor cloth = new ArmorCloth("body");


        Weapon sword =new WeaponMelee("stabby-pointy-long-stick",1);
        Weapon bow =new WeaponRanged("David Bowi",1);
        Weapon magic =new WeaponMagic("Brick of Yodeling",1);

        System.out.println("Basic heroes");
        warrior.heroAddXP(0);
        pp.printHero(warrior);


        ranger.heroAddXP(0);
        pp.printHero(ranger);

        mage.heroAddXP(0);
        pp.printHero(mage);

        System.out.println("Basic weapons");
        pp.printWeapon(sword);
        pp.printWeapon(bow);
        pp.printWeapon(magic);

        System.out.println("Basic armor");
        pp.printArmor(helmet);
        pp.printArmor(plate);
        pp.printArmor(cloth);

        System.out.println("Equip warrior with basic armor and melee weapon");
        warrior.heroAddWeapon(sword);
        warrior.heroAddArmor(plate);
        pp.printHero(warrior);

        System.out.println("level up Equipment and warrior");
        warrior.heroAddXP(800);
        sword.weaponLevelUp(4);
        pp.printWeapon(sword);


        plate.levelUpArmor(4);
        warrior.heroAddArmor(plate);
        warrior.updateHeroArmor();
        pp.printArmor(plate);
        pp.printHero(warrior);
        System.out.println("Change armor and weapon");
        warrior.heroAddArmor(cloth);
        warrior.heroAddWeapon(bow);
        pp.printArmor(cloth);
        pp.printWeapon(bow);
        pp.printHero(warrior);
        System.out.println("Change to magic weapon");
        magic.weaponLevelUp(4);
        warrior.heroAddWeapon(magic);
        pp.printWeapon(magic);
        pp.printHero(warrior);

    }

}

