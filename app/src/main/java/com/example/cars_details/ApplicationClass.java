package com.example.cars_details;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Car> cars;


    @Override
    public void onCreate() {
        super.onCreate();
        cars = new ArrayList<Car>();
        cars.add(new Car("Volkswagen", "Polo", "Chuck Norris", "23231212"));
        cars.add(new Car("Mercedes", "E200", "John Travolta", "233213142"));
        cars.add(new Car("Nissan", "Navara", "Al Pacino", "2321315223"));
        cars.add(new Car("Nissan", "Almera", "Julia Roberts", "423313113"));
        cars.add(new Car("Volkswagen", "Kombi", "Michale Douglas", "3252113231"));


    }
}
