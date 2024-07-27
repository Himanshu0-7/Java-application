package com.example.first;
import static com.example.first.DataCondition.*;
import static com.example.first.TemperatureCondition.*;
import static com.example.first.LengthCondition.*;
import static com.example.first.AreaCondition.*;
import static com.example.first.MassCondition.*;
import static com.example.first.SpeedCondition.*;
import static com.example.first.TimeCondition.*;
import static com.example.first.FrequencyCondition.*;
import static com.example.first.EnergyCondition.*;
import static com.example.first.FuelEconomyCondition.*;
import static com.example.first.PressureCondition.*;



//all Converted Formula//
public class ConverterFormula
{
    public static double dataConversion( String fromUnit, String toUnit, double value) {
        switch (fromUnit) {
            case "Bit":
                return bitCondition(toUnit,value);
            case "Kilobit":
                return kilobitCondition(toUnit,value);
            case "Megabit":
                return megabitCondition(toUnit,value);
            case "Gigabit":
                return gigabitCondition(toUnit,value);
            case "Terabit":
                return terabitCondition(toUnit,value);
            case "Byte":
                return byteCondition(toUnit,value);
            case "Kilobyte":
                return kilobyteCondition(toUnit,value);
            case "Megabyte":
                return megabyteCondition(toUnit,value);
            case "Gigabyte":
                return gigabyteCondition(toUnit,value);
            case "Terabyte":
                return terabyteCondition(toUnit,value);
        }
        switch (fromUnit) {
            case "Degree Celsius":
                return celsiusCondition(toUnit,value);
            case "Fahrenheit":
                return fahrenheitCondition(toUnit,value);
            case "Kelvin":
                return kelvinCondition(toUnit,value);
        }
        switch (fromUnit){
            case "Centimetre":
                return centimetreCondition(toUnit,value);
            case "Millimetre":
                return millimetreCondition(toUnit,value);
            case "Kilometre":
                return kilometreCondition(toUnit,value);
            case "Metre":
                return metreCondition(toUnit,value);
            case "Micrometre":
                return micrometreCondition(toUnit,value);
            case "Nanometre":
                return nanometreCondition(toUnit,value);
            case "Mile":
                return mileCondition(toUnit,value);
            case "Yard":
                return yardCondition(toUnit,value);
            case "Foot":
                return footCondition(toUnit,value);
            case "Inch":
                return inchCondition(toUnit,value);
        }
        switch (fromUnit){
            case "Square Metre":
                return squareMetreCondition(toUnit,value);
            case "Square Kilometre":
                return squareKilometreCondition(toUnit,value);
            case "Square Mile":
                return squareMileCondition(toUnit,value);
            case "Square Yard":
                return squareYardCondition(toUnit,value);
            case "Square Foot":
                return squareFootCondition(toUnit,value);
            case "Square Inch":
                return squareInchCondition(toUnit,value);
        }
        switch (fromUnit){
            case "Gram":
                return gramCondition(toUnit,value);
            case "KiloGram":
                return kiloGramCondition(toUnit,value);
            case "Milligram":
                return milliGramCondition(toUnit,value);
            case "Microgram":
                return mircroGramCondition(toUnit,value);
            case "Us-ton":
                return usTonCondition(toUnit,value);
            case "Tonne":
                return tonneCondition(toUnit,value);
            case "Pound":
                return poundCondition(toUnit,value);
        }
        switch (fromUnit){
            case "Mile per hour":
                return mile_per_HourCondition(toUnit,value);
            case "Foot per second":
                return foot_per_SecCondition(toUnit,value);
            case "Metre per second":
                return metre_per_SecCondition(toUnit,value);
            case "Kilometre per second":
                return kilometre_per_SecCondition(toUnit,value);
            case "Knot":
                return knotCondition(toUnit,value);

        }
        switch (fromUnit){
            case "Nanosecond":
                return nanosecondCondition(toUnit,value);
            case "Microsecond":
                return micosecondCondition(toUnit,value);
            case "Millisecond":
                return millisecondCondition(toUnit,value);
            case "Second":
                return secondCondition(toUnit,value);
            case "Minute":
                return minuteCondition(toUnit,value);
            case "Hour":
                return hourCondition(toUnit,value);
            case "Day":
                return dayCondition(toUnit,value);
            case "Week":
                return weekCondition(toUnit,value);
            case "Month":
                return monthCondition(toUnit,value);
            case "Calender year":
                return calenderYearCondition(toUnit,value);
            case "Decade":
                return decadesCondition(toUnit,value);
            case "Century":
                return centuryCondition(toUnit,value);
        }
        switch (fromUnit){
            case "Herzt":
                return herztCondition(toUnit,value);
            case "Kilohertz":
                return kiloHerztCondition(toUnit,value);
            case "Megaherzt":
                return megaHerztCondition(toUnit,value);
            case "Gigaherzt":
                return gigaHerztCondition(toUnit,value);

        }
        switch (fromUnit){
            case "Joule":
                return jouleCondition(toUnit,value);
            case "Kilocalorie":
                return kilocalorieCondition(toUnit,value);
            case "Gram calorie":
                return gramCalorieCondition(toUnit,value);
            case "Watt hour":
                return wattHourCondition(toUnit,value);
            case "Kilowatt hour":
                return kilowattHourCondition(toUnit,value);
            case "Electronvolt":
                return electrovoltCondition(toUnit,value);

        }
        switch (fromUnit){
            case "Mile per US gallon":
                return mp_US_Gallon(toUnit,value);
            case "Mile per gallon":
                return mp_Gallon(toUnit,value);
            case "Kilometre per litre":
                return kp_Liter(toUnit,value);

        }
        switch (fromUnit){
            case "Pascal":
                return pascal(toUnit,value);
            case "Bar":
                return bar(toUnit,value);
            case "Pound per square inch":
                return poundper_SquareInch(toUnit,value);
            case "Standard atmosphere":
                return standardAtmosphere(toUnit,value);
            case "Torr":
                return torr(toUnit,value);


        }


        return value;
    }

}






