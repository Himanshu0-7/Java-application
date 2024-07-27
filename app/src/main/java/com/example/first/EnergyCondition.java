package com.example.first;

public class EnergyCondition {
    public static double jouleCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value;
        }
        if(toUnit.equals("Kilojoule")){
            return value/1000;
        }
        if(toUnit.equals("Gram calorie")){
            return value/4.184;
        }
        if(toUnit.equals("Kilocalorie")){
            return value/4184;
        }
        if(toUnit.equals("Watt hour")){
            return value/3600;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value/3.6e+6;
        }
        if(toUnit.equals("Electrovolt")){
            return value*6.242e+18;
        }
        return value;
    }
    public static double kiloJouleCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value*1000;
        }
        if(toUnit.equals("Kilojoule")){
            return value;
        }
        if(toUnit.equals("Gram calorie")){
            return value*239;
        }
        if(toUnit.equals("Kilocalorie")){
            return value/4.184;
        }
        if(toUnit.equals("Watt hour")){
            return value/3.6;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value/3600;
        }
        if(toUnit.equals("Electrovolt")){
            return value*6.242e+21;
        }
        return value;
    }
    public static double gramCalorieCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value*4.184;
        }
        if(toUnit.equals("Kilojoule")){
            return value/239;
        }
        if(toUnit.equals("Gram calorie")){
            return value;
        }
        if(toUnit.equals("Kilocalorie")){
            return value/1000;
        }
        if(toUnit.equals("Watt hour")){
            return value/860.4;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value/860400;
        }
        if(toUnit.equals("Electrovolt")){
            return value*2.611e+19;
        }
        return value;
    }
    public static double kilocalorieCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value*4184;
        }
        if(toUnit.equals("Kilojoule")){
            return value*4.184;
        }
        if(toUnit.equals("Gram calorie")){
            return value*1000;
        }
        if(toUnit.equals("Kilocalorie")){
            return value;
        }
        if(toUnit.equals("Watt hour")){
            return value*1.162;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value/860.4;
        }
        if(toUnit.equals("Electrovolt")){
            return value*2.611e+22;
        }
        return value;
    }
    public static double wattHourCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value*3600;
        }
        if(toUnit.equals("Kilojoule")){
            return value*3.6;
        }
        if(toUnit.equals("Gram calorie")){
            return value*860.4;
        }
        if(toUnit.equals("Kilocalorie")){
            return value/1.162;
        }
        if(toUnit.equals("Watt hour")){
            return value;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value/1000;
        }
        if(toUnit.equals("Electrovolt")){
            return value*2.247e+22;
        }
        return value;
    }
    public static double kilowattHourCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value*3.6e+6;
        }
        if(toUnit.equals("Kilojoule")){
            return value*3600;
        }
        if(toUnit.equals("Gram calorie")){
            return value*860400;
        }
        if(toUnit.equals("Kilocalorie")){
            return value*860.4;
        }
        if(toUnit.equals("Watt hour")){
            return value*1000;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value;
        }
        if(toUnit.equals("Electrovolt")){
            return value*2.247e+25;
        }
        return value;
    }
    public static double electrovoltCondition(String toUnit,double value){
        if(toUnit.equals("Joule")){
            return value/6.242e+18;
        }
        if(toUnit.equals("Kilojoule")){
            return value/6.242e+21;
        }
        if(toUnit.equals("Gram calorie")){
            return value/2.611e+19;
        }
        if(toUnit.equals("Kilocalorie")){
            return value/2.611e+22;
        }
        if(toUnit.equals("Watt hour")){
            return value/2.247e+22;
        }
        if(toUnit.equals("Kilowatt hour")){
            return value/2.247e+25;
        }
        if(toUnit.equals("Electrovolt")){
            return value;
        }
        return value;
    }
}
