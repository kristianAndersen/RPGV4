package com.kristian.weapons;

import com.kristian.armors.ArmorInterface;

public class Weapon implements WeaponInterface {

    String weaponName;
    String weaponType;
    int baseDamage;
    int scale;

    int weaponLevel;
    double damageAmplifyer=0;



    public Weapon( String weaponName, int weaponLevel, int baseDamage, int scale,String weaponType,double damageAmplifyer){

        this.weaponName=weaponName;
        this.weaponType=weaponType;
        this.baseDamage=baseDamage;
        this.scale=scale;
        this.weaponLevel=weaponLevel;
        this.damageAmplifyer=damageAmplifyer;
    }
    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public double getDamageAmplifyer() {
        return damageAmplifyer;
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
}
