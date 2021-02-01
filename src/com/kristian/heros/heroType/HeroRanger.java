package com.kristian.heros.heroType;

import com.kristian.heros.Hero;

public class HeroRanger extends Hero {

    private static int upGradeHp =20;
    private static int upGradeStr =2;
    private static int upGradeDext =5;
    private static int upGradeIntg =1;

    public HeroRanger() {
        super( "Ranger",120, 5, 10, 2, upGradeHp, upGradeStr, upGradeDext, upGradeIntg);
    }

}
