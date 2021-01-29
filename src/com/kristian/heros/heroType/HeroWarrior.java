package com.kristian.heros.heroType;

import com.kristian.heros.Hero;

public class HeroWarrior extends Hero{

    private static int upHp=30;
    private static int upStr=5;
    private static int upDext =2;
    private static int upIntg=1;

    public HeroWarrior() {



        super( "Warrior",150, 10, 3, 1,upHp,upStr,upDext,upIntg);

    }


}
