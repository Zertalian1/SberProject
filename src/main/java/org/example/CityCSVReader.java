package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CityCSVReader {
    private final String filePath;
    private String pattern = ";";

    public CityCSVReader(String filePath){
        this.filePath=filePath;
    }

    public CityCSVReader(String filePath, String pattern){
        this.filePath = filePath;
        this.pattern = pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public List<City> ReadCities() throws IOException {
        List<City> cities = new ArrayList<>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        for (String fileLine : fileLines) {
            String[] splitText = fileLine.split(pattern);
            if(splitText.length==6) {
                City city = new City();
                city.setName(splitText[1]);
                city.setRegion(splitText[2]);
                city.setDistrict(splitText[3]);
                city.setPopulation(Integer.parseInt(splitText[4]));
                city.setFoundation(splitText[5]);
                cities.add(city);
            }
            else{
                System.err.println("incorrect data");
            }
        }
        return cities;
    }
}