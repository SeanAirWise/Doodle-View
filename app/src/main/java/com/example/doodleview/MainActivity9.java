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
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity9 extends AppCompatActivity {


    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        // Navigation -- Menu Buttons
        Button btn5 = (Button) findViewById(R.id.nav8);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity9.this, MainActivity6.class));
            }
        });

        ImageButton btn10= (ImageButton) findViewById(R.id.imageButton4);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity9.this, MainActivity6.class));
                v.setAlpha(1f);
            }
        });


        // Bring in SharedPrefernces for GCS IP from MainActivity
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String value2 = prefs.getString("autoSave2", "");

        //Toast Display the IP value
        //Toast.makeText(getApplicationContext(), "" + value2 + "", Toast.LENGTH_LONG).show();


        CustomWebViewClient client= new CustomWebViewClient(this);
        webView =findViewById(R.id.webView);
        webView.setWebViewClient(client);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("http://192.168.6.2/ide.html");
        //webView.loadUrl("http://www.google.com");
        //webView.loadUrl ("http://" + value.toString());
        webView.loadUrl ("https://airwise.flightmanager.app");

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

class CustomWebViewClient5 extends WebViewClient {

    private Activity activity;

    public CustomWebViewClient5(Activity activity) {
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



