
import java.util.ArrayList;
import java.util.List;

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
    SortCities SC=new SortCities();
       List<CitiesPojo>FilteredCites =SC.Filter("C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\java\\Day4\\dataset\\Cities.csv","PSE");
      System.out.println(FilteredCites);
       
        
       
           
          
   
       // List<CitiesPojo> CitiesName = cities.stream().filter(b -> b.getcountry_name()== Country).collect(toList());
     
      }
    
       
        // TODO code application logic here
    }
    

