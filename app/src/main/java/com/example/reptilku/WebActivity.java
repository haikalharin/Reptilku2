package com.example.reptilku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;


public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        TextView t = (TextView)findViewById(R.id.web_url2);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("urlWeb");
        t.setText(s);

        WebView webviewku;
        WebSettings websettingku;

        webviewku = (WebView)findViewById(R.id.WebView1);
        webviewku.getSettings().setJavaScriptEnabled(true);
        websettingku = webviewku.getSettings();
        TextView textView=(TextView)
                findViewById(R.id.web_url2);
        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("" + textView.getText());
        websettingku.setJavaScriptEnabled(true);
        webviewku.setWebViewClient(new WebViewClient());



    }
}
