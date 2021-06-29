/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
import java.util.*;
public class SortbyPopulatio implements Comparator<CitiesPojo>{
    public int compare(CitiesPojo a, CitiesPojo b)
    {
      
        return a.getPopulationInCity()-b.getPopulationInCity();
    }
}