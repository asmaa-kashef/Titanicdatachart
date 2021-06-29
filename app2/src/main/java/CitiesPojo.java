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
    private int populationInCity;
    private String country;

    public CitiesPojo(String cityName,  int populationInCity, String country) {
        this.cityName = cityName;
        this.populationInCity = populationInCity;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City {"+cityName+", population ="+populationInCity+", Country :"+country+"}";
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulationInCity() {
        return populationInCity;
    }

    public void setPopulationInCity(int populationInCity) {
        this.populationInCity = populationInCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

    

