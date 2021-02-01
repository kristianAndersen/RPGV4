package com.kristian.heros.heroType;

import com.kristian.heros.Hero;

public class HeroWarrior extends Hero{

    private static int upGradeHp =30;
    private static int upGradeStr =5;
    private static int upGradeDext =2;
    private static int upGradeIntg=1;

    public HeroWarrior() {
        super( "Warrior",150, 10, 3, 1, upGradeHp, upGradeStr, upGradeDext,upGradeIntg);
    }

}
