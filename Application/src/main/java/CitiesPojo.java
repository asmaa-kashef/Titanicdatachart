/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class CitiesPojo {
    private String cityName;
    private double populationInCity;
    private String country;

    public CitiesPojo(String cityName, double populationInCity, String Country) {
        this.cityName = cityName;
        this.populationInCity = populationInCity;
        this.country = Country;
    }
      public void setcountry_name(String Cou){ 
          this.country=Cou;
                                          }
     public String getcountry_name(){
             return country;
          }
    @Override
    public String toString() {
        return "City {"+cityName+", population ="+populationInCity+", Country :"+country;
    }
}