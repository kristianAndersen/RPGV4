package com.kristian.prettyPrint;

import com.kristian.heros.Hero;
import com.kristian.armors.Armor;

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

 
    public static void printHero(Hero heroInfo) {

      String kind=heroInfo.getHeroType();
      int hp =heroInfo.getHp();
      int str = heroInfo.getStrength();
      int dext=heroInfo.getDexterity();
      int intg=heroInfo.getIntelligence();
      int level=heroInfo.getLevel();
      int xp=heroInfo.getXp();

  
         System.out.printf("%-1s %-20s %-1s","┌","────────────────────","┐\n");
         System.out.printf("%-1s %-20s %-1s","│","      "+kind+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│","────────────────────","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," HP: "+hp+"         ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Str: "+str+"       ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Dex: "+dext+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Int: "+intg+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Lvl: "+level+"     ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," XP: "+xp+"         ","│\n");
         System.out.printf("%-1s %-20s %-1s","└","────────────────────","┘\n");
         
         
     }

    public static void printArmor(Armor armorInfo) {

        String kind = armorInfo.getArmorType();
        int hp = armorInfo.getBonusHP();
        int str = armorInfo.getBonusStr();
        int dext = armorInfo.getBonusDext();
        int intg = armorInfo.getBonusInth();
        int level = armorInfo.getLevel();


        System.out.printf("%-1s %-20s %-1s", "┌", "────────────────────", "┐\n");
        System.out.printf("%-1s %-20s %-1s", "│", "      " + kind + "      ", "│\n");
        System.out.printf("%-1s %-20s %-1s", "│", "────────────────────", "│\n");
        System.out.printf("%-1s %-20s %-1s", "│", " Armor Lvl: " + level + "", "│\n");
        System.out.printf("%-1s %-20s %-1s", "│", " Bonus HP: " + hp + "   ", "│\n");

        /*If the Armor do not have strength no need to print it!*/
        if (str!=0){
            System.out.printf("%-1s %-20s %-1s", "│", " Bonus Str: " + str + " ", "│\n");
        }
        System.out.printf("%-1s %-20s %-1s","│"," Bonus Dex: "+dext+"","│\n");
        System.out.printf("%-1s %-20s %-1s","│"," Bonus Int: "+intg+"","│\n");
        System.out.printf("%-1s %-20s %-1s","└","────────────────────","┘\n");


    }
    
}
