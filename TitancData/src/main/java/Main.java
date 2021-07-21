
import java.util.ArrayList;
import java.util.List;
import tech.tablesaw.columns.Column;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
//[Integer column: pclass, Integer column: survived, String column: name, String column: sex, Double column: age, Integer column: sibsp, Integer column: parch, String column: ticket, Double column: fare, String column: cabin, String column: embarked, String column: boat, Integer column: body, String column: home.dest]
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //"C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\java\\Day5\\Day5\\Data_to_use\\titanic.csv"
         String datapath="C:\\Users\\asmaa\\Downloads\\archive\\pyramids.csv";
         List<Column<?>>datastrucuture=new ArrayList(); 
         TitancData LD=new TitancData();
         LD.TitanicSummary(datapath);
         datastrucuture=LD.readFromCsv(datapath);
         System.out.println(datastrucuture );
           System.out.println(LD.TitanicSummary(datapath) );
      
           FromCsvtoJSON JS=new FromCsvtoJSON ();
           List<Titanicpojo> pessangers= JS.getPassengersFromJsonFile("C:\\Users\\asmaa\\OneDrive\\Documents\\NetBeansProjects\\java\\TitancData\\src\\main\\java\\titanic.json");
            System.out.println(pessangers);
             
            
            xchart chart=new xchart();
            chart.graphPassengerAges(pessangers);
            chart.graphPassengerClass(pessangers);
             chart.graphPassengersurvivred(pessangers);
             chart.graphPassengersurvivredgender(pessangers);
       
        
        
    }
    
}
