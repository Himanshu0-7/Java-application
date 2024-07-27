package com.example.first;

public class PressureCondition {
    public static double pascal(String toUnit,double value){
        if(toUnit.equals("Pascal")){
            return value;
        }
        if(toUnit.equals("Bar")){
            return value/100000;
        }
        if(toUnit.equals("Pound per square inch")){
            return value/6895;
        }
        if(toUnit.equals("Standard atmosphere")){
            return value/101300;
        }
        if(toUnit.equals("Torr")){
            return value/133.3;
        }


        return value;
    }
    public static double bar(String toUnit,double value){
        if(toUnit.equals("Pascal")){
            return value*100000;
        }
        if(toUnit.equals("Bar")){
            return value;
        }
        if(toUnit.equals("Pound per square inch")){
            return value*14.504;
        }
        if(toUnit.equals("Standard atmosphere")){
            return value/1.013;
        }
        if(toUnit.equals("Torr")){
            return value*750.1;
        }


        return value;
    }
    public static double poundper_SquareInch(String toUnit,double value){
        if(toUnit.equals("Pascal")){
            return value*6895;
        }
        if(toUnit.equals("Bar")){
            return value/14.504;
        }
        if(toUnit.equals("Pound per square inch")){
            return value;
        }
        if(toUnit.equals("Standard atmosphere")){
            return value/14.696;
        }
        if(toUnit.equals("Torr")){
            return value*51.715;
        }


        return value;
    }
    public static double standardAtmosphere(String toUnit,double value){
        if(toUnit.equals("Pascal")){
            return value*101300;
        }
        if(toUnit.equals("Bar")){
            return value*1.013;
        }
        if(toUnit.equals("Pound per square inch")){
            return value*14.696;
        }
        if(toUnit.equals("Standard atmosphere")){
            return value;
        }
        if(toUnit.equals("Torr")){
            return value*760;
        }


        return value;
    }
    public static double torr(String toUnit,double value){
        if(toUnit.equals("Pascal")){
            return value*133.3;
        }
        if(toUnit.equals("Bar")){
            return value/750.1;
        }
        if(toUnit.equals("Pound per square inch")){
            return value/51.715;
        }
        if(toUnit.equals("Standard atmosphere")){
            return value/760;
        }
        if(toUnit.equals("Torr")){
            return value;
        }


        return value;
    }

}
