package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите грудысы по Цельсию для конвертирования: ");
        double celsius = scanner.nextDouble();
        BaseConverter baseConverter = new BaseConverter(celsius);
        Kelvin kelvin  = new Kelvin(celsius);
        Fahrenheit fahrenheit = new Fahrenheit(celsius);
        Rankine rankine = new Rankine(celsius);
        Newton newton = new Newton(celsius);
        Reaumur reaumur = new Reaumur(celsius);

        System.out.println(celsius + "°C = " + kelvin.converter() + "°K (градусы по Кельвину)");
        System.out.println(celsius + "°C = " + fahrenheit.converter() + "°F  (градусы Фаренгейта)");
        System.out.println(celsius + "°C = " + rankine.converter() + "°R  (градусы Ранкина)");
        System.out.println(celsius + "°C = " + newton.converter() + "°N  (градусы Ньютона)");
        System.out.println(celsius + "°C = " + reaumur.converter() + "°Re  (градусы Реамюра)");


    }
}
