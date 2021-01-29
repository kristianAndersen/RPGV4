package com.kristian.prettyPrint;

import com.kristian.heros.Hero;

public class PrettyPrint {

    private static PrettyPrint instance = null;


    private PrettyPrint() {
       // Exists only to defeat instantiation.
    }

    public static PrettyPrint getInstance() {
       if (instance == null) {
          instance = new PrettyPrint();
       }
       return instance;
    }

 
    public static void printItpretty(Hero heroInfo) {

      String kind=heroInfo.getHeroType();
      int hp =heroInfo.getHp();
      int str = heroInfo.getStrength();
      int dext=heroInfo.getDexterity();
      int intg=heroInfo.getIntelligence();
      int level=heroInfo.getLevel();

  
         System.out.printf("%-1s %-20s %-1s","┌","────────────────────","┐\n");
         System.out.printf("%-1s %-20s %-1s","│","      "+kind+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│","────────────────────","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," HP: "+hp+"         ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Str: "+str+"       ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Dex: "+dext+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Int: "+intg+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Lvl: "+level+"     ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," XP: "+level+"         ","│\n");
         System.out.printf("%-1s %-20s %-1s","└","────────────────────","┘\n");
         
         
     }
    
}
