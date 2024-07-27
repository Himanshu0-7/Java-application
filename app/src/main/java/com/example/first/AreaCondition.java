package com.example.first;

public class AreaCondition {
    public static double squareMetreCondition(String toUnit,double value){
        if (toUnit.equals("Square Metre")){
            return value;
        }
        if (toUnit.equals("Square Kilometre")){
            return value / 1e+6;
        }
        if (toUnit.equals("Square Mile")){
            return value / 2.59e+6;
        }
        if (toUnit.equals("Square Yard")){
            return value * 1.196;
        }
        if (toUnit.equals("Square Foot")){
            return value * 10.764;
        }
        if (toUnit.equals("Square Inch")){
            return value * 1550;
        }
        return value;
    }
    public static double squareKilometreCondition(String toUnit,double value){
        if (toUnit.equals("Square Metre")){
            return value * 1e+6;
        }
        if (toUnit.equals("Square Kilometre")){
            return value;
        }
        if (toUnit.equals("Square Mile")){
            return value / 2.59;
        }
        if (toUnit.equals("Square Yard")){
            return value * 1.196e+6;
        }
        if (toUnit.equals("Square Foot")){
            return value * 1.076e+7 ;
        }
        if (toUnit.equals("Square Inch")){
            return value * 1.55e+9;
        }

        return value;
    }
    public static double squareMileCondition(String toUnit,double value){
        if (toUnit.equals("Square Metre")){
            return value * 2.59e+6;
        }
        if (toUnit.equals("Square Kilometre")){
            return value * 2.59;
        }
        if (toUnit.equals("Square Mile")){
            return value;
        }
        if (toUnit.equals("Square Yard")){
            return value * 3.098e+6;
        }
        if (toUnit.equals("Square Foot")){
            return value * 2.788e+7;
        }
        if (toUnit.equals("Square Inch")){
            return value * 4.014e+9;
        }
        return value;
    }
    public static double squareYardCondition(String toUnit,double value){
        if (toUnit.equals("Square Metre")){
            return value / 1.196;
        }
        if (toUnit.equals("Square Kilometre")){
            return value / 1.196e+6;
        }
        if (toUnit.equals("Square Mile")){
            return value / 3.098e+6;
        }
        if (toUnit.equals("Square Yard")){
            return value;
        }
        if (toUnit.equals("Square Foot")){
            return value * 9;
        }
        if (toUnit.equals("Square Inch")){
            return value * 1296;
        }
        return value;
    }
    public static double squareFootCondition(String toUnit,double value){
        if (toUnit.equals("Square Metre")){
            return value / 10.764;
        }
        if (toUnit.equals("Square Kilometre")){
            return value / 1.076e+7;
        }
        if (toUnit.equals("Square Mile")){
            return value / 2.788e+7;
        }
        if (toUnit.equals("Square Yard")){
            return value / 9;
        }
        if (toUnit.equals("Square Foot")){
            return value;
        }
        if (toUnit.equals("Square Inch")){
            return value * 144;
        }
        return value;
    }
    public static double squareInchCondition(String toUnit,double value){
        if (toUnit.equals("Square Metre")){
            return value / 1550;
        }
        if (toUnit.equals("Square Kilometre")){
            return value / 1.55e+9;
        }
        if (toUnit.equals("Square Mile")){
            return value / 4.014e+9;
        }
        if (toUnit.equals("Square Yard")){
            return value / 1296;
        }
        if (toUnit.equals("Square Foot")){
            return value / 144;
        }
        if (toUnit.equals("Square Inch")){
            return value;
        }
        return value;
    }

}
