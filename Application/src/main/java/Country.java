/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class Country {
    public String name;
    public String fullName;
    public String continent;
    public double population;

    public Country(String name, String fullName, String continent, double population) {
        this.name = name;
        this.fullName = fullName;
        this.continent = continent;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country {"+name+" ,Fullname"+fullName+" ,Continent:"+continent+", population:"+population;
    }
}
