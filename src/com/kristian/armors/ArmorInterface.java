package com.kristian.armors;

public interface ArmorInterface {
    public void levelUp(int lvlUp);

    public int getBonusHP();
    public int getBonusDext();
    public int getBonusInth();
    public int getBonusStr();

    int calcLevelUp(int intToCalc);
}
