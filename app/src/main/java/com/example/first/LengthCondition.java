package com.example.first;

public class LengthCondition {
    public static double centimetreCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 100000;
        }
        if (toUnit.equals("Metre")){
            return value / 100;
        }
        if (toUnit.equals("Centimetre")){
            return value;
        }
        if (toUnit.equals("Millimetre")){
            return value * 10;
        }
        if (toUnit.equals("Micrometre")){
            return value * 10000;
        }
        if (toUnit.equals("Nanometre")){
            return value * 1e+7;
        }
        if (toUnit.equals("Mile")){
            return value / 160900;
        }
        if (toUnit.equals("Yard")) {
            return value / 19.44;
        }
        if (toUnit.equals("Foot")){
            return value / 30.48;
        }
        if (toUnit.equals("Inch")){
            return value / 2.54;
        }

        return value;
    }
    public static double millimetreCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 1e+6;
        }
        if (toUnit.equals("Metre")){
            return value / 1000;
        }
        if (toUnit.equals("Centimetre")){
            return value / 10;
        }
        if (toUnit.equals("Millimetre")){
            return value;
        }
        if (toUnit.equals("Micrometre")){
            return value * 1000;
        }
        if (toUnit.equals("Nanometre")){
            return value * 1e+6;
        }
        if (toUnit.equals("Mile")){
            return value / 1.609e+6;
        }
        if (toUnit.equals("Yard")) {
            return value / 914.4;
        }
        if (toUnit.equals("Foot")){
            return value / 304.8;
        }
        if (toUnit.equals("Inch")){
            return value / 25.4;
        }

        return value;
    }
    public static double kilometreCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value;
        }
        if (toUnit.equals("Metre")){
            return value * 1000;
        }
        if (toUnit.equals("Centimetre")){
            return value * 1000;
        }
        if (toUnit.equals("Millimetre")){
            return value * 1e+6;
        }
        if (toUnit.equals("Micrometre")){
            return value * 1e+9;
        }
        if (toUnit.equals("Nanometre")){
            return value / 1e+12;
        }
        if (toUnit.equals("Mile")){
            return value / 1.609;
        }
        if (toUnit.equals("Yard")) {
            return value * 1094;
        }
        if (toUnit.equals("Foot")){
            return value / 3281;
        }
        if (toUnit.equals("Inch")){
            return value / 39370;
        }

        return value;
    }
    public static double metreCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 1000;
        }
        if (toUnit.equals("Metre")){
            return value;
        }
        if (toUnit.equals("Centimetre")){
            return value * 100;
        }
        if (toUnit.equals("Millimetre")){
            return value * 1000;
        }
        if (toUnit.equals("Micrometre")){
            return value * 1e+6;
        }
        if (toUnit.equals("Nanometre")){
            return value * 1e+9;
        }
        if (toUnit.equals("Mile")){
            return value / 1609;
        }
        if (toUnit.equals("Yard")) {
            return value * 1.094;
        }
        if (toUnit.equals("Foot")){
            return value * 3.281;
        }
        if (toUnit.equals("Inch")){
            return value * 39.37;
        }

        return value;
    }
    public static double micrometreCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 1e+9;
        }
        if (toUnit.equals("Metre")){
            return value / 1e+6;
        }
        if (toUnit.equals("Centimetre")){
            return value * 10000;
        }
        if (toUnit.equals("Millimetre")){
            return value / 1000;
        }
        if (toUnit.equals("Micrometre")){
            return value;
        }
        if (toUnit.equals("Nanometre")){
            return value * 1000;
        }
        if (toUnit.equals("Mile")){
            return value / 1.609e+9;
        }
        if (toUnit.equals("Yard")) {
            return value / 914400;
        }
        if (toUnit.equals("Foot")){
            return value / 304800;
        }
        if (toUnit.equals("Inch")){
            return value / 25400;
        }
        return value;
    }
    public static double nanometreCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 1e+12;
        }
        if (toUnit.equals("Metre")){
            return value / 1e+9;
        }
        if (toUnit.equals("Centimetre")){
            return value / 1e+7;
        }
        if (toUnit.equals("Millimetre")){
            return value / 1e+6;
        }
        if (toUnit.equals("Micrometre")){
            return value / 1000;
        }
        if (toUnit.equals("Nanometre")){
            return value;
        }
        if (toUnit.equals("Mile")){
            return value / 1.609e+12;
        }
        if (toUnit.equals("Yard")) {
            return value / 9.144e+8;
        }
        if (toUnit.equals("Foot")){
            return value / 3.048e+8;
        }
        if (toUnit.equals("Inch")){
            return value / 2.54e+7;
        }
        return value;
    }
    public static double mileCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 1.609;
        }
        if (toUnit.equals("Metre")){
            return value / 1609;
        }
        if (toUnit.equals("Centimetre")){
            return value / 160900;
        }
        if (toUnit.equals("Millimetre")){
            return value / 1.609e+6;
        }
        if (toUnit.equals("Micrometre")){
            return value / 1.609e+9;
        }
        if (toUnit.equals("Nanometre")){
            return value / 1.609e+12;
        }
        if (toUnit.equals("Mile")){
            return value;
        }
        if (toUnit.equals("Yard")) {
            return value * 1760;
        }
        if (toUnit.equals("Foot")){
            return value * 5280;
        }
        if (toUnit.equals("Inch")){
            return value * 63360;
        }
        return value;
    }
    public static double yardCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 1094;
        }
        if (toUnit.equals("Metre")){
            return value / 1.094;
        }
        if (toUnit.equals("Centimetre")){
            return value * 91.44;
        }
        if (toUnit.equals("Millimetre")){
            return value * 914.4;
        }
        if (toUnit.equals("Micrometre")){
            return value / 914400;
        }
        if (toUnit.equals("Nanometre")){
            return value / 9.144e+8;
        }
        if (toUnit.equals("Mile")){
            return value / 1760;
        }
        if (toUnit.equals("Yard")) {
            return value;
        }
        if (toUnit.equals("Foot")){
            return value * 3;
        }
        if (toUnit.equals("Inch")){
            return value * 36;
        }

        return value;
    }
    public static double footCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 3281;
        }
        if (toUnit.equals("Metre")){
            return value / 3.281;
        }
        if (toUnit.equals("Centimetre")){
            return value * 30.48;
        }
        if (toUnit.equals("Millimetre")){
            return value * 304.8;
        }
        if (toUnit.equals("Micrometre")){
            return value * 304800;
        }
        if (toUnit.equals("Nanometre")){
            return value / 3.048e+8;
        }
        if (toUnit.equals("Mile")){
            return value / 5280;
        }
        if (toUnit.equals("Yard")) {
            return value / 3;
        }
        if (toUnit.equals("Foot")){
            return value;
        }
        if (toUnit.equals("Inch")){
            return value * 12;
        }

        return value;
    }
    public static double inchCondition(String toUnit,double value){
        if(toUnit.equals("Kilometre")){
            return value / 39370;
        }
        if (toUnit.equals("Metre")){
            return value / 39.37;
        }
        if (toUnit.equals("Centimetre")){
            return value * 2.54;
        }
        if (toUnit.equals("Millimetre")){
            return value * 25.4;
        }
        if (toUnit.equals("Micrometre")){
            return value * 25400;
        }
        if (toUnit.equals("Nanometre")){
            return value * 2.54e+7;
        }
        if (toUnit.equals("Mile")){
            return value / 63360;
        }
        if (toUnit.equals("Yard")) {
            return value / 36;
        }
        if (toUnit.equals("Foot")){
            return value / 12;
        }
        if (toUnit.equals("Inch")){
            return value;
        }
        return value;
    }

}
