package com.kristian.weapons.weaponType;

import com.kristian.weapons.Weapon;

public class WeaponRanged extends Weapon {

    private static int baseDamage=5;
    private static double damageAmplifyer=2;
    private static int scale = 3;
    private static String weaponType="Ranged";

    public WeaponRanged(String weaponName,int level ) {
        super(weaponName,level,baseDamage,scale,weaponType,damageAmplifyer);

    }
}
