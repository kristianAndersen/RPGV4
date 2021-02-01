package com.kristian.heros;

import com.kristian.armors.Armor;
import com.kristian.weapons.Weapon;

public class Hero implements  HeroInterface{



    String heroType;
    int hp;
    int strength;
    int dexterity;
    int intelligence;
    int level;
    Weapon weapon;
    Armor Armor;
    int upHp;
    int upStr;
    int upDext;
    int upIntg;



    int xp=0;
    int xpNext=100;
    int heroAmplifyer;


    int heroDamage;
    int damageToDeal;

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

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
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

        if(newXP>=xpNext){

            int newLvl = newXP/100;
            levelUp(newLvl);


        }else{
            System.out.println("tjuppelup");
            setXp(newXP);

        }


    }

    @Override
    public void addWeapon(Weapon weapon) {

        /**reset weapon damage if weapon already exist*/
        if(this.weapon!=null){
            damageToDeal-= (int) Math.round(this.weapon.getDamage()+(heroAmplifyer * this.weapon.getDamageAmplifyer()));
        }
        this.weapon=weapon;
        calculateWeapon();

    }
    public void calculateWeapon(){

        String wType= weapon.getWeaponType();

        switch (wType){
            case "Melee":
                heroAmplifyer=getStrength();
                break;
            case "Ranged":
                heroAmplifyer=getDexterity();
                break;
            case "magic":
                heroAmplifyer=getIntelligence();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + wType);
        }

        damageToDeal= (int) Math.round(weapon.getDamage()+(heroAmplifyer * weapon.getDamageAmplifyer()));
        System.out.println("Equipping Hero with "+weapon.getWeaponType()+" "+damageToDeal);
    }





    @Override
    public int attack() {

        return damageToDeal;

    }

    @Override
    public void addArmor(Armor armor) {
    /*if our hero has armor in an already filled slot then remove it**/
        if(this.Armor!=null && this.Armor.getPlacement()==armor.getPlacement()){
            System.out.println("New armor up");
            setHp(hp-this.Armor.getHp());
            setStrength(strength-this.Armor.getStrength());
            setDexterity(dexterity-this.Armor.getDexterity());
            setIntelligence(intelligence-this.Armor.getIntelligence());
        }
        this.Armor=armor;
        setHp(hp+=armor.getHp());
        setStrength(strength+=armor.getStrength());
        setDexterity(dexterity+=armor.getDexterity());
        setIntelligence(intelligence+=armor.getIntelligence());
    }




}
