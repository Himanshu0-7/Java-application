package com.example.first;

public class MassCondition {
    public static double gramCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value;
        }
        if(toUnit.equals("Kilogram")){
            return value/1000;
        }
        if(toUnit.equals("Milligram")){
            return value*1000;
        }
        if(toUnit.equals("Microgram")){
            return value*1e+6;
        }
        if(toUnit.equals("Us-ton")){
            return value/907200;
        }
        if(toUnit.equals("Tonne")){
            return value/1e-6;
        }
        if(toUnit.equals("Pound")){
            return value/453.6;
        }
        return value;
    }
    public static double kiloGramCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value*1000;
        }
        if(toUnit.equals("Kilogram")){
            return value;
        }
        if(toUnit.equals("Milligram")){
            return value*1e+6;
        }
        if(toUnit.equals("Microgram")){
            return value*1e+9;
        }
        if(toUnit.equals("Us-ton")){
            return value/907.2;
        }
        if(toUnit.equals("Tonne")){
            return value;
        }
        if(toUnit.equals("Pound")){
            return value*2.205;
        }
        return value;
    }
    public static double milliGramCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value/1000;
        }
        if(toUnit.equals("Kilogram")){
            return value/1e+6;
        }
        if(toUnit.equals("Milligram")){
            return value;
        }
        if(toUnit.equals("Microgram")){
            return value*1000;
        }
        if(toUnit.equals("Us-ton")){
            return value/9072e+8;
        }
        if(toUnit.equals("Tonne")){
            return value/1e+9;
        }
        if(toUnit.equals("Pound")){
            return value/453600;
        }
        return value;
    }
    public static double mircroGramCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value/1e+6;
        }
        if(toUnit.equals("Kilogram")){
            return value/1e+9;
        }
        if(toUnit.equals("Milligram")){
            return value/1000;
        }
        if(toUnit.equals("Microgram")){
            return value;
        }
        if(toUnit.equals("Us-ton")){
            return value/9.72e+11;
        }
        if(toUnit.equals("Tonne")){
            return value/1e+12;
        }
        if(toUnit.equals("Pound")){
            return value/4.536e+8;
        }
        return value;
    }
    public static double usTonCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value*907200;
        }
        if(toUnit.equals("Kilogram")){
            return value*907.2;
        }
        if(toUnit.equals("Milligram")){
            return value*9.072e+8;
        }
        if(toUnit.equals("Microgram")){
            return value*9.072e+11;
        }
        if(toUnit.equals("Us-ton")){
            return value;
        }
        if(toUnit.equals("Tonne")){
            return value/1.102;
        }
        if(toUnit.equals("Pound")){
            return value*2000;
        }
        return value;
    }
    public static double tonneCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value*1e+6;
        }
        if(toUnit.equals("Kilogram")){
            return value*1000;
        }
        if(toUnit.equals("Milligram")){
            return value*1e+9;
        }
        if(toUnit.equals("Microgram")){
            return value*1e+12;
        }
        if(toUnit.equals("Us-ton")){
            return value*1.102;
        }
        if(toUnit.equals("Tonne")){
            return value;
        }
        if(toUnit.equals("Pound")){
            return value*2205;
        }
        return value;
    }
    public static double poundCondition(String toUnit,double value){
        if(toUnit.equals("Gram")){
            return value*453.6;
        }
        if(toUnit.equals("Kilogram")){
            return value/2.205;
        }
        if(toUnit.equals("Milligram")){
            return value*453600;
        }
        if(toUnit.equals("Microgram")){
            return value*4.536e+8;
        }
        if(toUnit.equals("Us-ton")){
            return value/2000;
        }
        if(toUnit.equals("Tonne")){
            return value/2205;
        }
        if(toUnit.equals("Pound")){
            return value;
        }
        return value;
    }
}
