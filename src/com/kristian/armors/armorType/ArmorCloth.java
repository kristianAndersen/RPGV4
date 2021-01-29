package com.kristian.armors.armorType;

import com.kristian.armors.Armor;

public class ArmorCloth extends Armor {

    private static int upHp=5;
    private static int upStr=0;
    private static int upDext =1;
    private static int upIntg=2;

    public ArmorCloth() {

        super( "Cloth",10, 0, 1, 3,upHp,upStr,upDext,upIntg);

    }

}
