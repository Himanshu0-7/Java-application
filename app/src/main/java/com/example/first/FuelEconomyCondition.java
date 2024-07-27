package com.example.first;

public class FuelEconomyCondition {
    public static double mp_US_Gallon(String toUnit,double value){
        if(toUnit.equals("Mile per US gallon")){
            return value;
        }
        if(toUnit.equals("Mile per gallon")){
            return value *1.201;
        }
        if(toUnit.equals("Kilometre per litre")){
            return value/2.352;
        }

        return value;
    }
    public static double mp_Gallon(String toUnit,double value){
        if(toUnit.equals("Mile per US gallon")){
            return value/1.201;
        }
        if(toUnit.equals("Mile per gallon")){
            return value;
        }
        if(toUnit.equals("Kilometre per litre")){
            return value/2.825;
        }

        return value;
    }
    public static double kp_Liter(String toUnit,double value){
        if(toUnit.equals("Mile per US gallon")){
            return value*2.352;
        }
        if(toUnit.equals("Mile per gallon")){
            return value*2.825;
        }
        if(toUnit.equals("Kilometre per litre")){
            return value;
        }

        return value;
    }

}
