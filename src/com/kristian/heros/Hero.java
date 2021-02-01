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
    int untilNextXp =100;
    int heroAmplifier;

    int heroDamage;



    int damageToDeal;

    public Hero(String heroType, int hp, int strength, int dexterity, int intelligence, int upHp, int upStr, int upDext, int upIntg) {
        this.heroType=heroType;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level=1;
        /*level up parameters*/
        this.upHp=upHp;
        this.upStr=upStr;
        this.upDext=upDext;
        this.upIntg=upIntg;

    }

    public String getHeroType() {
        return heroType;
    }

    public int getHeroHp() {
        return hp;
    }

    public void setHeroHp(int hp) {

        this.hp = hp;
    }

    public int getHeroStrength() {

        return strength;
    }

    public void setHeroStrength(int strength) {

        this.strength = strength;
    }

    public int getHeroDexterity() {

        return dexterity;
    }

    public void setHeroDexterity(int dexterity) {

        this.dexterity = dexterity;
    }

    public int getHeroIntelligence() {

        return intelligence;
    }

    public void setHeroIntelligence(int intelligence) {

        this.intelligence = intelligence;
    }

    public int getHeroLevel() {

        return level;
    }

    public void setHeroLevel(int level) {

        this.level = level;
    }

    public int getHeroUpHp() {

        return upHp;
    }

    public int getHeroUpStr() {

        return upStr;
    }

    public int getHeroUpDext() {

        return upDext;
    }

    public int getHeroUpIntg() {

        return upIntg;
    }
    public int getHeroXp() {

        return xp;
    }

    public void setHeroXp(int xp) {

        this.xp += xp;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {

        this.heroDamage = heroDamage;
    }

    public int getDamageToDeal() {
        return damageToDeal;
    }

    public void setDamageToDeal(int damageToDeal) {
        this.damageToDeal = damageToDeal;
    }
    /**Update the heroes Armor if Armor i leveled up*/
    public void updateHeroArmor(){
        if(this.Armor==this.Armor){

            setHeroHp(this.hp-=Armor.getArmorBonusHP() );
            setHeroHp(this.hp+=Armor.getArmorBonusHP() );

            setHeroDexterity(this.dexterity-=Armor.getArmorBonusDext());
            setHeroDexterity(this.dexterity+=Armor.getArmorBonusDext());

            setHeroIntelligence(this.intelligence-=Armor.getArmorBonusIntg());
            setHeroIntelligence(this.intelligence+=Armor.getArmorBonusIntg());

            setHeroStrength(this.strength-=Armor.getArmorBonusStr());
            setHeroStrength(this.strength+=Armor.getArmorBonusStr());

        }



    }

    @Override
    public void heroLevelUp(int lvlUp) {

        setHeroLevel( level+=lvlUp );
        setHeroHp( hp+= getHeroUpHp()*(getHeroLevel()-1) );
        setHeroStrength( strength+= getHeroUpStr()*(getHeroLevel()-1));
        setHeroDexterity( dexterity+= getHeroUpDext()*(getHeroLevel()-1) );
        setHeroIntelligence(intelligence+= getHeroUpIntg()*(getHeroLevel()-1));

        setDamageToDeal( (int) Math.round(weapon.getTotalDamage()+(heroAmplifier * weapon.getDamageAmplifier())) );
    }

    @Override
    public void heroAddXP(int newXP) {

        if(newXP>= untilNextXp) {
            /**for every 100 new xp increase the hero a level.*/
            int newLvl = newXP / untilNextXp;
            heroLevelUp(newLvl);
        }

            int left = newXP % untilNextXp;
            setHeroXp((int) Math.round((left+untilNextXp)*1.1));

    }

    @Override
    public void heroAddWeapon(Weapon weapon) {

        /**reset weapon damage if weapon already exist*/
        if(this.weapon!=null){
            damageToDeal-= (int) Math.round(this.weapon.getTotalDamage()+(heroAmplifier * this.weapon.getDamageAmplifier()));
        }
        this.weapon=weapon;
        calculateWeapon();
    }

    public void calculateWeapon(){

        String wType= weapon.getWeaponType();

        switch (wType.toLowerCase()){
            case "melee":
                heroAmplifier = getHeroStrength();
                break;
            case "ranged":
                heroAmplifier = getHeroDexterity();
                break;
            case "magic":
                heroAmplifier = getHeroIntelligence();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + wType);
        }

        setDamageToDeal( (int) Math.round(weapon.getTotalDamage()+(heroAmplifier * weapon.getDamageAmplifier())) );
    }

    @Override
    public int heroAttack() {
        return getDamageToDeal();
    }

    @Override
    public void heroAddArmor(Armor armor) {
    /*if our hero has armor in an already filled slot then remove it**/
        if(this.Armor!=null && this.Armor.getArmorPlacement()==armor.getArmorPlacement() ){

            setHeroHp(hp-=this.Armor.getArmorHp());
            setHeroStrength(strength-=this.Armor.getArmorStrength());
            setHeroDexterity(dexterity-=this.Armor.getArmorDexterity());
            setHeroIntelligence(intelligence-=this.Armor.getArmorIntelligence());
        }

        this.Armor=armor;
        setHeroHp(hp+=armor.getArmorHp());
        setHeroStrength(strength+=armor.getArmorStrength());
        setHeroDexterity(dexterity+=armor.getArmorDexterity());
        setHeroIntelligence(intelligence+=armor.getArmorIntelligence());
    }
}
