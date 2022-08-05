package org.example;

public class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(){}

    public City(String[] cityParameters){
        name = cityParameters[1];
        region = cityParameters[2];
        district = cityParameters[3];
        population = Integer.parseInt(cityParameters[4]);
        foundation = cityParameters[5];

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String toString(){
        return "name = " + name + "\t" +
                "region = " + region + "\t" +
                "district = " + district + "\t" +
                "population = " + population + "\t" +
                "foundation = " + foundation;
    }

}
