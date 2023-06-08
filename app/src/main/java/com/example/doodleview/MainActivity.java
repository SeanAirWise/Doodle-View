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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    //Button for for "QGC/MP Connect" (Copy to Clipboard)
    Button btnRead2;
    EditText textResult2;


    //Spinners -- Shared Prefrences
    SharedPreferences LastSelect;
    SharedPreferences.Editor editor;


    //Spinners -- String Arrays
    String[] radio={"Nano-OEM","Mini-OEM","Embedded","External","Wearable"};
    String[] radio2={"915 MHz","2400 MHz","5800 MHz","M1 1700 MHz", "M2 1800 MHz","M3 2050 MHz","M4 2200 MHz","M5 2300 MHz","M6 2500 MHz"};
    int images[] = {R.drawable.nano_oem_removebg_preview,R.drawable.mini_oem_removebg_preview, R.drawable._j_radio,R.drawable.external_removebg_preview, R.drawable.wearable_removebg_preview };

    int images2[] = {R.drawable._15,R.drawable._400, R.drawable._800,R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5, R.drawable.m6};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        // Spinner 1 Activity -- Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "GCS Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 1
                editor.putInt("LastClick",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Spinner 2 Activity --
        Spinner spin2 = (Spinner) findViewById(R.id.spinner3);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 2
                editor.putInt("LastClick2",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Spinner 3 Activity --
        Spinner spin3 = (Spinner) findViewById(R.id.spinner4);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick3",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Spinner 4 Activity --
        Spinner spin4 = (Spinner) findViewById(R.id.spinner5);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick4",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



        // Navigation -- Menu Buttons
        Button btn = (Button) findViewById(R.id.nav);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
        Button btn2 = (Button) findViewById(R.id.nav2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        Button btn3 = (Button) findViewById(R.id.nav3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
        Button btn4 = (Button) findViewById(R.id.nav4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity4.class));
            }
        });



        //  GCS + Drone IP SharedPreferences -- Saves user data input for GCS IP and Drone IP
        EditText editText = (EditText) findViewById(R.id.GroundControlInput);
        EditText editText2 = (EditText) findViewById(R.id.connecteddroneIP);
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);
        editText.setText(prefs.getString("autoSave", ""));
        editText2.setText(prefs.getString("autoSave2", ""));

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

        //Drone IP Activity --
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
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),images,radio);
        spin.setAdapter(customAdapter);
        //Saved Prefrence Spinner 1
        spin.setSelection(LastClick);

        //Spinner 2 -- NOTE  -- Must create CustomAdapter2.java -- AND -- spinner_custom_layout2.xml (this file is how you manipulate the size/shape)
        CustomAdapter2 customAdapter2=new CustomAdapter2(getApplicationContext(),images,radio);
        spin2.setAdapter(customAdapter2);
        //Saved Prefrence Spinner 2
        spin2.setSelection(LastClick2);

        //Spinner 3 -- NOTE  -- Must create CustomAdapter3.java -- AND -- spinner_custom_layout3.xml (this file is how you manipulate the size/shape)
        CustomAdapter3 customAdapter3=new CustomAdapter3(getApplicationContext(), images2, radio2);
        spin3.setAdapter(customAdapter3);
        //Saved Prefrence Spinner 1
        spin3.setSelection(LastClick3);

        //Spinner 4 -- NOTE  -- Must create CustomAdapter4.java -- AND -- spinner_custom_layout4.xml (this file is how you manipulate the size/shape)
        CustomAdapter4 customAdapter4=new CustomAdapter4(getApplicationContext(), images2, radio2);
        spin4.setAdapter(customAdapter4);
        //Saved Prefrence Spinner 2
        spin4.setSelection(LastClick4);
    }
}













