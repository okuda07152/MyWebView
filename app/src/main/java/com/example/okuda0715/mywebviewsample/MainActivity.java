package com.example.okuda0715.mywebviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        // リンクをクリックしたときに標準ブラウザへ遷移させずにWebView内で表示できるようにする指定
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.co.jp");

    }
}
