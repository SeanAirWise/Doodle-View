package com.example.doodleview;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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
import androidx.preference.PreferenceManager;

public class MainActivity2 extends AppCompatActivity {


    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Navigation -- Menu Buttons
        Button btn1 = (Button)findViewById(R.id.nav);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
        Button btn2 = (Button) findViewById(R.id.nav2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity2.class));
            }
        });

        Button btn3 = (Button) findViewById(R.id.nav3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });
        Button btn4 = (Button) findViewById(R.id.nav4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity4.class));
            }
        });


        // Bring in SharedPrefernces for GCS IP from MainActivity
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String value = prefs.getString("autoSave", "");

        //Toast Display the IP value
        Toast.makeText(getApplicationContext(), "" + value + "", Toast.LENGTH_LONG).show();


        CustomWebViewClient client= new CustomWebViewClient(this);
        webView =findViewById(R.id.webView);
        webView.setWebViewClient(client);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("http://192.168.6.2/ide.html");
        //webView.loadUrl("http://www.google.com");
        //webView.loadUrl ("http://" + value.toString());
        webView.loadUrl ("https://" + value);
        webView.getSettings().setAllowFileAccess(true);
        //webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        //webView.getSettings().setAppCacheEnabled(false);
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setInitialScale(1);


    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;

        }
        return super.onKeyDown(keyCode, event);

    }
}

class CustomWebViewClient extends WebViewClient {

    private Activity activity;

    public CustomWebViewClient(Activity activity) {
        this.activity = activity;
    }


    //API Less than 24
    @Override
    public boolean shouldOverrideUrlLoading(WebView webview, String url) {
        return false;

    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // Ignore SSL certificate errors, gets Doodle Labs in the webview
    }
}







