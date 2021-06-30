/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String first=compare.betterString("ASMAA","ASMAA", (S1,S2)->true);
        System.out.print(first);
        // TODO code application logic here
        String LONGER=compare.betterString("ASMAA","ASMAA ali", (S1,S2)->S1.length()>S2.length());
        System.out.print(LONGER);
    }
    
}
