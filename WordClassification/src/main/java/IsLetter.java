/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class IsLetter {
     public boolean classify(String s){
       return((!s.equals(" ") && s != null)&& (s.chars().allMatch(b->Character.isLetter(b))));
   } 
    
}
