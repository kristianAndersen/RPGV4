package com.kristian.armors.armorType;
import com.kristian.armors.Armor;

public class ArmorPlate extends Armor {

    private static final int upGradeHP =12;
    private static final int uPgradeStrenght =2;
    private static final int uPGradeDexterity =1;
    private static final int uGGradeintelligence =0;

    public ArmorPlate(String placement) {

        super( "Plate",placement,30, 3, 1, 0, upGradeHP, uPgradeStrenght, uPGradeDexterity, uGGradeintelligence);

    }
}
