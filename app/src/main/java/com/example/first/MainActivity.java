package com.example.first;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Spinner spinner1, spinner2, spinner3;
    String sp1, sp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Assuming your layout file is named activity_main.xml

        // Initialize views
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);


        // Add TextWatcher to both EditTexts


        String[] listOfConversion = {"Digital Storage", "Length", "Area", "Temperature", "Mass","Speed","Time","Frequency","Energy","Fuel Economy","Pressure"};
        String[] DigitalStorage = {"Bit", "Kilobit", "Megabit", "Gigabit", "Terabit", "Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte"};
        String[] Length = {"Kilometre", "Metre", "Centimetre", "Millimetre", "Micrometre", "Nanometre", "Mile", "Yard", "Foot", "Inch"};
        String[] Area = {"Square Metre", "Square Kilometre", "Square Mile", "Square Yard", "Square Foot", "Square Inch"};
        String[] Temperature = {"Degree Celsius", "Fahrenheit", "Kelvin"};
        String[] Mass = {"Gram", "Kilogram", "Milligram", "Microgram", "Us-ton", "Tonne", "Pound"};
        String[] Speed = {"Mile per hour","Foot per second","Metre per second","Kilometre per second","Knot"};
        String[] Time = {"Nanosecond","Microsecond","Millisecond","Second","Minute","Hour","Day","Week","Month","Calender year","Decade","Century"};
        String[] Frequency = {"Herzt","Kilohertz","Megaherzt","Gigaherzt"};
        String[] Energy = {"Joule","Kilocalorie","Gram calorie","Watt hour","Kilowatt hour","Electronvolt"};
        String[] Fuel_Economy ={"Mile per US gallon","Mile per gallon", "Kilometre per litre"};
        String[] Pressure ={"Pascal","Bar","Pound per square inch","Standard atmosphere","Torr"};



        ArrayAdapter<String> listofAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                listOfConversion
        );
        ArrayAdapter<String> digitalAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                DigitalStorage
        );
        ArrayAdapter<String> lengthAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Length
        );
        ArrayAdapter<String> areaAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Area
        );
        ArrayAdapter<String> temperatureAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Temperature
        );
        ArrayAdapter<String> massAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Mass
        );
        ArrayAdapter<String> speedAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Speed
        );
        ArrayAdapter<String> timeAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Time
        );
        ArrayAdapter<String> frequencyAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Frequency
        );
        ArrayAdapter<String> energyAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Energy
        );
        ArrayAdapter<String> fuel_EconomyAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Fuel_Economy
        );
        ArrayAdapter<String> pressureAdapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_layout,
                Pressure
        );



        spinner3.setAdapter(listofAdapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sp1 = spinner1.getSelectedItem().toString();
                editText.setText("");
                editText2.setText("");


                // Check if sp1 is now different from the previously selected item of spinner2

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sp2 = spinner2.getSelectedItem().toString();
                editText.setText("");
                editText2.setText("");


                // Check if sp2 is now different from the previously selected item of spinner1


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onTextChanged(CharSequence input1, int start, int before, int count) {
                if (TextUtils.isEmpty(input1)) {
                    if (editText.isFocused()) {
                        editText2.setText("" + input1);
                        return;
                    }

                }
                try {
                    double convertedData = ConverterFormula.dataConversion(sp1, sp2, Double.parseDouble(input1.toString()));
                        if (editText.isFocused()) {
                            editText2.setText("" + convertedData);
                        }

                } catch (NumberFormatException e) {
                        //code
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onTextChanged(CharSequence input2, int start, int before, int count) {
                if (TextUtils.isEmpty(input2)) {
                    if (editText2.isFocused()) {
                        editText.setText("" + input2);
                        return;
                    }
                }


                    try {

                    double convertedData = ConverterFormula.dataConversion(sp2, sp1, Double.parseDouble(input2.toString()));
                    if (editText2.isFocused()) {
                        editText.setText("" + convertedData);

                    }
                } catch (NumberFormatException e) {
                        //Code
                    }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

            {
                @SuppressLint("ShowToast")
                @Override
                public void onItemSelected (AdapterView < ? > parent, View view,int position,
                long id){
                String sp3 = spinner3.getSelectedItem().toString();
                switch (sp3) {
                    case "Digital Storage":
                        spinner1.setAdapter(digitalAdapter);
                        spinner2.setAdapter(digitalAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Length":
                        spinner1.setAdapter(lengthAdapter);
                        spinner2.setAdapter(lengthAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Area":
                        spinner1.setAdapter(areaAdapter);
                        spinner2.setAdapter(areaAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Temperature":
                        spinner1.setAdapter(temperatureAdapter);
                        spinner2.setAdapter(temperatureAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Mass":
                        spinner1.setAdapter(massAdapter);
                        spinner2.setAdapter(massAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Speed":
                        spinner1.setAdapter(speedAdapter);
                        spinner2.setAdapter(speedAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Time":
                        spinner1.setAdapter(timeAdapter);
                        spinner2.setAdapter(timeAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Frequency":
                        spinner1.setAdapter(frequencyAdapter);
                        spinner2.setAdapter(frequencyAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Energy":
                        spinner1.setAdapter(energyAdapter);
                        spinner2.setAdapter(energyAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Fuel Economy":
                        spinner1.setAdapter(fuel_EconomyAdapter);
                        spinner2.setAdapter(fuel_EconomyAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;
                    case "Pressure":
                        spinner1.setAdapter(pressureAdapter);
                        spinner2.setAdapter(pressureAdapter);
                        editText.setText("");
                        editText2.setText("");
                        break;

                    default:
                        Toast.makeText(MainActivity.this, "Invalid Selected", Toast.LENGTH_SHORT);
                        break;

                }

            }


                @Override
                public void onNothingSelected (AdapterView < ? > parent){

            }
            });


        }


    }




