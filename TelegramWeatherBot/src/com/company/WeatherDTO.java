package com.company;

import com.google.gson.annotations.SerializedName;

public class WeatherDTO{

    public Mainer main;
    public String name;
    public Wind wind;
}

class Mainer {
    public float temp;
    public int humidity;
    public int pressure;
    @SerializedName("feels_like")
    public float feels;

}

class Wind {
    public  double speed;
}
