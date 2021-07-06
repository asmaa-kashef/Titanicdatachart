
import java.util.HashMap;
import java.util.LinkedList;
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
        
        String File_Name="C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\java\\Day4\\dataset\\Cities.csv";
        SortedCities sc= new SortedCities();
        SortedCitesStream St=new SortedCitesStream();
        List<CitiesPojo>Cities_matched= St.Filter(File_Name,"EGY");
         LinkedList<CitiesPojo>Cities_filtered=sc.Filter(File_Name, "EGY");
         System.out.println(Cities_filtered);
         System.out.println(Cities_matched);
//         HashMap<String, LinkedList<CitiesPojo>>CitiesMap= sc.createdMap(Cities_filtered);
//         System.out.println(CitiesMap);
//          LinkedList<CitiesPojo> sortedCity=sc.sortedCity(CitiesMap);
//          System.out.println(sortedCity);
        
        
        // TODO code application logic here
    }
    
}
