package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CityCSVReader reader = new CityCSVReader("src/main/resources/testData.csv",";");
        List<City> cities;
        try {
            cities = reader.ReadCities();
            for (City city : cities) {
                System.out.println(city);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


