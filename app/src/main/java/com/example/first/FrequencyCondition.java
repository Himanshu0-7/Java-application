package com.example.first;

public class FrequencyCondition {
    public static double herztCondition(String toUnit,double value){
        if(toUnit.equals("Herzt")){
            return value;
        }
        if(toUnit.equals("Kiloherzt")){
            return value/1000;
        }
        if(toUnit.equals("Megaherzt")){
            return value/1e+6;
        }
        if(toUnit.equals("Gigaherzt")){
            return value/1e+9;
        }
        return value;
    }
    public static double kiloHerztCondition(String toUnit,double value) {
        if (toUnit.equals("Herzt")) {
            return value*1000;
        }
        if (toUnit.equals("Kiloherzt")) {
            return value;
        }
        if (toUnit.equals("Megaherzt")) {
            return value/1000;
        }
        if (toUnit.equals("Gigaherzt")) {
            return value/1e+6;
        }
        return value;
    }
        public static double megaHerztCondition(String toUnit,double value){
            if (toUnit.equals("Herzt")) {
                return value*1e+6;
            }
            if (toUnit.equals("Kiloherzt")) {
                return value*1000;
            }
            if (toUnit.equals("Megaherzt")) {
                return value;
            }
            if (toUnit.equals("Gigaherzt")) {
                return value/1000;
            }
            return value;
        }
            public static double gigaHerztCondition (String toUnit,double value){
                if (toUnit.equals("Herzt")) {
                    return value*1e+9;
                }
                if (toUnit.equals("Kiloherzt")) {
                    return value*1e+6;
                }
                if (toUnit.equals("Megaherzt")) {
                    return value*1000;
                }
                if (toUnit.equals("Gigaherzt")) {
                    return value;
                }
                return value;
            }
        }
