package com.example.doodleview;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity6 extends AppCompatActivity {

    //Button for for "QGC/MP Connect" (Copy to Clipboard)
    Button btnRead2;
    EditText textResult2;


    //Spinners -- Shared Prefrences
    SharedPreferences LastSelect;
    SharedPreferences.Editor editor;


    //Spinners -- String Arrays

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        Button btn9 = (Button) findViewById(R.id.nav_mesh);

        btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setAlpha(0.5f);
                        break;
                        case MotionEvent.ACTION_UP:
                            v.setAlpha(1f);
                            startActivity(new Intent(MainActivity6.this, MainActivity8.class));
                            default:
                                v.setAlpha(0.5f);
                }
                return false;
            }
        });

        Button btn10 = (Button) findViewById(R.id.nav_flightmanager);
        btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setAlpha(0.5f);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setAlpha(1f);
                        startActivity(new Intent(MainActivity6.this, MainActivity9.class));
                    default:
                        v.setAlpha(0.5f);
                }
                return false;
            }
        });

        Button btn12 = (Button) findViewById(R.id.nav_swarm);
        btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setAlpha(0.5f);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setAlpha(1f);
                        startActivity(new Intent(MainActivity6.this, MainActivity10.class));
                    default:
                        v.setAlpha(0.5f);
                }
                return false;
            }
        });


        Button btn11 = (Button) findViewById(R.id.nav9);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity6.this, MainActivity.class));
            }
        });




        ImageButton btn6 = (ImageButton) findViewById(R.id.imageButton2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity6.this, MainActivity.class));
            }
        });


        //Menu


    }
}













