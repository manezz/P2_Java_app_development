package com.example.Tec150aar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    // I created a webView
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sets the webView
        webView = (WebView) findViewById(R.id.webview);

        // Sets the webVie client
        webView.setWebViewClient(new WebViewClient());

        // Loads the website
        webView.loadUrl("https://www.tec150aar.dk");

        // Enables Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    // Lets us navigate the website
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        }
        super.onBackPressed();
    }
}
