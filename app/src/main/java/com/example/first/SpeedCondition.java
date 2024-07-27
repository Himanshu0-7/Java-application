package com.example.first;

public class SpeedCondition {
    public static double mile_per_HourCondition(String toUnit,double value){
        if(toUnit.equals("Mile per hour")){
            return value ;
        }
        if(toUnit.equals("Foot per second")){
            return value*1.467;
        }
        if(toUnit.equals("Metre per second")){
            return value/2.237;
        }
        if(toUnit.equals("Kilometre per second")){
            return value*1.609;
        }
        if(toUnit.equals("Knot")){
            return value/1.151;
        }

        return value;
    }
    public static double foot_per_SecCondition(String toUnit,double value){
        if(toUnit.equals("Mile per hour")){
            return value/1.467;
        }
        if(toUnit.equals("Foot per second")){
            return value;
        }
        if(toUnit.equals("Metre per second")){
            return value/3.281;
        }
        if(toUnit.equals("Kilometre per second")){
            return value*1.097;
        }
        if(toUnit.equals("Knot")){
            return value/1.688;
        }

        return value;
    }
    public static double metre_per_SecCondition(String toUnit,double value){
        if(toUnit.equals("Mile per hour")){
            return value*2.237;
        }
        if(toUnit.equals("Foot per second")){
            return value*3.281;
        }
        if(toUnit.equals("Metre per second")){
            return value;
        }
        if(toUnit.equals("Kilometre per second")){
            return value*3.6;
        }
        if(toUnit.equals("Knot")){
            return value*1.944;
        }

        return value;
    }
    public static double kilometre_per_SecCondition(String toUnit,double value){
        if(toUnit.equals("Mile per hour")){
            return value/1.609;
        }
        if(toUnit.equals("Foot per second")){
            return value/1.097;
        }
        if(toUnit.equals("Metre per second")){
            return value/3.6;
        }
        if(toUnit.equals("Kilometre per second")){
            return value;
        }
        if(toUnit.equals("Knot")){
            return value/1.852;
        }
        return value;
    }
    public static double knotCondition(String toUnit,double value){
        if(toUnit.equals("Mile per hour")){
            return value*1.151;
        }
        if(toUnit.equals("Foot per second")){
            return value*1.688;
        }
        if(toUnit.equals("Metre per second")){
            return value/1.944;
        }
        if(toUnit.equals("Kilometre per second")){
            return value*1.852;
        }
        if(toUnit.equals("Knot")){
            return value;
        }
        return value;
    }
}
