package com.kristian.armors;

import java.util.Locale;

public class Armor implements ArmorInterface{

    String armorType;
    String placement;
    int hp;
    int strength;
    int dexterity;
    int intelligence;
    int level;

    int upHp;
    int upStr;
    int upDext;
    int upIntg;


    public Armor(String armorType,String placement, int hp, int strength, int dexterity, int intelligence, int upHp, int upStr, int upDext, int upIntg) {
        this.armorType=armorType;
        this.placement=placement;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
        /*bonus parameters*/
        this.upHp=upHp;
        this.upStr=upStr;
        this.upDext=upDext;
        this.upIntg=upIntg;
    }

    public String getArmorType() {
        return armorType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getUpHp() {
        return upHp;
    }

    public int getUpStr() {
        return upStr;
    }

    public int getUpDext() {
        return upDext;
    }

    public int getUpIntg() {
        return upIntg;
    }

    @Override
    public void levelUp(int lvlUp) {
        setLevel(getLevel()+lvlUp);
    }

    @Override
    public int getBonusHP() {
        return calcLevelUp(hp+getUpHp()*level);

    }

    @Override
    public int getBonusDext() {
        return calcLevelUp(dexterity+getUpDext()*level);
    }

    @Override
    public int getBonusInth() {
        return calcLevelUp(intelligence+getUpIntg()*level);
    }

    @Override
    public int getBonusStr() {
        return calcLevelUp(strength+getUpStr()*level);
    }
/**
 * calculate armor bonus on placement */
    @Override
    public int calcLevelUp(int intToCalc) {
        float calculatedInt;

        switch (placement.toLowerCase()){
            case "body" :
                System.out.println("Body you ....");
                calculatedInt =  (int)( intToCalc *(100.0f/100.0f));
                break;
            case "head" :
                calculatedInt =  (int)(intToCalc*(80.0f/100.0f));
                break;
            case "legs" :
                calculatedInt =  (int)(intToCalc*(60.0f/100.0f));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + placement);
        }


        return Math.round(calculatedInt);
    }
}
