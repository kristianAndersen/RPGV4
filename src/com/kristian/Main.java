package com.kristian;

import com.kristian.heros.Hero;
import com.kristian.heros.heroType.HeroWarrior;
import com.kristian.prettyPrint.PrettyPrint;

public class Main {

    public static void main(String[] args) {

        PrettyPrint pp = PrettyPrint.getInstance();
        Hero warrior =new HeroWarrior();
        pp.printItpretty(warrior);

        warrior.levelUp();

        pp.printItpretty(warrior);

    }

}

