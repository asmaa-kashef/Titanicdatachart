/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          IsLetter obj = new IsLetter();
        System.out.println(obj.classify("A$3ma"));
        System.out.println(obj.classify("asmaa"));
    }
    
}
