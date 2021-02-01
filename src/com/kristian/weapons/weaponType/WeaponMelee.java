package com.kristian.weapons.weaponType;

import com.kristian.weapons.Weapon;

public class WeaponMelee extends Weapon {

    private static int baseDamage=15;
    private static double damageAmplifyer=1.5;
    private static int scale = 2;
    private static String weaponType="Melee";
    public WeaponMelee(String weaponName,int level ) {
        super(weaponName,level,baseDamage,scale,weaponType,damageAmplifyer);

    }

}
