package com.kristian.weapons.weaponType;

import com.kristian.weapons.Weapon;

public class WeaponMagic extends Weapon {

    private static final int baseDamage=25;
    private static final double damageAmplifyer=3;
    private static final int scale = 2;
    private static final String weaponType="Magic";

    public WeaponMagic(String weaponName,int level ) {
        super(weaponName,level,baseDamage,scale,weaponType,damageAmplifyer);

    }
}
