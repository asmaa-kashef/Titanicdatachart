/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.io.InputStream;
import java.io.FileInputStream;  
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import tech.tablesaw.columns.Column;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.core.type.TypeReference<T>;

public class FromCsvtoJSON  {
 
 public List<Titanicpojo> getPassengersFromJsonFile(String Filename) {
   List<Titanicpojo> allPassengers = new ArrayList<Titanicpojo> ();
   //class in jaskson
    try{ObjectMapper objectMapper = new ObjectMapper ();
    objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    InputStream input = new FileInputStream ( Filename);
//Read JSON file
     allPassengers = objectMapper.readValue (input, new TypeReference<List<Titanicpojo>> () { });

   }
   catch(IOException ioe){
         ioe.printStackTrace();
         }
    
            return allPassengers;
    }
 
  
}