/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */

import java.awt.Color;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.summingInt;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;
public class xchart {
    
 public void graphPassengerAges(List<Titanicpojo> passengerList) {
//filter to get an array of passenger ages
List<Float> pAges = passengerList.stream ().map (Titanicpojo::getage).limit (8).collect (Collectors.toList ());
List<String> pNames = passengerList.stream ().map (Titanicpojo::getname).limit (8).collect (Collectors.toList ());
//Using XCart to graph the Ages 1.Create Chart
 CategoryChart chart = new CategoryChartBuilder ().width (1024).height (768).title ("Age Histogram").xAxisTitle ("Names").yAxisTitle
("Age").build ();
// 2.Customize Chart
chart.getStyler ().setLegendPosition (Styler.LegendPosition.InsideNW);
chart.getStyler ().setHasAnnotations (true);
chart.getStyler ().setStacked (true);
// 3.Series
chart.addSeries ("Passenger's Ages", pNames, pAges);
// 4.Show it
new SwingWrapper (chart).displayChart ();

  }
 public void graphPassengerClass(List<Titanicpojo> passengerList) {
//filter to get a map of passenger class and total number of passengers in each class
Map<String, Long> result =passengerList.stream ().collect (
Collectors.groupingBy (Titanicpojo::getpclass, Collectors.counting () ) );
PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("First Class", result.get ("1"));
chart.addSeries ("Second Class", result.get ("2"));
chart.addSeries ("Third Class", result.get ("3"));
// Show it
new SwingWrapper (chart).displayChart ();
}
 
 
  public void graphPassengersurvivred(List<Titanicpojo> passengerList) {
//filter to get a map of passenger class and total number of passengers in each class
Map<String, Long> result =passengerList.stream ().collect (
Collectors.groupingBy (Titanicpojo::getsurvived, Collectors.counting () ) );
PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("survived", result.get ("1"));
chart.addSeries ("notsurvived", result.get ("0"));

// Show it
new SwingWrapper (chart).displayChart ();
}
     public void graphPassengersurvivredgender(List<Titanicpojo> passengerList) {  
         Long male = passengerList.stream().filter(b->b.getsex().equals("male") && b.getsurvived().equals("1")).count();
        Long female = passengerList.stream().filter(b->b.getsex().equals("female") && b.getsurvived().equals("1")).count();
        PieChart chart = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();
        Color[] sliceColors = new Color[]{new Color(180, 68,50), new Color(130, 105, 120)};
        chart.getStyler().setSeriesColors(sliceColors);
        chart.addSeries("Female Survived", female);
        chart.addSeries("Male Survived", male);
        new SwingWrapper(chart).displayChart();
    }
}
