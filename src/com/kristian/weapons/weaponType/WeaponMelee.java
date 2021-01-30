package com.kristian.weapons.weaponType;

import com.kristian.weapons.Weapon;

public class WeaponMelee extends Weapon {

    int baseDamage=15;
    int scale = 2;


    public WeaponMelee(String weaponName, String weaponType) {
        super(weaponName, weaponType);
    }
}
