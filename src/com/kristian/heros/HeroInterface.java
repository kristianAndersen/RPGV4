package com.kristian.heros;

import com.kristian.armors.Armor;
import com.kristian.weapons.Weapon;

public interface HeroInterface {
    public void heroLevelUp(int lvlUp);
    public void heroAddXP(int newXP);
    public void heroAddWeapon(Weapon weapon);
    public void heroAddArmor(Armor armor);
    public int heroAttack();
}
