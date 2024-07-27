package com.example.first;

public class TemperatureCondition {
    public static double celsiusCondition(String toUnit,double value){
        if (toUnit.equals("Degree Celsius")) {
            return value;
        }
        if (toUnit.equals("Fahrenheit")) {
            return (value * 9 / 5) + 32;
        }
        if (toUnit.equals("Kelvin")) {
            return value + 273.15;
        }

        return value;
    }
    public static double fahrenheitCondition(String toUnit,double value){
        if (toUnit.equals("Degree Celsius")) {
            return (value - 32) * 5 / 9;
        }
        if (toUnit.equals("Fahrenheit")) {
            return value;
        }
        if (toUnit.equals("Kelvin")) {
            return (value - 32) * 5 / 9 + 273.15;
        }

        return value;
    }
    public static double kelvinCondition(String toUnit,double value){
        if (toUnit.equals("Degree Celsius")) {
            return value - 273.15;
        }
        if (toUnit.equals("Fahrenheit")) {
            return (value - 273.15) * 9 / 5 + 32;
        }
        if (toUnit.equals("Kelvin")) {
            return value;
        }

        return value;
    }
}
