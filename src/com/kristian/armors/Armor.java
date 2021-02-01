package com.kristian.armors;

public class Armor implements ArmorInterface{

    String armorType;
    String placement;
    int hp;
    int strength;



    int baseStrength;
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
        this.baseStrength=strength;
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

    public int getArmorHp() {
        return calculateArmorPlacement(hp);
    }

    public void setArmorHp(int hp) {
        this.hp = calculateArmorPlacement(hp);
    }
    public int getBaseStrength() {
        return baseStrength;
    }

    public int getArmorStrength() {
        return calculateArmorPlacement(strength);
    }

    public void setArmorStrength(int strength) {
        this.strength = calculateArmorPlacement(strength);
    }

    public int getArmorDexterity() {
        return calculateArmorPlacement(dexterity);
    }

    public void setArmorDexterity(int dexterity) {
        this.dexterity = calculateArmorPlacement(dexterity);
    }

    public int getArmorIntelligence() {
        return calculateArmorPlacement(intelligence);
    }

    public void setArmorIntelligence(int intelligence) {
        this.intelligence = calculateArmorPlacement(intelligence);
    }

    public int getArmorLevel() {
        return level;
    }

    public void setArmorLevel(int level) {
        this.level = level;
    }

    public int getArmorUpGradeHp() {
        return upGradeHp;
    }

    public int getArmorUpGradeStr() {
        return upGradeStr;
    }

    public int getArmorUpGradeDext() {
        return upGradeDext;
    }

    public int getArmorUpGradeIntg() {
        return upGradeIntg;
    }

    public String getArmorPlacement() {
        return placement;
    }

    @Override
    public void levelUpArmor(int lvlUp) {

        setArmorLevel(getArmorLevel()+lvlUp);
        setArmorHp(getArmorBonusHP());
        setArmorStrength(getArmorBonusStr());
        setArmorDexterity(getArmorBonusDext());
        setArmorIntelligence(getArmorBonusIntg());
    }

    @Override
    public int getArmorBonusHP() {
        return hp+= getArmorUpGradeHp()*level;
    }

    @Override
    public int getArmorBonusDext() {
        return dexterity+= getArmorUpGradeDext()*level;
    }

    @Override
    public int getArmorBonusIntg() {
        return intelligence+= getArmorUpGradeIntg()*level;
    }

    @Override
    public int getArmorBonusStr() {
        return strength+= getArmorUpGradeStr()*level;
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
