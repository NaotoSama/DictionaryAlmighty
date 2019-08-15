package com.example.android.dictionaryalmighty;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.util.ArrayList;


/**
 * 設置網頁框
 */
public class WebViewActivity extends AppCompatActivity {

    WebView webViewBrowser; //預設網頁框為空
    ProgressBar progressBar; //載入網址的進度條
    String speechAutoTranslationPageResultCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webViewBrowser = null;

        //Get a reference to the WebView//
        webViewBrowser = findViewById(R.id.webview_browser);
        progressBar = findViewById(R.id.progressBar);

        //設置進度條加載進度
        new Thread(){
            @Override
            public void run() {
                int i=0;
                while(i<100){
                    i++;
                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progressBar.setProgress(i);
                }
            }
        }.start();


        WebSettings webSettings = webViewBrowser.getSettings(); //WebSettings 是用來設定 WebView 屬性的類別
        webSettings.setJavaScriptEnabled(true); //針對 WebSettings 去做設定，WebView 預設下是限制 JavaScript 的，若要啟用需要做此設定
        webSettings.setSupportZoom(true); //內部網頁支援縮放
        webSettings.setBuiltInZoomControls(true); //顯示縮放控制項
        webViewBrowser.setWebViewClient(new WebViewClientImpl());
        webViewBrowser.requestFocus();
        //Webview裡面的網頁，如果有input需要輸入，但是點上去卻沒反應，輸入法不出來。這種情況是因為webview沒有獲取焦點。
        //需要在java裡面給webview設置一下requestFocus() 就行了。



        //接收來自MainActivity的Intent
        Intent intent = getIntent();

        //抓speechAutoTranslationCode代碼，跳顯出對應語言的語音辨識視窗
        if (MainActivity.speechAutoTranslationCode=="CHtoEN") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "zh_TW");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }
            speechAutoTranslationPageResultCode="loadCHtoENTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="CHtoJP") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "zh_TW");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode="loadCHtoJPTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="CHtoKR") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "zh_TW");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode = "loadCHtoKRTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="CHtoES") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "zh_TW");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode = "loadCHtoESTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="ENtoCH") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en_US");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode = "loadENtoCHTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="JPtoCH") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ja_JP");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode = "loadJPtoCHTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="KRtoCH") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ko_KR");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode = "loadKRtoCHTranslationPageResult";

        }else if (MainActivity.speechAutoTranslationCode=="EStoCH") {
            Intent speechRecognitionIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "es_ES");

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(speechRecognitionIntent, 10);
            } else {
                Toast.makeText(getApplicationContext(), "Your Device Doesn't Support Speech Input", Toast.LENGTH_SHORT).show();
            }

            speechAutoTranslationPageResultCode = "loadEStoCHTranslationPageResult";

        }


            //抓用戶手動輸入的關鍵字乃至整個網址，然後加載網址
        String url= intent.getExtras().getString(com.example.android.dictionaryalmighty.MainActivity.key);
        webViewBrowser.loadUrl(url);

    }



    //Inner class for WebViewClientImpl.
    //在 WebView 畫面中，用戶無論點選了什麼超連結，都會開啟新的瀏覽器，想在自己的 WebView 中跳轉頁面，就必須建立一個 WebViewClient，同時若想知道接下來將前往哪個連結，也必須透過這個方法
    //By default, whenever the user clicks a hyperlink within a WebView, the system will respond by launching the user’s preferred web browser app and then loading the URL inside this browser.
    //While this is usually the preferred behaviour, there may be certain links that you do want to load inside your WebView.
    //If there are specific URLs that you want your application to handle internally, then you’ll need to create a subclass of WebViewClient and then use the shouldOverrideUrlLoading method to check whether the user has clicked a “whitelisted” URL.
    //其實我們沒必要自訂 WebViewClient 並重寫其 shouldOverrideUrlLoading 方法，
    //也就是說我們需要針對點擊事件添加額外控制時才需要自訂shouldOverrideUrlLoading，設定網址含那些特定文字時需要調用調用流覽器載入。
    //WebViewClient 源碼中 shouldOverrideUrlLoading 方法已經預設返回 false，
    //所以只要你設置了上面的WebViewClient 就可以實現在WebView中載入新的連結而不去調用流覽器載入。

    private class WebViewClientImpl extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }


        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
        }

    }


    /**
     * 在OnCreate外面設置語音輸入的相關設定
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //設置語音輸入的相關設定
        switch (requestCode) {
            case 10:    //必須等同上面getSpeechInput方法中的requestCode:10
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    MainActivity.wordInputView.setText(result.get(0));
                }
                break;
        }


        //抓speechAutoTranslationPageResultCode代碼，然後載入自動語音翻譯的網頁
        if (speechAutoTranslationPageResultCode=="loadCHtoENTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech1 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=zh-CN&tl=en&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech1);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadCHtoJPTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech2 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=zh-CN&tl=ja&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech2);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadCHtoKRTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech3 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=zh-CN&tl=ko&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech3);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadCHtoESTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech4 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=zh-CN&tl=es&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech4);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadENtoCHTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech5 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=en&tl=zh-TW&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech5);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadJPtoCHTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech6 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=ja&tl=zh-TW&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech6);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadKRtoCHTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech7 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=ko&tl=zh-TW&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech7);
            webViewBrowser.setVisibility(View.VISIBLE);

        }else if (speechAutoTranslationPageResultCode=="loadEStoCHTranslationPageResult") {
            MainActivity.searchKeyword = MainActivity.wordInputView.getText().toString();
            String urlSpeech8 = "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=es&tl=zh-TW&text="+MainActivity.searchKeyword;
            webViewBrowser.loadUrl(urlSpeech8);
            webViewBrowser.setVisibility(View.VISIBLE);

        }

    }


    //Check whether there’s any WebView history that the user can navigate back to//
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {

        if ((keyCode == KeyEvent.KEYCODE_BACK) && webViewBrowser.canGoBack()) {
            webViewBrowser.goBack();
            //If there is history, then the canGoBack method will return ‘true’//
            return true;
        }

        //If the button that’s been pressed wasn’t the ‘Back’ button, or there’s currently no
        //WebView history, then the system should resort to its default behavior and return
        //the user to the previous Activity//
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

