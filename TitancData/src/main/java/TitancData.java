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
import java.util.List;
import java.io.IOException;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

public class TitancData {
    
    
      Table titanicData;
      Table SumarizedData;
     
      public List <Column<?>> readFromCsv(String FileName){
        List<Column<?>>datastrucuture=new ArrayList(); 
      try{
          
         titanicData=Table.read().file(FileName);
         
        datastrucuture=titanicData.columns();
          }
     catch(IOException ioe){
         ioe.printStackTrace();
         }
         return datastrucuture;
    }
      
      
       public Table TitanicSummary(String FileName){
     
       
      try{
          
          titanicData=Table.read().file(FileName);
         
          SumarizedData=titanicData.summary();
          }
     catch(IOException ioe){
         ioe.printStackTrace();
         }
         return  SumarizedData;
    }
      
     
}