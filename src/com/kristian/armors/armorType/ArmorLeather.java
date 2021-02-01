package com.kristian.armors.armorType;

import com.kristian.armors.Armor;

public class ArmorLeather extends Armor {

    private static int upGradeHP =8;
    private static int uPGradeStrenght =1;
    private static int uPGradeDexterity =2;
    private static int uPGradeintelligence =0;

    public ArmorLeather(String placement) {

        super( "Leather",placement,10, 0, 1, 3, upGradeHP, uPGradeStrenght, uPGradeDexterity, uPGradeintelligence);

    }
}
