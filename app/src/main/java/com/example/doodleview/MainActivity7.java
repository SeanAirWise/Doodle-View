package com.example.doodleview;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity7 extends AppCompatActivity {

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
        setContentView(R.layout.activity_main7);

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




        // Spinner 1 Activity -- Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "GCS Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

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
                //Toast.makeText(MainActivity.this, "Drone Radio Type: "+position+" "+radio[position], Toast.LENGTH_SHORT).show();

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
                //Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

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
                //Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick4",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Spinner 5 Activity --
        Spinner spin5 = (Spinner) findViewById(R.id.spinner6);
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick5",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Spinner 6 Activity --
        Spinner spin6 = (Spinner) findViewById(R.id.spinner7);
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Radio Frequency: "+position+" "+radio2[position], Toast.LENGTH_SHORT).show();

                //Saved Prefrence Spinner 3
                editor.putInt("LastClick6",position);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



        // Navigation -- Menu Buttons






        ImageButton btn6= (ImageButton) findViewById(R.id.imageButton2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this, MainActivity.class));
                v.setAlpha(1f);
            }
        });

        ImageButton btn8= (ImageButton) findViewById(R.id.imageButton3);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this, MainActivity6.class));
                v.setAlpha(1f);
            }
        });



        //  GCS + Drone IP SharedPreferences -- Saves user data input for GCS IP and Drone IP
        EditText editText = (EditText) findViewById(R.id.GroundControlInput);
        EditText editText2 = (EditText) findViewById(R.id.connecteddroneIP);
        EditText editText3 = (EditText) findViewById(R.id.Username);
        EditText editText4 = (EditText) findViewById(R.id.password);
        EditText editText5 = (EditText) findViewById(R.id.encryptionkey);
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);
        editText.setText(prefs.getString("autoSave", ""));
        editText2.setText(prefs.getString("autoSave2", ""));
        editText3.setText(prefs.getString("autoSave3", ""));
        editText4.setText(prefs.getString("autoSave4", ""));
        editText5.setText(prefs.getString("autoSave5", ""));

        Button btn9 = (Button) findViewById(R.id.nav6);

        //Removes Encryption Key Data
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prefs.edit().remove("autoSave5").apply();

                editor.remove("LastClick5").apply();
                editor.remove("LastClick6").apply();
                startActivity(new Intent(MainActivity7.this, MainActivity7.class));

            }
        });



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

        //Username Activity --
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

        //Password Activity --
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

        //Encryption Key Activity --
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

        // Button for "Login Username"-- (Copy to Clipboard)
        btnRead3 = (Button) findViewById(R.id.readclient2);
        btnRead3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 2) Pulling "Drone IP" user data entered to "QGC/MP Connect" and Copy to Clipboard
                EditText editText3 = (EditText) findViewById(R.id.Username);
                String value2 = editText3.getText().toString();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("USERNAME", value2);
                clipboard.setPrimaryClip(clip);

                // Toast what was on the clipboard for customer UX
                Toast.makeText(getApplicationContext(), "\n" + "Username Copied to Clipboard!" + "\n" + "\n" + "USERNAME:  " + value2.toString() + "\n", Toast.LENGTH_LONG).show();

            }
        });

        // Button for "Login Username"-- (Copy to Clipboard)
        btnRead4 = (Button) findViewById(R.id.readclient4);
        btnRead4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 2) Pulling "Drone IP" user data entered to "QGC/MP Connect" and Copy to Clipboard
                EditText editText4 = (EditText) findViewById(R.id.password);
                String value3 = editText4.getText().toString();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("USERNAME", value3);
                clipboard.setPrimaryClip(clip);

                // Toast what was on the clipboard for customer UX
                Toast.makeText(getApplicationContext(), "\n" + "Password Copied to Clipboard!" + "\n" + "\n" + "PASSWORD:  " + value3.toString() + "\n", Toast.LENGTH_LONG).show();

            }
        });

        // Button for "Encryption Key"-- (Copy to Clipboard)
        btnRead5 = (Button) findViewById(R.id.readclient5);
        btnRead5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 2) Pulling "Drone IP" user data entered to "QGC/MP Connect" and Copy to Clipboard
                EditText editText5 = (EditText) findViewById(R.id.encryptionkey);
                String value4 = editText5.getText().toString();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("KEY", value4);
                clipboard.setPrimaryClip(clip);

                // Toast what was on the clipboard for customer UX
                Toast.makeText(getApplicationContext(), "\n" + "Encryption Key Copied to Clipboard!" + "\n" + "\n" + "KEY:  " + value4.toString() + "\n", Toast.LENGTH_LONG).show();

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
        //Saved Prefrence Spinner 3
        spin3.setSelection(LastClick3);

        //Spinner 4 -- NOTE  -- Must create CustomAdapter4.java -- AND -- spinner_custom_layout4.xml (this file is how you manipulate the size/shape)
        CustomAdapter4 customAdapter4=new CustomAdapter4(getApplicationContext(), images2, radio2);
        spin4.setAdapter(customAdapter4);
        //Saved Prefrence Spinner 4
        spin4.setSelection(LastClick4);

        //Spinner 5 -- NOTE  -- Must create CustomAdapter4.java -- AND -- spinner_custom_layout4.xml (this file is how you manipulate the size/shape)
        CustomAdapter5 customAdapter5=new CustomAdapter5(getApplicationContext(), images3, radio3);
        spin5.setAdapter(customAdapter5);
        //Saved Prefrence Spinner 5
        spin5.setSelection(LastClick5);

        CustomAdapter6 customAdapter6=new CustomAdapter6(getApplicationContext(), images4, radio4);
        spin6.setAdapter(customAdapter6);
        //Saved Prefrence Spinner 6
        spin6.setSelection(LastClick6);
    }



    //Menu


}













