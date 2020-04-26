package com.example.webview;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBuiltInZoomControls(false);

        mywebView.clearFormData();
        mywebView.clearHistory();
        mywebView.clearCache(true);
        mywebView.getSettings().setAppCacheEnabled(true);
        mywebView.getSettings().setDatabaseEnabled(true);
        mywebView.getSettings().setDomStorageEnabled(true);
        mywebView.setWebChromeClient(new WebChromeClient());

        mywebView.getSettings().setJavaScriptEnabled(true);
        mywebView.getSettings().setAllowFileAccessFromFileURLs(true);
        mywebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        mywebView.getSettings().setBuiltInZoomControls(true);
        mywebView.setWebChromeClient(new WebChromeClient());

        mywebView.getSettings().setLoadWithOverviewMode(true);
        mywebView.getSettings().setUseWideViewPort(true);


        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        mywebView.loadUrl("http://192.168.29.146/parents/V_T_school_messagelist.php");

        //  mywebView.loadUrl("http://ekjot.ddns.net:81/parents/");
        
        // Line of Code for opening links in app

        mywebView.setWebViewClient(new WebViewClient());
    }

    //Code For Back Button
    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack()) {
            mywebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
