
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedList;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class SortedCitesStream {
    
      CitiesOpenCV open=new CitiesOpenCV();
      
       public  List<CitiesPojo> Filter(String fileName ,String country){
             List<CitiesPojo> cities= open.opencsv(fileName);
             List<CitiesPojo> matchedcities= new ArrayList();
             matchedcities = cities.stream().filter(b -> b.getCountry().trim()== country).collect(Collectors.toList());
               return matchedcities;
        }
      

    }
    
}
