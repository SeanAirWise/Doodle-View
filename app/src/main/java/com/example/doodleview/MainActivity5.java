package com.example.doodleview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {


    private WebView webView;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        // Navigation --Menu Buttons
        Button btn1 = (Button) findViewById(R.id.nav);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity.class));
            }
        });
        Button btn2 = (Button) findViewById(R.id.nav2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity2.class));
            }
        });

        Button btn3 = (Button) findViewById(R.id.nav3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity3.class));
            }
        });
        Button btn4 = (Button) findViewById(R.id.nav4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity4.class));
            }
        });


        //Toast Display the IP value
        Toast.makeText(getApplicationContext(), "Back Up Radio IP", Toast.LENGTH_LONG).show();
    }
}

