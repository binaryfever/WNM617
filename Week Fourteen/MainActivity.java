package com.example.student.webviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //This is the url we want to load
        String url="http://www.google.com";

        //Tell the main activity the webview we want to use
        WebView view = (WebView) this.findViewById(R.id.webView);

        //By default JavaScript is disabled so we just enable it
        view.getSettings().setJavaScriptEnabled(true);

        //This allows us to load new pages in our WebView and not the defaut browser of the phone
        view.setWebViewClient(new WebViewClient());

        //Load the URL
        view.loadUrl(url);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
