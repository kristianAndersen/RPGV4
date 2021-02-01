package com.kristian.heros;

import com.kristian.armors.Armor;
import com.kristian.weapons.Weapon;

public interface HeroInterface {

    public void levelUp(int lvlUp);
    public void addXP(int newXP);
    public void addWeapon(Weapon weapon);
    public  void addArmor(Armor armor);
    public int attack();

}
