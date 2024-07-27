package com.example.first;

public class TimeCondition {
    public static double nanosecondCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value;
        }
        if(toUnit.equals("Microsecond")){
            return value/1000;
        }
        if(toUnit.equals("Millisecond")){
            return value/1e+6;
        }
        if(toUnit.equals("Second")){
            return value/1e+9;
        }
        if(toUnit.equals("Minute")){
            return value/6e+10;
        }
        if(toUnit.equals("Hour")){
            return value/3.6e+12;
        }
        if(toUnit.equals("Day")){
            return value/8.64e+13;
        }
        if(toUnit.equals("Week")){
            return value/6.048e+14;
        }
        if(toUnit.equals("Month")){
            return value/2.628e+15;
        }
        if(toUnit.equals("Calender year")){
            return value/3.154e+16;
        }
        if(toUnit.equals("Decade")){
            return value/3.154e+17;
        }
        if(toUnit.equals("Centure")){
            return value/3.154e+18;
        }
        return value;
    }
    public static double micosecondCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*1000;
        }
        if(toUnit.equals("Microsecond")){
            return value;
        }
        if(toUnit.equals("Millisecond")){
            return value/1000;
        }
        if(toUnit.equals("Second")){
            return value/1e+6;
        }
        if(toUnit.equals("Minute")){
            return value/6e+7;
        }
        if(toUnit.equals("Hour")){
            return value/3.6e+9;
        }
        if(toUnit.equals("Day")){
            return value/8.64e+10;
        }
        if(toUnit.equals("Week")){
            return value/6.048e+11;
        }
        if(toUnit.equals("Month")){
            return value/2.628e+12;
        }
        if(toUnit.equals("Calender year")){
            return value/3.154e12;
        }
        if(toUnit.equals("Decade")){
            return value/3.154e+14;
        }
        if(toUnit.equals("Centure")){
            return value/3.154e+15;
        }

        return value;
    }
    public static double millisecondCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*1e+6;
        }
        if(toUnit.equals("Microsecond")){
            return value*1000;
        }
        if(toUnit.equals("Millisecond")){
            return value;
        }
        if(toUnit.equals("Second")){
            return value/1000;
        }
        if(toUnit.equals("Minute")){
            return value/60000;
        }
        if(toUnit.equals("Hour")){
            return value/3.6e+6;
        }
        if(toUnit.equals("Day")){
            return value/8.64e+7;
        }
        if(toUnit.equals("Week")){
            return value/6.048e+8;
        }
        if(toUnit.equals("Month")){
            return value/2.628e+9;
        }
        if(toUnit.equals("Calender year")){
            return value/3.154e+10;
        }
        if(toUnit.equals("Decade")){
            return value/3.154e+11;
        }
        if(toUnit.equals("Centure")){
            return value/3.154e+12;
        }

        return value;
    }
    public static double secondCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*1e+9;
        }
        if(toUnit.equals("Microsecond")){
            return value*1e+6;
        }
        if(toUnit.equals("Millisecond")){
            return value*1000;
        }
        if(toUnit.equals("Second")){
            return value;
        }
        if(toUnit.equals("Minute")){
            return value/60;
        }
        if(toUnit.equals("Hour")){
            return value/3600;
        }
        if(toUnit.equals("Day")){
            return value/86400;
        }
        if(toUnit.equals("Week")){
            return value/604800;
        }
        if(toUnit.equals("Month")){
            return value/2.628e+6;
        }
        if(toUnit.equals("Calender year")){
            return value/3.154e+7;
        }
        if(toUnit.equals("Decade")){
            return value/3.154e+8;
        }
        if(toUnit.equals("Centure")){
            return value/3.154e+9;
        }

        return value;
    }
    public static double minuteCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*6e+10;
        }
        if(toUnit.equals("Microsecond")){
            return value*6e+7;
        }
        if(toUnit.equals("Millisecond")){
            return value*60000;
        }
        if(toUnit.equals("Second")){
            return value*60;
        }
        if(toUnit.equals("Minute")){
            return value;
        }
        if(toUnit.equals("Hour")){
            return value/60;
        }
        if(toUnit.equals("Day")){
            return value/1440;
        }
        if(toUnit.equals("Week")){
            return value/10080;
        }
        if(toUnit.equals("Month")){
            return value/43800;
        }
        if(toUnit.equals("Calender year")){
            return value/525600;
        }
        if(toUnit.equals("Decade")){
            return value/5.256e+6;
        }
        if(toUnit.equals("Centure")){
            return value/5.256e+7;
        }

        return value;
    }
    public static double hourCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*3.6e+12;
        }
        if(toUnit.equals("Microsecond")){
            return value*3.6e+9;
        }
        if(toUnit.equals("Millisecond")){
            return value*3.6e+6;
        }
        if(toUnit.equals("Second")){
            return value*3600;
        }
        if(toUnit.equals("Minute")){
            return value*60;
        }
        if(toUnit.equals("Hour")){
            return value;
        }
        if(toUnit.equals("Day")){
            return value/24;
        }
        if(toUnit.equals("Week")){
            return value/168;
        }
        if(toUnit.equals("Month")){
            return value/730;
        }
        if(toUnit.equals("Calender year")){
            return value/8760;
        }
        if(toUnit.equals("Decade")){
            return value/87600;
        }
        if(toUnit.equals("Centure")){
            return value/876000;
        }

        return value;
    }
    public static double dayCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*8.64e+13;
        }
        if(toUnit.equals("Microsecond")){
            return value*8.64e+10;
        }
        if(toUnit.equals("Millisecond")){
            return value*8.64e+7;
        }
        if(toUnit.equals("Second")){
            return value*86400;
        }
        if(toUnit.equals("Minute")){
            return value*1440;
        }
        if(toUnit.equals("Hour")){
            return value*24;
        }
        if(toUnit.equals("Day")){
            return value;
        }
        if(toUnit.equals("Week")){
            return value/7;
        }
        if(toUnit.equals("Month")){
            return value/30.417;
        }
        if(toUnit.equals("Calender year")){
            return value/365;
        }
        if(toUnit.equals("Decade")){
            return value/3650;
        }
        if(toUnit.equals("Centure")){
            return value/36500;
        }

        return value;
    }
    public static double weekCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*6.048e+14;
        }
        if(toUnit.equals("Microsecond")){
            return value*6.048e+11;
        }
        if(toUnit.equals("Millisecond")){
            return value*6.048e+8;
        }
        if(toUnit.equals("Second")){
            return value*604800;
        }
        if(toUnit.equals("Minute")){
            return value*10080;
        }
        if(toUnit.equals("Hour")){
            return value*168;
        }
        if(toUnit.equals("Day")){
            return value*7;
        }
        if(toUnit.equals("Week")){
            return value;
        }
        if(toUnit.equals("Month")){
            return value/4.345;
        }
        if(toUnit.equals("Calender year")){
            return value/52.143;
        }
        if(toUnit.equals("Decade")){
            return value/521.4;
        }
        if(toUnit.equals("Century")){
            return value/5214;
        }

        return value;
    }
    public static double monthCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*2.628e+15;
        }
        if(toUnit.equals("Microsecond")){
            return value*2.628e+12;
        }
        if(toUnit.equals("Millisecond")){
            return value*2.628e+9;
        }
        if(toUnit.equals("Second")){
            return value*2.628e+6;
        }
        if(toUnit.equals("Minute")){
            return value*43800;
        }
        if(toUnit.equals("Hour")){
            return value*730;
        }
        if(toUnit.equals("Day")){
            return value*30.417;
        }
        if(toUnit.equals("Week")){
            return value*4.345;
        }
        if(toUnit.equals("Month")){
            return value/12;
        }
        if(toUnit.equals("Calender year")){
            return value/12;
        }
        if(toUnit.equals("Decade")){
            return value/120;
        }
        if(toUnit.equals("Centure")){
            return value/1200;
        }

        return value;
    }
    public static double calenderYearCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*3.154e+16;
        }
        if(toUnit.equals("Microsecond")){
            return value*3.154e+13;
        }
        if(toUnit.equals("Millisecond")){
            return value*3.154e+10;
        }
        if(toUnit.equals("Second")){
            return value*3.154e+7;
        }
        if(toUnit.equals("Minute")){
            return value*525600;
        }
        if(toUnit.equals("Hour")){
            return value*8760;
        }
        if(toUnit.equals("Day")){
            return value*365;
        }
        if(toUnit.equals("Week")){
            return value*52.143;
        }
        if(toUnit.equals("Month")){
            return value*12;
        }
        if(toUnit.equals("Calender year")){
            return value;
        }
        if(toUnit.equals("Decade")){
            return value/10;
        }
        if(toUnit.equals("Centure")){
            return value/100;
        }

        return value;
    }
    public static double   decadesCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*3.154e+17;
        }
        if(toUnit.equals("Microsecond")){
            return value*3.154e+14;
        }
        if(toUnit.equals("Millisecond")){
            return value*3.154e+11;
        }
        if(toUnit.equals("Second")){
            return value*3.154e+8;
        }
        if(toUnit.equals("Minute")){
            return value*5.256e+6;
        }
        if(toUnit.equals("Hour")){
            return value*87600;
        }
        if(toUnit.equals("Day")){
            return value*3650;
        }
        if(toUnit.equals("Week")){
            return value*521.4;
        }
        if(toUnit.equals("Month")){
            return value*120;
        }
        if(toUnit.equals("Calender year")){
            return value*10;
        }
        if(toUnit.equals("Decade")){
            return value;
        }
        if(toUnit.equals("Centure")){
            return value/10;
        }

        return value;
    }
    public static double centuryCondition(String toUnit,double value){
        if(toUnit.equals("Nanosecond")){
            return value*3.154e+18;
        }
        if(toUnit.equals("Microsecond")){
            return value*3.154e+15;
        }
        if(toUnit.equals("Millisecond")){
            return value*3.154e+12;
        }
        if(toUnit.equals("Second")){
            return value*3.154e+9;
        }
        if(toUnit.equals("Minute")){
            return value*5.256e+7;
        }
        if(toUnit.equals("Hour")){
            return value*876000;
        }
        if(toUnit.equals("Day")){
            return value*36500;
        }
        if(toUnit.equals("Week")){
            return value*5214;
        }
        if(toUnit.equals("Month")){
            return value*1200;
        }
        if(toUnit.equals("Calender year")){
            return value*100;
        }
        if(toUnit.equals("Decade")){
            return value*10;
        }
        if(toUnit.equals("Centure")){
            return value;
        }

        return value;
    }

}
