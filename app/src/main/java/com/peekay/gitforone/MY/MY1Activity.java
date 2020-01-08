package com.peekay.gitforone.MY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.peekay.gitforone.R;

public class MY1Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my1);
        webView = findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(this, "mytoast");
        webView.loadUrl("file:///android_asset/index.html");
        webView.setWebViewClient(new WebViewClient());
    }

    @JavascriptInterface
    public void ShowToast(String s) {
        Log.d("sss123", "ShowToast: " + s);
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
