package com.kristian.weapons;

public interface WeaponInterface {

     int getDamage();
     int getTotalDamage();
     String getWeaponName();
     String getWeaponType();
     void weaponLevelUp(int lvl);
}
