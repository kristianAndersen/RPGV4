package com.kristian.armors.armorType;

import com.kristian.armors.Armor;

public class ArmorCloth extends Armor {

    private static int upGradeHP =5;
    private static int uPGradeStrenght =0;
    private static int uPGradeDexterity =1;
    private static int uPGradeintelligence =2;

    public ArmorCloth(String placement) {

        super( "Cloth",placement,10, 0, 1, 3, upGradeHP, uPGradeStrenght, uPGradeDexterity, uPGradeintelligence);

    }

}
