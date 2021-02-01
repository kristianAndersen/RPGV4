package com.kristian.armors;

public interface ArmorInterface {
    public void levelUpArmor(int lvlUp);
    public int getArmorBonusHP();
    public int getArmorBonusDext();
    public int getArmorBonusIntg();
    public int getArmorBonusStr();
    int calculateArmorPlacement(int intToCalc);
}
