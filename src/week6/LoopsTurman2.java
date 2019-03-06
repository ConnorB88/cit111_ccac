/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author connor.britton
 */
public class LoopsTurman2 {
     public static void main(String[] args){
         int ctl = 8;
         int target = 10; 
         boolean keepLooping = true;
         while(keepLooping){
             if(ctl > target){
                 keepLooping = false;
             }
             ctl++;
             System.out.println("ctl: " + ctl);
             System.out.println("target " + target);
             System.out.println("keepLooping: " + keepLooping);
             System.out.println("***");
         }
     }
}
