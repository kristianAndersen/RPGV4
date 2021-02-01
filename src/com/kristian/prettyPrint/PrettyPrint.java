package com.kristian.prettyPrint;

import com.kristian.heros.Hero;
import com.kristian.armors.Armor;
import com.kristian.weapons.Weapon;

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
      int hp =heroInfo.getHeroHp();
      int str = heroInfo.getHeroStrength();
      int dext=heroInfo.getHeroDexterity();
      int intg=heroInfo.getHeroIntelligence();
      int level=heroInfo.getHeroLevel();
      int xp=heroInfo.getHeroXp();
      int attack=heroInfo.heroAttack();

        System.out.printf("%1s %20s %1s%n","┌","─────────────────────────────────────────","┐");
        System.out.printf("%1s %-9s%n %9s %8s %8s %-8s%n %8s %8s%n"," ",kind,"HP: "+hp ,"Str: "+str, "Dex: "+dext, "Int: "+intg,"Lvl: "+level,"XP to next: "+xp);
        if(attack!=0){
            System.out.printf("%1s %20s %1s%n","┌","─────────────────────────────────────────","┐");
            System.out.printf("%1s %-1s %5s %-1s%n"," ","***",""+kind+" Attack "+attack+"","***");
        }
        System.out.printf("%1s %20s %1s%n","└","─────────────────────────────────────────","┘");


     }

    public static void printArmor(Armor armorInfo) {

        String kind = armorInfo.getArmorType();
        int hp = armorInfo.getArmorHp();
        int str = armorInfo.getArmorStrength();
        int dext = armorInfo.getArmorDexterity();
        int intg = armorInfo.getArmorIntelligence();
        int level = armorInfo.getArmorLevel();

        System.out.printf("%-1s %-20s %-1s", "┌", "────────────────────", "┐\n");
        System.out.printf("%-1s %-20s %-1s", "│", "      " + kind + "      ", "│\n");
        System.out.printf("%-1s %-20s %-1s", "│", "────────────────────", "│\n");
        System.out.printf("%-1s %-20s %-1s", "│", " Armor Lvl: " + level + "", "│\n");
        System.out.printf("%-1s %-20s %-1s", "│", " Bonus HP: " + hp + "   ", "│\n");

        /*If the Armor do not have strength no need to print it!*/
        if (str!=0){
            System.out.printf("%-1s %-20s %-1s", "│", " Bonus Str: " + str + " ", "│\n");
        }
        if (dext!=0) {
            System.out.printf("%-1s %-20s %-1s", "│", " Bonus Dex: " + dext + "", "│\n");
        }
        if (intg!=0) {
            System.out.printf("%-1s %-20s %-1s", "│", " Bonus Int: " + intg + "", "│\n");
        }
        System.out.printf("%-1s %-20s %-1s","└","────────────────────","┘\n");


    }
    public static void printWeapon(Weapon weaponInfo) {

        String kind = weaponInfo.getWeaponName();
        String wpt = weaponInfo.getWeaponType();
        int level = weaponInfo.getWeaponLevel();
        int Dmg = weaponInfo.getTotalDamage();




        System.out.printf("%-1s %-25s %-1s", "┌","─────────────────────────", "┐\n");
        System.out.printf("%-1s %-25s %-1s", "│"," "+kind+"", "│\n");
        System.out.printf("%-1s %-25s %-1s", "│","─────────────────────────", "│\n");
        System.out.printf("%-1s %-25s %-1s", "│"," Weapon type: " + wpt + "", "│\n");
        System.out.printf("%-1s %-25s %-1s", "│"," Weapon level: " + level + "   ", "│\n");
        System.out.printf("%-1s %-25s %-1s","│"," Damage: "+Dmg+"","│\n");
        System.out.printf("%-1s %-25s %-1s","└","─────────────────────────","┘\n");


    }



    
}
