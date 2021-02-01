package com.kristian.weapons.weaponType;

import com.kristian.weapons.Weapon;

public class WeaponMelee extends Weapon {

    private static final int baseDamage=15;
    private static final double damageAmplifier =1.5;
    private static final int scale = 2;
    private static final String weaponType="Melee";

    public WeaponMelee(String weaponName,int level ) {
        super(weaponName,level,baseDamage,scale,weaponType, damageAmplifier);

    }

}
