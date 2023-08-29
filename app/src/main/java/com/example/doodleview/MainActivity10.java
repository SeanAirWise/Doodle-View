package com.example.doodleview;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity10 extends AppCompatActivity {

    //Button for for "QGC/MP Connect" (Copy to Clipboard)
    Button btnRead2;
    Button btnRead3;
    Button btnRead4;

    Button btnRead5;

    EditText textResult2;


    //Spinners -- Shared Prefrences
    SharedPreferences LastSelect;
    SharedPreferences.Editor editor;


    //Spinners -- String Arrays
    String[] radio={"Nano-OEM","Mini-OEM","Embedded","External","Wearable"};
    String[] radio2={"915 MHz","2400 MHz","5800 MHz","M1 1700 MHz", "M2 1800 MHz","M3 2050 MHz","M4 2200 MHz","M5 2300 MHz","M6 2500 MHz"};
    String[] radio3={"No","WPA2-PSK"};
    String[] radio4={"N/A", "Force 128 bit CCMP (AES)","Force 256 bit CCMP (AES)","Auto","Force TKIP","Force TKIP and CCMP (AES)"};
    int images[] = {R.drawable.nano_oem_removebg_preview,R.drawable.mini_oem_removebg_preview, R.drawable._j_radio,R.drawable.external_removebg_preview, R.drawable.wearable_removebg_preview };

    int images2[] = {R.drawable._15,R.drawable._400, R.drawable._800,R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5, R.drawable.m6};
    int images3[] = {R.drawable._15,R.drawable._400};

    int images4[] = {R.drawable._15,R.drawable._400, R.drawable._800,R.drawable.m1, R.drawable.m2, R.drawable.m3};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        //Saved Prefrences Spinner 1
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick=LastSelect.getInt("LastClick", 0);

        //Saved Prefrences Spinner 2
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick2=LastSelect.getInt("LastClick2", 0);

        //Saved Prefrences Spinner 3
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick3=LastSelect.getInt("LastClick3", 0);

        //Saved Prefrences Spinner 4
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick4=LastSelect.getInt("LastClick4", 0);

        //Saved Prefrences Spinner 5
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick5=LastSelect.getInt("LastClick5", 0);

        //Saved Prefrences Spinner 6
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick6=LastSelect.getInt("LastClick6", 0);

        //Saved Prefrences Spinner 7
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick7=LastSelect.getInt("LastClick7", 0);

        //Saved Prefrences Spinner 8
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick8=LastSelect.getInt("LastClick8", 0);

        //Saved Prefrences Spinner 9
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick9=LastSelect.getInt("LastClick9", 0);

        //Saved Prefrences Spinner 10
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick10=LastSelect.getInt("LastClick10", 0);

        //Saved Prefrences Spinner 11
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick11=LastSelect.getInt("LastClick11", 0);

        //Saved Prefrences Spinner 12
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick12=LastSelect.getInt("LastClick12", 0);

        //Saved Prefrences Spinner 13
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick13=LastSelect.getInt("LastClick13", 0);

        //Saved Prefrences Spinner 14
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick14=LastSelect.getInt("LastClick14", 0);

        //Saved Prefrences Spinner 15
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick15=LastSelect.getInt("LastClick15", 0);

        //Saved Prefrences Spinner 16
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick16=LastSelect.getInt("LastClick16", 0);

        //Saved Prefrences Spinner 17
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick17=LastSelect.getInt("LastClick17", 0);

        //Saved Prefrences Spinner 18
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick18=LastSelect.getInt("LastClick18", 0);

        //Saved Prefrences Spinner 19
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick19=LastSelect.getInt("LastClick19", 0);

        //Saved Prefrences Spinner 20
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick20=LastSelect.getInt("LastClick20", 0);

        //Saved Prefrences Spinner 21
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick21=LastSelect.getInt("LastClick21", 0);

        //Saved Prefrences Spinner 22
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick22=LastSelect.getInt("LastClick22", 0);

        //Saved Prefrences Spinner 23
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick23=LastSelect.getInt("LastClick23", 0);

        //Saved Prefrences Spinner 24
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick24=LastSelect.getInt("LastClick24", 0);

        //Saved Prefrences Spinner 25
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick25=LastSelect.getInt("LastClick25", 0);

        //Saved Prefrences Spinner 26
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick26=LastSelect.getInt("LastClick26", 0);

        //Saved Prefrences Spinner 27
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick27=LastSelect.getInt("LastClick27", 0);

        //Saved Prefrences Spinner 28
        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();
        final int LastClick28=LastSelect.getInt("LastClick28", 0);






        // Spinner 1 Activity -- Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin7 = (Spinner) findViewById(R.id.spinner2);
        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "GCS Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 1
                editor.putInt("LastClick7",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Spinner 2 Activity --
        Spinner spin8 = (Spinner) findViewById(R.id.spinner3);
        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick8",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Spinner 3 Activity --
        Spinner spin9 = (Spinner) findViewById(R.id.spinner4);
        spin9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick9",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Spinner 4 Activity --
        Spinner spin10 = (Spinner) findViewById(R.id.spinner5);
        spin10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick10",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin11 = (Spinner) findViewById(R.id.spinner8);
        spin11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick11",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin12 = (Spinner) findViewById(R.id.spinner9);
        spin12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick12",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin13 = (Spinner) findViewById(R.id.spinner10);
        spin13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick13",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin14 = (Spinner) findViewById(R.id.spinner11);
        spin14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick14",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin15 = (Spinner) findViewById(R.id.spinner12);
        spin15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick15",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin16 = (Spinner) findViewById(R.id.spinner13);
        spin16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick16",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin17 = (Spinner) findViewById(R.id.spinner14);
        spin17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick17",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin18 = (Spinner) findViewById(R.id.spinner15);
        spin18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick18",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin19 = (Spinner) findViewById(R.id.spinner16);
        spin19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick19",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin20 = (Spinner) findViewById(R.id.spinner17);
        spin20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick20",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin21 = (Spinner) findViewById(R.id.spinner18);
        spin21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick21",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin22 = (Spinner) findViewById(R.id.spinner19);
        spin22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick22",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin23 = (Spinner) findViewById(R.id.spinner20);
        spin23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick23",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin24 = (Spinner) findViewById(R.id.spinner21);
        spin24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick24",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin25 = (Spinner) findViewById(R.id.spinner22);
        spin25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick25",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin26 = (Spinner) findViewById(R.id.spinner23);
        spin26.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick26",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin27 = (Spinner) findViewById(R.id.spinner24);
        spin27.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick27",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner spin28 = (Spinner) findViewById(R.id.spinner25);
        spin28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick28",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });






        // Navigation -- Menu Buttons
        Button btn5 = (Button) findViewById(R.id.nav5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity10.this, MainActivity6.class));
            }
        });







        ImageButton btn8= (ImageButton) findViewById(R.id.imageButton3);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity10.this, MainActivity6.class));
                v.setAlpha(1f);
            }
        });



        //  GCS + Drone IP SharedPreferences -- Saves user data input for GCS IP and Drone IP
        EditText editText = (EditText) findViewById(R.id.GroundControlInput);
        EditText editText2 = (EditText) findViewById(R.id.connecteddroneIP);
        EditText editText3 = (EditText) findViewById(R.id.connecteddroneIP2);
        EditText editText4 = (EditText) findViewById(R.id.connecteddroneIP3);
        EditText editText5 = (EditText) findViewById(R.id.connecteddroneIP4);
        EditText editText6 = (EditText) findViewById(R.id.connecteddroneIP5);
        EditText editText7 = (EditText) findViewById(R.id.connecteddroneIP6);
        EditText editText8 = (EditText) findViewById(R.id.connecteddroneIP7);
        EditText editText9 = (EditText) findViewById(R.id.connecteddroneIP8);
        EditText editText10 = (EditText) findViewById(R.id.connecteddroneIP9);
        EditText editText11 = (EditText) findViewById(R.id.connecteddroneIP10);

        EditText editText22 = (EditText) findViewById(R.id.gcs_id);
        EditText editText23 = (EditText) findViewById(R.id.drone_1_id);
        EditText editText24 = (EditText) findViewById(R.id.drone_2_id);
        EditText editText25 = (EditText) findViewById(R.id.drone_3_id);
        EditText editText26 = (EditText) findViewById(R.id.drone_4_id);
        EditText editText27 = (EditText) findViewById(R.id.drone_5_id);
        EditText editText28 = (EditText) findViewById(R.id.drone_6_id);
        EditText editText29 = (EditText) findViewById(R.id.drone_7_id);
        EditText editText30 = (EditText) findViewById(R.id.drone_8_id);
        EditText editText31 = (EditText) findViewById(R.id.drone_9_id);
        EditText editText32 = (EditText) findViewById(R.id.drone_10_id);




        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);
        editText.setText(prefs.getString("autoSave", ""));
        editText2.setText(prefs.getString("autoSave2", ""));
        editText3.setText(prefs.getString("autoSave3", ""));
        editText4.setText(prefs.getString("autoSave4", ""));
        editText5.setText(prefs.getString("autoSave5", ""));
        editText6.setText(prefs.getString("autoSave6", ""));
        editText7.setText(prefs.getString("autoSave7", ""));
        editText8.setText(prefs.getString("autoSave8", ""));
        editText9.setText(prefs.getString("autoSave9", ""));
        editText10.setText(prefs.getString("autoSave10", ""));
        editText11.setText(prefs.getString("autoSave11", ""));

        editText22.setText(prefs.getString("autoSave22", ""));
        editText23.setText(prefs.getString("autoSave23", ""));
        editText24.setText(prefs.getString("autoSave24", ""));
        editText25.setText(prefs.getString("autoSave25", ""));
        editText26.setText(prefs.getString("autoSave26", ""));
        editText27.setText(prefs.getString("autoSave27", ""));
        editText28.setText(prefs.getString("autoSave28", ""));
        editText29.setText(prefs.getString("autoSave29", ""));
        editText30.setText(prefs.getString("autoSave30", ""));
        editText31.setText(prefs.getString("autoSave31", ""));
        editText32.setText(prefs.getString("autoSave32", ""));









        //GCS IP Activity --
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #1 IP Activity --
        editText2.setText(prefs.getString("autoSave2", ""));
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave2", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #2 IP Activity --
        editText3.setText(prefs.getString("autoSave3", ""));
        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave3", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #3 IP Activity --
        editText4.setText(prefs.getString("autoSave4", ""));
        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave4", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #4 IP Activity --
        editText5.setText(prefs.getString("autoSave5", ""));
        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave5", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #5 IP Activity --
        editText6.setText(prefs.getString("autoSave6", ""));
        editText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave6", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #6 IP Activity --
        editText7.setText(prefs.getString("autoSave7", ""));
        editText7.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave7", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #7 IP Activity --
        editText8.setText(prefs.getString("autoSave8", ""));
        editText8.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave8", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #8 IP Activity --
        editText9.setText(prefs.getString("autoSave9", ""));
        editText9.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave9", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #9 IP Activity --
        editText10.setText(prefs.getString("autoSave10", ""));
        editText10.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave10", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #10 IP Activity --
        editText11.setText(prefs.getString("autoSave11", ""));
        editText11.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave11", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });








        //GCS MAV_SYS_ID --
        editText22.setText(prefs.getString("autoSave22", ""));
        editText22.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave22", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #1 MAV_SYS_ID --
        editText23.setText(prefs.getString("autoSave23", ""));
        editText23.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave23", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #2 MAV_SYS_ID --
        editText24.setText(prefs.getString("autoSave24", ""));
        editText24.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave24", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #3 MAV_SYS_ID --
        editText25.setText(prefs.getString("autoSave25", ""));
        editText25.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave25", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #4 MAV_SYS_ID --
        editText26.setText(prefs.getString("autoSave26", ""));
        editText26.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave26", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #5 MAV_SYS_ID --
        editText27.setText(prefs.getString("autoSave27", ""));
        editText27.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave27", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #6 MAV_SYS_ID --
        editText28.setText(prefs.getString("autoSave28", ""));
        editText28.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave28", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #7 MAV_SYS_ID --
        editText29.setText(prefs.getString("autoSave29", ""));
        editText29.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave29", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #8 MAV_SYS_ID --
        editText30.setText(prefs.getString("autoSave30", ""));
        editText30.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave30", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #9 MAV_SYS_ID --
        editText31.setText(prefs.getString("autoSave31", ""));
        editText31.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave31", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Drone #10 MAV_SYS_ID --
        editText32.setText(prefs.getString("autoSave32", ""));
        editText32.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                prefs.edit().putString("autoSave32", s.toString()).apply();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });











        // Button for "QGC/MP Connect" -- (Copy to Clipboard)
        btnRead2 = (Button) findViewById(R.id.readclient3);
        btnRead2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 2) Pulling "Drone IP" user data entered to "QGC/MP Connect" and Copy to Clipboard
                EditText editText2 = (EditText) findViewById(R.id.connecteddroneIP);
                String value = editText2.getText().toString();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Drone IP", value);
                clipboard.setPrimaryClip(clip);

                // Toast what was on the clipboard for customer UX
                Toast.makeText(getApplicationContext(), "\n" + "                     Drone IP Copied to Clipboard!" + "\n" + "\n" + "                      DRONE IP:  " + value.toString() + "\n" + "\n" + "Ready to Connect in QGroundControl / Mission Planner" + "\n", Toast.LENGTH_LONG).show();

            }
        });




        //Spinner 1 -- NOTE  -- Must create CustomAdapter.java -- AND -- spinner_custom_layout.xml (this file is how you manipulate the size/shape)
        //CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),images,radio);
        //spin.setAdapter(customAdapter);
        //Saved Prefrence Spinner 1
        //spin.setSelection(LastClick);

        //Spinner 2 -- NOTE  -- Must create CustomAdapter2.java -- AND -- spinner_custom_layout2.xml (this file is how you manipulate the size/shape)
        //CustomAdapter2 customAdapter2=new CustomAdapter2(getApplicationContext(),images,radio);
        //spin2.setAdapter(customAdapter2);
        //Saved Prefrence Spinner 2
        //spin2.setSelection(LastClick2);

        //Spinner 3 -- NOTE  -- Must create CustomAdapter3.java -- AND -- spinner_custom_layout3.xml (this file is how you manipulate the size/shape)
        //CustomAdapter3 customAdapter3=new CustomAdapter3(getApplicationContext(), images2, radio2);
        //spin3.setAdapter(customAdapter3);
        //Saved Prefrence Spinner 3
        //spin3.setSelection(LastClick3);



        //Spinner 7 -- NOTE  -- Must create CustomAdapter4.java -- AND -- spinner_custom_layout4.xml (this file is how you manipulate the size/shape)
        CustomAdapter7 customAdapter7=new CustomAdapter7(getApplicationContext(), images, radio);
        spin7.setAdapter(customAdapter7);
        //Saved Prefrence Spinner 7
        spin7.setSelection(LastClick7);

        CustomAdapter8 customAdapter8=new CustomAdapter8(getApplicationContext(), images, radio);
        spin8.setAdapter(customAdapter8);
        //Saved Prefrence Spinner 8
        spin8.setSelection(LastClick8);

        CustomAdapter9 customAdapter9=new CustomAdapter9(getApplicationContext(), images2, radio2);
        spin9.setAdapter(customAdapter9);
        //Saved Prefrence Spinner 8
        spin9.setSelection(LastClick9);

        CustomAdapter10 customAdapter10=new CustomAdapter10(getApplicationContext(), images2, radio2);
        spin10.setAdapter(customAdapter10);
        //Saved Prefrence Spinner 8
        spin10.setSelection(LastClick10);

        CustomAdapter11 customAdapter11=new CustomAdapter11(getApplicationContext(), images, radio);
        spin11.setAdapter(customAdapter11);
        //Saved Prefrence Spinner 8
        spin11.setSelection(LastClick11);

        CustomAdapter12 customAdapter12=new CustomAdapter12(getApplicationContext(), images2, radio2);
        spin12.setAdapter(customAdapter12);
        //Saved Prefrence Spinner 8
        spin12.setSelection(LastClick12);

        CustomAdapter13 customAdapter13=new CustomAdapter13(getApplicationContext(), images, radio);
        spin13.setAdapter(customAdapter13);
        //Saved Prefrence Spinner 8
        spin13.setSelection(LastClick13);

        CustomAdapter14 customAdapter14=new CustomAdapter14(getApplicationContext(), images2, radio2);
        spin14.setAdapter(customAdapter14);
        //Saved Prefrence Spinner 8
        spin14.setSelection(LastClick14);

        CustomAdapter15 customAdapter15=new CustomAdapter15(getApplicationContext(), images, radio);
        spin15.setAdapter(customAdapter15);
        //Saved Prefrence Spinner 8
        spin15.setSelection(LastClick15);

        CustomAdapter16 customAdapter16=new CustomAdapter16(getApplicationContext(), images2, radio2);
        spin16.setAdapter(customAdapter16);
        //Saved Prefrence Spinner 8
        spin16.setSelection(LastClick16);

        CustomAdapter17 customAdapter17=new CustomAdapter17(getApplicationContext(), images, radio);
        spin17.setAdapter(customAdapter17);
        //Saved Prefrence Spinner 8
        spin17.setSelection(LastClick17);

        CustomAdapter18 customAdapter18=new CustomAdapter18(getApplicationContext(), images2, radio2);
        spin18.setAdapter(customAdapter18);
        //Saved Prefrence Spinner 8
        spin18.setSelection(LastClick18);

        CustomAdapter19 customAdapter19=new CustomAdapter19(getApplicationContext(), images, radio);
        spin19.setAdapter(customAdapter19);
        //Saved Prefrence Spinner 8
        spin19.setSelection(LastClick19);

        CustomAdapter20 customAdapter20=new CustomAdapter20(getApplicationContext(), images2, radio2);
        spin20.setAdapter(customAdapter20);
        //Saved Prefrence Spinner 8
        spin20.setSelection(LastClick20);

        CustomAdapter21 customAdapter21=new CustomAdapter21(getApplicationContext(), images, radio);
        spin21.setAdapter(customAdapter21);
        //Saved Prefrence Spinner 8
        spin21.setSelection(LastClick21);

        CustomAdapter22 customAdapter22=new CustomAdapter22(getApplicationContext(), images2, radio2);
        spin22.setAdapter(customAdapter22);
        //Saved Prefrence Spinner 8
        spin22.setSelection(LastClick22);

        CustomAdapter23 customAdapter23=new CustomAdapter23(getApplicationContext(), images, radio);
        spin23.setAdapter(customAdapter23);
        //Saved Prefrence Spinner 8
        spin23.setSelection(LastClick23);

        CustomAdapter24 customAdapter24=new CustomAdapter24(getApplicationContext(), images2, radio2);
        spin24.setAdapter(customAdapter24);
        //Saved Prefrence Spinner 8
        spin24.setSelection(LastClick24);

        CustomAdapter25 customAdapter25=new CustomAdapter25(getApplicationContext(), images, radio);
        spin25.setAdapter(customAdapter25);
        //Saved Prefrence Spinner 8
        spin25.setSelection(LastClick25);

        CustomAdapter26 customAdapter26=new CustomAdapter26(getApplicationContext(), images2, radio2);
        spin26.setAdapter(customAdapter26);
        //Saved Prefrence Spinner 8
        spin26.setSelection(LastClick26);

        CustomAdapter27 customAdapter27=new CustomAdapter27(getApplicationContext(), images, radio);
        spin27.setAdapter(customAdapter27);
        //Saved Prefrence Spinner 8
        spin27.setSelection(LastClick27);

        CustomAdapter28 customAdapter28=new CustomAdapter28(getApplicationContext(), images2, radio2);
        spin28.setAdapter(customAdapter28);
        //Saved Prefrence Spinner 8
        spin28.setSelection(LastClick28);





    }



}



    //Menu
















