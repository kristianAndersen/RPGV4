package com.kristian.armors;

public interface ArmorInterface {

    void levelUpArmor(int lvlUp);
    int getArmorBonusHP();
    int getArmorBonusDext();
    int getArmorBonusIntg();
    int getArmorBonusStr();
    int calculateArmorPlacement(int intToCalc);
}
