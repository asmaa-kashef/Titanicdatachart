/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
public class compare {
    
    public static String betterString(String S1,String S2,BiPredicate<String,String>p){
        if(p.test(S1, S2))
        {
        return S1;
        
        }
        else 
            return S2;
        }
    
}
