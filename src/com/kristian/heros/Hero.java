package com.kristian.heros;

public class Hero implements  HeroInterface{



    String heroType;


    int hp;
    int strength;
    int dexterity;
    int intelligence;
    int level;

    int upHp;
    int upStr;
    int upDext;
    int upIntg;

    public Hero(String heroType, int hp, int strength, int dexterity, int intelligence, int upHp, int upStr, int upDext, int upIntg) {
        this.heroType=heroType;
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

    public String getHeroType() {
        return heroType;
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
    public void levelUp() {
        setLevel(level+1);
        setHp(hp+getUpHp());
        setDexterity(dexterity+getUpDext());
        setStrength(strength+getUpStr());
        setIntelligence(intelligence+getIntelligence());

    }

    @Override
    public void addXP() {

    }

    @Override
    public void addWeapon() {

    }

    @Override
    public void addArmor() {

    }

}
