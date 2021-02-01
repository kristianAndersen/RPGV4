package com.kristian.heros.heroType;

import com.kristian.heros.Hero;

public class HeroMage extends Hero {

    private static final int upGradeHp =15;
    private static final int upGradeStr =1;
    private static final int upGradeDext =2;
    private static final int upGradeIntg =5;

    public HeroMage() {
        super( "Mage",100, 11, 12, 55, upGradeHp, upGradeStr, upGradeDext, upGradeIntg);
    }
}
