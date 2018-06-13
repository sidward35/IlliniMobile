package cf.sidward35.illinimobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView builder = findViewById(R.id.webview);
        WebSettings webSettings = builder.getSettings();
        webSettings.setJavaScriptEnabled(true);
        builder.loadUrl("https://go.illinois.edu/studentmobile");
        builder.setWebViewClient(new WebViewClient());
    }
}
