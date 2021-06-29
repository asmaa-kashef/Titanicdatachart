
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class SortedCities {
    CitiesOpenCV open=new CitiesOpenCV();
    public  LinkedList<CitiesPojo> Filter(String fileName ,String country){
        LinkedList<CitiesPojo> cities= open.opencsv(fileName);
        for(CitiesPojo i:cities){
            if((i.getCountry().trim()).equals(country)){
                cities.add(i);

            }

            // List<CitiesPojo> CitiesName = cities.stream().filter(b -> b.getcountry_name()== Country).collect(toList());

        }
        return cities;

    }
    // put filtered city in hash map 
    
    public HashMap<String, LinkedList<CitiesPojo>> createdMap(LinkedList<CitiesPojo> l1) {
        HashMap<String, LinkedList<CitiesPojo>> myMap = new HashMap<>();
        for (CitiesPojo c :l1) {
            LinkedList<CitiesPojo> a = new LinkedList<>();
            if (!myMap.containsKey(c.getCountry())) {
                a.add(c);
                myMap.put(c.getCountry(),a);
            }
            else {
                myMap.get(c.getCountry()).add(c);
            }
        }
        return myMap;
    }
    
    
    //sort the hash map
    public LinkedList<CitiesPojo> sortedCity(HashMap<String,LinkedList<CitiesPojo>> p){
         LinkedList<CitiesPojo> citiesSorted=new LinkedList<>();
        for (Map.Entry<String,LinkedList<CitiesPojo>> entry : p.entrySet())
        {
           
            for(CitiesPojo c:entry.getValue()){
                citiesSorted.add(c);
            }
            citiesSorted.sort(new SortbyPopulatio());
            
        }
        return citiesSorted;
    }
}

  

