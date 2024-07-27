package com.example.first;

public class DataCondition {
    public static double bitCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value;
        }
        if (toUnit.equals("Kilobit")) {
            return value / 1000;
        }
        if (toUnit.equals("Megabit")) {
            return value / 1e+6;
        }
        if (toUnit.equals("Gigabit")) {
            return value / 1e+9;
        }
        if (toUnit.equals("Terabit")) {
            return value / 1e+12;
        }
        if (toUnit.equals("Byte")) {
            return value / 8;
        }
        if (toUnit.equals("Kilobyte")) {
            return value / 8000;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 8e+6;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 8e+9;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 8e+12;
        }
        return value;

    }
    public static double kilobitCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 1000;
        }
        if (toUnit.equals("Kilobit")) {
            return value;
        }
        if (toUnit.equals("Megaobit")) {
            return value / 1000;
        }
        if (toUnit.equals("Gigabit")) {
            return value / 1e+6;
        }
        if (toUnit.equals("Terabit")) {
            return value / 1e+9;
        }
        if (toUnit.equals("Byte")) {
            return value / 125;
        }
        if (toUnit.equals("Kilobyte")) {
            return value / 8;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 8000;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 8e+6;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 8e+9;
        }
        return value;

    }
    public static double megabitCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 1e+6;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 1000;
        }
        if (toUnit.equals("Megabit")) {
            return value;
        }
        if (toUnit.equals("Gigabit")) {
            return value / 1000;
        }
        if (toUnit.equals("Terabit")) {
            return value / 1e+6;
        }
        if (toUnit.equals("Byte")) {
            return value / 125000;
        }
        if (toUnit.equals("Kilobyte")) {
            return value * 125;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 8;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 8000;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 8e+6;
        }
        return value;

    }
    public static double gigabitCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 1e+9;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 1e+6;
        }
        if (toUnit.equals("Megabit")) {
            return value * 1000;
        }
        if (toUnit.equals("Gigabit")) {
            return value;
        }
        if (toUnit.equals("Terabit")) {
            return value / 1000;
        }
        if (toUnit.equals("Byte")) {
            return value / 1.25e+8;
        }
        if (toUnit.equals("Kilobyte")) {
            return value / 125000;
        }
        if (toUnit.equals("Megabyte")) {
            return value * 125;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 8;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 8000;
        }
        return value;

    }
    public static double terabitCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 1e+12;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 1e+9;
        }
        if (toUnit.equals("Megabit")) {
            return value * 1e+6;
        }
        if (toUnit.equals("Gigabit")) {
            return value * 1000;
        }
        if (toUnit.equals("Terabit")) {
            return value;
        }
        if (toUnit.equals("Byte")) {
            return value / 1.25e+11;
        }
        if (toUnit.equals("Kilobyte")) {
            return value / 1.25e+8;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 125000;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 125;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 8;
        }
        return value;

    }
    public static double byteCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 8;
        }
        if (toUnit.equals("Kilobit")) {
            return value / 125;
        }
        if (toUnit.equals("Megabit")) {
            return value / 125000;
        }
        if (toUnit.equals("Gigabit")) {
            return value / 1.25e+8;
        }
        if (toUnit.equals("Terabit")) {
            return value / 1.25e+11;
        }
        if (toUnit.equals("Byte")) {
            return value;
        }
        if (toUnit.equals("Kilobyte")) {
            return value / 1000;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 1e+6;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 1e+9;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 1e+12;
        }
        return value;

    }
    public static double kilobyteCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 8000;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 8;
        }
        if (toUnit.equals("Megabit")) {
            return value / 125;
        }
        if (toUnit.equals("Gigabit")) {
            return value / 125000;
        }
        if (toUnit.equals("Terabit")) {
            return value / 1.25e+8;
        }
        if (toUnit.equals("Byte")) {
            return value * 1000;
        }
        if (toUnit.equals("Kilobyte")) {
            return value;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 1000;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 1e+6;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 1e+9;
        }
        return value;

    }
    public static double megabyteCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value / 8e+6;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 8000;
        }
        if (toUnit.equals("Megabit")) {
            return value * 8;
        }
        if (toUnit.equals("Gigabit")) {
            return value / 125;
        }
        if (toUnit.equals("Terabit")) {
            return value / 137400;
        }
        if (toUnit.equals("Byte")) {
            return value * 1e+6;
        }
        if (toUnit.equals("Kilobyte")) {
            return value * 1000;
        }
        if (toUnit.equals("Megabyte")) {
            return value;
        }
        if (toUnit.equals("Gigabyte")) {
            return value / 1000;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 1e+6;
        }
        return value;

    }
    public static double gigabyteCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 8e+9;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 8e+6;
        }
        if (toUnit.equals("Megabit")) {
            return value * 8000;
        }
        if (toUnit.equals("Gigabit")) {
            return value * 8;
        }
        if (toUnit.equals("Terabit")) {
            return value / 125;
        }
        if (toUnit.equals("Byte")) {
            return value * 1e+9;
        }
        if (toUnit.equals("Kilobyte")) {
            return value * 1e+6;
        }
        if (toUnit.equals("Megabyte")) {
            return value * 953.7;
        }
        if (toUnit.equals("Gigabyte")) {
            return value;
        }
        if (toUnit.equals("Terabyte")) {
            return value / 1000;
        }
        return value;

    }
    public static double terabyteCondition(String  toUnit, double value){
        if (toUnit.equals("Bit")) {
            return value * 8e+12;
        }
        if (toUnit.equals("Kilobit")) {
            return value * 8e+9;
        }
        if (toUnit.equals("Megabit")) {
            return value * 8e+6;
        }
        if (toUnit.equals("Gigabit")) {
            return value * 8000;
        }
        if (toUnit.equals("Terabit")) {
            return value * 8;
        }
        if (toUnit.equals("Byte")) {
            return value * 1e+12;
        }
        if (toUnit.equals("Kilobyte")) {
            return value / 1e+9;
        }
        if (toUnit.equals("Megabyte")) {
            return value / 1e+9;
        }
        if (toUnit.equals("Gigabyte")) {
            return value * 1000;
        }
        if (toUnit.equals("Terabyte")) {
            return value;
        }
        return value;

    }

}
