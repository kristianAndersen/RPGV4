package com.kristian.armors;

public class Armor implements ArmorInterface{
    String armorType;
    int hp;
    int strength;
    int dexterity;
    int intelligence;
    int level;

    int upHp;
    int upStr;
    int upDext;
    int upIntg;

    public Armor(String armorType, int hp, int strength, int dexterity, int intelligence, int upHp, int upStr, int upDext, int upIntg) {
        this.armorType=armorType;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
        /*bonus parameters*/
        this.upHp=upHp;
        this.upStr=upStr;
        this.upDext=upStr;
        this.upIntg=upStr;
    }
}
