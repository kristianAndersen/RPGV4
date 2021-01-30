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



    int xp=0;
    int xpNext=100;


    public Hero(String heroType, int hp, int strength, int dexterity, int intelligence, int upHp, int upStr, int upDext, int upIntg) {
        this.heroType=heroType;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level=1;
        /*bonus parameters*/
        this.upHp=upHp;
        this.upStr=upStr;
        this.upDext=upDext;
        this.upIntg=upIntg;

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
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp += xp;
    }

    @Override
    public void levelUp(int lvlUp) {

        setLevel( level+=lvlUp );

        setHp( getHp()+getUpHp()*(getLevel()-1) );
        setDexterity( getDexterity()+getUpDext()*(getLevel()-1) );
        setStrength( getStrength()+getUpStr()*(getLevel()-1));
        setIntelligence(getIntelligence()+getUpIntg()*(getLevel()-1));

    }

    @Override
    public void addXP(int newXP) {
    /** Lets XP up this hero
     * */
        if(newXP>=xpNext){

            int newLvl = newXP/100;
            levelUp(newLvl);


        }else{
            System.out.println("tjuppelup");
            setXp(newXP);

        }


    }

    @Override
    public void addWeapon() {

    }

    @Override
    public void addArmor() {

    }

}
