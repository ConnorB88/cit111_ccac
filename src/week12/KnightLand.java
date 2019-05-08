/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;
import java.util.Scanner;
/**
 *
 * @author connor.britton
 */
public class KnightLand {
     public static void main(String[] args){
         Knight firstKnight = new Knight();
         // you are created
         Scanner keyScan = new Scanner(System.in);
         firstKnight.health = 100;
         firstKnight.attackStrength = 0;
         firstKnight.defendStrength = 0;
         System.out.println("**********You are about to battle your enemy you have to get prepared before you do.**********");
         System.out.println("Your current health is " + firstKnight.health);
         System.out.println("Choose a name for your Knight");
         firstKnight.name = keyScan.next();
         System.out.println("Choose your knights colors");
         firstKnight.colors = keyScan.next();
        
         
         System.out.println("Now choose which weapon you would want(Type in the number):");
       
         System.out.println ("(1)Mace: + 23 Attack, - 1 Defend");
         System.out.println ("(2)Warhammer: + 30 attack, - 5 Defend");
         System.out.println ("(3)Sword: + 40 Attack, - 11 Defend");
         System.out.println ("(4)Spear: + 25 Attack, - 3 Defend");
         System.out.println ("(5)Flail: + 35 Attack, - 7 Defend");
         System.out.println ("(6)Halberd: + 28 Attack, - 4 Defend");
         System.out.println ("(7)Dagger: + 21 Attack, - 0 Defend");
         System.out.println ("(8)Lance: + 39 Attack, - 10 Defend");
     
         int weaponresponse = keyScan.nextInt();
         
         switch(weaponresponse){
             // weapon stats
             case 1:
             firstKnight.attackStrength += 23;
             firstKnight.defendStrength -= 1; 
             break;
             case 2:
             firstKnight.attackStrength += 30;
             firstKnight.defendStrength -= 5;
             break;
             case 3:
             firstKnight.attackStrength += 40;
             firstKnight.defendStrength -= 11; 
             break;
             case 4:
             firstKnight.attackStrength += 25;
             firstKnight.defendStrength -= 3;
             break;
             case 5:
             firstKnight.attackStrength += 35;
             firstKnight.defendStrength -= 7;
             break;
             case 6:
             firstKnight.attackStrength += 28;
             firstKnight.defendStrength -= 4;
             break;
             case 7:
             firstKnight.attackStrength += 21; 
             firstKnight.attackStrength += 0; 
             break;
             case 8:
             firstKnight.attackStrength += 39; 
             firstKnight.defendStrength -= 10; 
             break;
             default:
             break;
         }
    
         System.out.println("Now choose what armor set that you would want(Type in the number):");
         
         System.out.println ("(1)Chainmail: + 42 Defend , - 10 Attack");
         System.out.println ("(2)Full plated steel armour: + 68 Defend, - 20 Attack ");
         System.out.println ("(3)Leather armour: + 14 Defend, + 25 Attack ");
         System.out.println ("(4)Reinforced Chainmail: + 50 Defend, - 15 Attack ");
         System.out.println ("(5)Scale armour: + 34 Defend, - 5 Attack ");
         int armourresponse = keyScan.nextInt();
         switch(armourresponse){
             // armour stats
             case 1:
             firstKnight.attackStrength -= 10;
             firstKnight.defendStrength += 42;
             break;
             case 2:
             firstKnight.attackStrength -= 20;
             firstKnight.defendStrength += 68;   
             break;
             case 3:
             firstKnight.attackStrength += 25;
             firstKnight.defendStrength += 14;
             break;
             case 4:
             firstKnight.attackStrength -= 15;
             firstKnight.defendStrength += 50; 
             break;
             case 5:
             firstKnight.attackStrength -= 5;
             firstKnight.defendStrength += 34;
             break;
             default:
             break;
         }
             
         System.out.println("Now choose your shield (Type in the number):");
           
         System.out.println ("(1)Kite Shield: + 30 Defend , +5 Attack");
         System.out.println ("(2)Round Small shield: + 5 Defend, + 30 Attack ");
         System.out.println ("(3)Heather Shield: + 20 Defend, + 20 Attack ");
         System.out.println ("(4)Celtic Shield: + 15 Defend, + 25 Attack ");
         
         int shieldresponse = keyScan.nextInt();
         
         switch(shieldresponse){
             // shield stats
             case 1:
             firstKnight.attackStrength += 5;
             firstKnight.defendStrength += 30;
             break;
             case 2:
             firstKnight.attackStrength += 30;
             firstKnight.defendStrength += 5;   
             break;
             case 3:
             firstKnight.attackStrength += 20;
             firstKnight.defendStrength += 20;
             break;
             case 4:
             firstKnight.attackStrength += 25;
             firstKnight.defendStrength += 15; 
             break;
             default:
             break;
         }
         Knight secondKnight = new Knight();
         // the enemy is created
         secondKnight.attackStrength = 0;
         secondKnight.defendStrength = 0;
         secondKnight.enemyhealth = 0;
         System.out.println("Now choose what enemy you want to fight(Type in the number):");
         System.out.println("(1)Kingsgaurd defender");
         System.out.println("(2)Demon Knight");
         System.out.println("(3)Imperial Knight");
         System.out.println("(4)Maceman");
         System.out.println("(5)Eliteguard");
         System.out.println("(6)King");
          int enemyresponse = keyScan.nextInt();
         
         switch(enemyresponse){
             // enemies stats
             case 1:
             secondKnight.enemyhealth = 100;
             secondKnight.attackStrength = 34;
             secondKnight.defendStrength = 80;
             break;
             case 2:
             secondKnight.enemyhealth = 130;
             secondKnight.attackStrength = 87;
             secondKnight.defendStrength = 30;
             break;
             case 3:
             secondKnight.enemyhealth = 100;
             secondKnight.attackStrength = 58;
             secondKnight.defendStrength = 55;
             break;
             case 4:
             secondKnight.enemyhealth = 85;
             secondKnight.attackStrength = 36;
             secondKnight.defendStrength = 44;
             break;
             case 5:
             secondKnight.enemyhealth = 110;
             secondKnight.attackStrength = 41;
             secondKnight.defendStrength = 58;             
             break;
             case 6:
             secondKnight.enemyhealth = 150;
             secondKnight.attackStrength = 66;
             secondKnight.defendStrength = 79;             
             break;
             default:
             break;
         }
         // dont let your attackStrength or defense strength below 0
         if(firstKnight.attackStrength < 0){
             firstKnight.attackStrength = 0;
         }else if(firstKnight.defendStrength < 0){
             firstKnight.defendStrength = 0;
         }
        
       System.out.println("Your total attack strength is " + firstKnight.attackStrength);
       System.out.println("Your total defense strength is " + firstKnight.defendStrength);
       System.out.println("Now choose to Attack(1) or Defend(2) (Type in 1 for attacking, type in 2 for defending):");
       
      
       while(secondKnight.enemyhealth > 0 || firstKnight.health > 0){
           // while your health is above 0 or enemies keep choosing to attack or defend
       System.out.println("Battle until the death!(Neither of you died yet)");
       int option = keyScan.nextInt();
       if(option == 1){
           firstKnight.Attack(secondKnight);
           calculateAttack(firstKnight, secondKnight);
       }else if (option == 2){
         firstKnight.Defend(secondKnight);
         calculateDefense(firstKnight, secondKnight);
       }
     }        
  }
     public static void calculateAttack(Knight anyKnight1,Knight anyKnight2){
         // This happens when you attack
        System.out.println("You Attack!");
        if(anyKnight2.enemyhealth < 0){
            anyKnight2.enemyhealth = 0;
        } 
        if(anyKnight1.health < 0)
        {
          anyKnight1.health = 0;  
        }
        System.out.println(anyKnight1.name + " current health after attacking is: " + anyKnight1.health + " and your enemies health is at " + anyKnight2.enemyhealth);
        
       if(anyKnight1.health == 0){
            System.out.println("You lost!");
            Runtime.getRuntime().exit(0);
       } else if(anyKnight2.enemyhealth == 0) {
           System.out.println("You won!");
           Runtime.getRuntime().exit(0);
       } else if
        (anyKnight1.health == 100){
             System.out.println("You both had an equal amount of defend and attack strength nothing happend ");
        } 
   }
   public static void calculateDefense(Knight anyKnight1, Knight anyKnight2){
       // This happens when you defend
       System.out.println("You Defend!");
        if(anyKnight2.enemyhealth < 0){
            anyKnight2.enemyhealth = 0;
        } 
        if(anyKnight1.health < 0)
        {
          anyKnight1.health = 0;  
        }
        System.out.println(anyKnight1.name + " current health after defending is: " + anyKnight1.health + " and your enemies health is at " + anyKnight2.enemyhealth);
        
       if(anyKnight1.health == 0){
            System.out.println("You lost!");
            Runtime.getRuntime().exit(0);
       } else if(anyKnight2.enemyhealth == 0) {
           System.out.println("You won!");
           Runtime.getRuntime().exit(0);
       } else if
        (anyKnight1.health == 100){
             System.out.println("You both had an equal amount of defend and attack strength nothing happend ");
        } 
 }
}
