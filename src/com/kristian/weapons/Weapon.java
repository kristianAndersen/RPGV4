package com.kristian.weapons;

public class Weapon implements WeaponInterface {

    String weaponName;
    String weaponType;
    int baseDamage;
    int scale;
    int weaponLevel;
    double damageAmplifier;

    public Weapon( String weaponName, int weaponLevel, int baseDamage, int scale,String weaponType,double damageAmplifier){

        this.weaponName=weaponName;
        this.weaponType=weaponType;
        this.baseDamage=baseDamage;
        this.scale=scale;
        this.weaponLevel=weaponLevel;
        this.damageAmplifier =damageAmplifier;
    }



    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public double getDamageAmplifier() {
        return damageAmplifier;
    }



    @Override
    public int getDamage() {
        return baseDamage;
    }

    @Override
    public int getTotalDamage() {
        return (int) Math.floor(baseDamage+(weaponLevel*scale));
    }

    @Override
    public String getWeaponName() {
        return this.weaponName;
    }

    @Override
    public String getWeaponType() {
        return this.weaponType;
    }

    @Override
    public void weaponLevelUp(int lvl) {
        setWeaponLevel(getWeaponLevel()+lvl);
    }
}
