package com.kristian.armors;

public class Armor implements ArmorInterface{

    String armorType;
    String placement;
    int hp;
    int strength;
    int dexterity;
    int intelligence;
    int level;

    int upGradeHp;
    int upGradeStr;
    int upGradeDext;
    int upGradeIntg;


    public Armor(String armorType,String placement, int hp, int strength, int dexterity, int intelligence, int upHp, int upStr, int upDext, int upIntg) {
        this.armorType=armorType;
        this.placement=placement;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
        /*bonus parameters*/
        this.upGradeHp =upHp;
        this.upGradeStr =upStr;
        this.upGradeDext =upDext;
        this.upGradeIntg =upIntg;
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

    public int getUpGradeHp() {
        return upGradeHp;
    }

    public int getUpGradeStr() {
        return upGradeStr;
    }

    public int getUpGradeDext() {
        return upGradeDext;
    }

    public int getUpGradeIntg() {
        return upGradeIntg;
    }

    public String getPlacement() {
        return placement;
    }

    @Override
    public void levelUpArmor(int lvlUp) {
        setLevel(getLevel()+lvlUp);
    }

    @Override
    public int getArmorBonusHP() {
        return calculateArmorPlacement(hp+ getUpGradeHp()*level);
    }

    @Override
    public int getArmorBonusDext() {
        return calculateArmorPlacement(dexterity+ getUpGradeDext()*level);
    }

    @Override
    public int getArmorBonusIntg() {
        return calculateArmorPlacement(intelligence+ getUpGradeIntg()*level);
    }

    @Override
    public int getArmorBonusStr() {
        return calculateArmorPlacement(strength+ getUpGradeStr()*level);
    }
/**
 * calculate armor bonus on placement */
    @Override
    public int calculateArmorPlacement(int intToCalc) {
        float calculatedInt;

        switch (placement.toLowerCase()){
            case "body" :
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
