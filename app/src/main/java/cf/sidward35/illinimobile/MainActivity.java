package cf.sidward35.illinimobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);
        WebView builder = findViewById(R.id.webview);
        WebSettings webSettings = builder.getSettings();
        webSettings.setJavaScriptEnabled(true);
        getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);
        builder.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress){
                setTitle("Loading...");
                setProgress(progress * 100);
                if(progress == 100) setTitle(R.string.app_name);
            }
        });
        builder.loadUrl("https://go.illinois.edu/studentmobile");
        builder.setWebViewClient(new WebViewClient());
    }
}
