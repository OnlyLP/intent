package com.example.mybrore;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView) findViewById(R.id.webview);
        Uri uri=getIntent().getData();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.baidu.com");
        if (uri!=null)
            webView.loadUrl(uri.toString());
    }
}
