package com.example.doodleview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
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

public class MainActivity4 extends AppCompatActivity {


    private WebView webView;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        // Navigation --Menu Buttons
        Button btn1 = (Button) findViewById(R.id.nav);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this, MainActivity.class));
            }
        });
        Button btn2 = (Button) findViewById(R.id.nav2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this, MainActivity2.class));
            }
        });

        Button btn3 = (Button) findViewById(R.id.nav3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this, MainActivity3.class));
            }
        });
        Button btn4 = (Button) findViewById(R.id.nav4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this, MainActivity5.class));
            }
        });


        //Toast Display the IP value
        Toast.makeText(getApplicationContext(), "Back Up Radio IP", Toast.LENGTH_LONG).show();



        webView = findViewById(R.id.webView);
        CustomWebViewClient client = new CustomWebViewClient(this);
        webView.setWebViewClient(client);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://192.168.153.1");
        //webView.loadUrl("http://doodlelabs.com/technical-support/");
        //webView.loadUrl ("http://" + value.toString());
        //webView.loadUrl ("https://" + value2);
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





    class CustomWebViewClient3 extends WebViewClient {

    private Activity activity;

    public CustomWebViewClient3(Activity activity) {
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



