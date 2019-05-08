/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

/**
 *
 * @author connor.britton
 */
public class Knight {
    String name;
    int speed;
    boolean sword;
    boolean shield;
    int health;
    int stamina;
    boolean block;
    int blockAmount;
    boolean cape;
    String colors;
    int armourStrength;
    int defendStrength;
    int attackStrength;
    int losthealth;
    int losthealth1;
    int enemyhealth;
    
    public int Defend(Knight KnightK){
      if(defendStrength == KnightK.attackStrength){
          // you both were equal
      }
      else if(defendStrength < KnightK.attackStrength){
          // Losing the defense
          int difference = KnightK.attackStrength - defendStrength;
          losthealth = this.health - difference - 20;
          this.health = losthealth;
          losthealth1 = KnightK.enemyhealth - difference;
          KnightK.enemyhealth = losthealth1;
      }else{
          // Winning the defense
          int difference = defendStrength - KnightK.attackStrength;
          losthealth = this.health - difference;
          this.health = losthealth;
          losthealth1 = KnightK.enemyhealth - difference - 20;
          KnightK.enemyhealth  = losthealth1;
      }
          return this.health;
    }
    public int Attack(Knight KnightS){
       
        if(attackStrength == KnightS.defendStrength){
           // you both were equal
        }else if(attackStrength < KnightS.defendStrength){
            // Losing the attack
           int difference = KnightS.defendStrength - attackStrength;
           losthealth = this.health - difference - 20;
           this.health = losthealth;
           losthealth1 = KnightS.enemyhealth - difference;
           KnightS.enemyhealth = losthealth1;
       }else{
            // Winning the attack
           int difference =  attackStrength - KnightS.defendStrength;
           losthealth = this.health - difference;
           this.health = losthealth;
           losthealth1 = KnightS.enemyhealth - difference - 20;
           KnightS.enemyhealth  = losthealth1;
       }
       return this.health;
   }
}

