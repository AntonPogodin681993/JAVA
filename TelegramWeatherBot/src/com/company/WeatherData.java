package com.company;

import com.google.gson.Gson;
import okhttp3.*;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WeatherData {


    public static String getWeather(String message) throws IOException {
        URL MyUrl = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&lang=ru&units=metric&appid=a5d15e4469a9740cff205498c2f44d13");
        InputStreamReader reader = new InputStreamReader(MyUrl.openStream());
        WeatherDTO curentWeather = null;
        Gson gson = new Gson();
        curentWeather = gson.fromJson(reader,WeatherDTO.class);
        LocalDate localDate = LocalDate.now();
        String resault = "The weather today  (" + DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate) + ") in "  + curentWeather.name + ":\n" +
                "Temperature is " + curentWeather.main.temp + " °C. Feels like " + curentWeather.main.feels + " °C\n" +
                "The presure is " + curentWeather.main.pressure + "\n" +
                "Humidity is " + curentWeather.main.humidity + " %\n"+
                "Speed of wind is " + curentWeather.wind.speed + " m/s\n";

       return resault;

    }
}
