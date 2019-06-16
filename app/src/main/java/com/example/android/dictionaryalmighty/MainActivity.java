package com.example.android.dictionaryalmighty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {

    EditText wordInputView;
    String searchKeyword;

    public static String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordInputView = findViewById(R.id.Word_Input_View);

        /**
         * EnDictionarySpinner & Spinner Adapters
         */
        final Spinner EnDictionarySpinner = findViewById(R.id.EN_dictionary_providers_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        final ArrayAdapter<CharSequence> EnDictionarySpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.EN_dictionary_providers_spinner_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        EnDictionarySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        EnDictionarySpinner.setAdapter(EnDictionarySpinnerAdapter);

        EnDictionarySpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                searchKeyword = wordInputView.getText().toString(); //EditText的getText()方法只能在監聽事件(例如onItemSelected或onCLick)中才能夠實現，若放在外面就會獲取不到EditText中你輸入的值。以下同。

                if (position == 0){
                    return;

                }else if (position == 1){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://tw.dictionary.search.yahoo.com/search;_ylt=AwrtXGoL8vtcAQoAnHV9rolQ;_ylc=X1MDMTM1MTIwMDM4MQRfcgMyBGZyA3NmcARncHJpZAN0RjJnMS51MlNWU3NDZ1pfVC4zNUFBBG5fcnNsdAMwBG5fc3VnZwM0BG9yaWdpbgN0dy5kaWN0aW9uYXJ5LnNlYXJjaC55YWhvby5jb20EcG9zAzAEcHFzdHIDBHBxc3RybAMEcXN0cmwDMwRxdWVyeQNHQVkEdF9zdG1wAzE1NjAwMTU0MTE-?p="+searchKeyword+"&fr2=sb-top-tw.dictionary.search&fr=sfp");
                    //括號內的左邊是網址的識別key，右邊是網址
                    startActivity(web);

                }else if (position == 2) {
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://dictionary.cambridge.org/zht/詞典/英語-漢語-繁體/"+searchKeyword);
                    startActivity(web);

                }else if (position == 3){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.merriam-webster.com/dictionary/"+searchKeyword);
                    startActivity(web);

                }else if (position == 4) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.collinsdictionary.com/dictionary/english/"+searchKeyword);
                    startActivity(web);

                }else if (position == 5) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://en.oxforddictionaries.com/definition/"+searchKeyword);
                    startActivity(web);

                }else if (position == 6) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.vocabulary.com/dictionary/"+searchKeyword);
                    startActivity(web);

                }else if (position == 7) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.dictionary.com/browse/"+searchKeyword);
                    startActivity(web);

                }else if (position == 8) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.thefreedictionary.com/"+searchKeyword);
                    startActivity(web);

                }else if (position == 9) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.yourdictionary.com/"+searchKeyword);
                    startActivity(web);

                }else if (position == 10) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.ldoceonline.com/dictionary/"+searchKeyword);
                    startActivity(web);

                }else if (position == 11) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://dict.site/"+searchKeyword+".html");
                    startActivity(web);

                }else if (position == 12) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://en.wiktionary.org/wiki/"+searchKeyword);
                    startActivity(web);

                }else if (position == 13) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.wordhippo.com/what-is/another-word-for/"+searchKeyword+".html");
                    startActivity(web);

                }else if (position == 14) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.onelook.com/thesaurus/?s="+searchKeyword);
                    startActivity(web);

                }else if (position == 15) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.businessdictionary.com/definition/"+searchKeyword+".html");
                    startActivity(web);

                }else if (position == 16) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.agosto.com.tw/dictionary.aspx?search="+searchKeyword);
                    startActivity(web);

                }else if (position == 17) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://terms.naer.edu.tw/search/?q="+searchKeyword+"&field=ti&op=AND&group=&num=10");
                    startActivity(web);

                }else if (position == 18) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.yiym.com/?s="+searchKeyword);
                    startActivity(web);

                }

                EnDictionarySpinner.setAdapter(EnDictionarySpinnerAdapter);
                //再生成一次Adapter防止點按過的選項失效無法使用，以下同。

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });



        /**
         * JpDictionarySpinner & Spinner Adapters
         */
        final Spinner JpDictionarySpinner = findViewById(R.id.JP_dictionary_providers_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        final ArrayAdapter<CharSequence> JpDictionarySpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.JP_dictionary_providers_spinner_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        JpDictionarySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        JpDictionarySpinner.setAdapter(JpDictionarySpinnerAdapter);

        JpDictionarySpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                searchKeyword = wordInputView.getText().toString();

                if (position == 0){
                    return;

                }
                if (position == 1){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.weblio.jp/content/"+searchKeyword);
                    startActivity(web);

                }else if (position == 2) {
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://cjjc.weblio.jp/content/"+searchKeyword);
                    startActivity(web);

                }else if (position == 3){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://ejje.weblio.jp/content/"+searchKeyword);
                    startActivity(web);

                }else if (position == 4) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://thesaurus.weblio.jp/content/"+searchKeyword);
                    startActivity(web);

                }else if (position == 5) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://tangorin.com/words?search="+searchKeyword);
                    startActivity(web);

                }else if (position == 6) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://tangorin.com/kanji?search="+searchKeyword);
                    startActivity(web);

                }else if (position == 7) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://tangorin.com/names?search="+searchKeyword);
                    startActivity(web);

                }else if (position == 8) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://tangorin.com/sentences?search="+searchKeyword);
                    startActivity(web);

                }else if (position == 9) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.sanseido.biz/User/Dic/Index.aspx?TWords="+searchKeyword+"&st=0&DORDER=151617&DailyJJ=checkbox&DailyEJ=checkbox&DailyJE=checkbox");
                    startActivity(web);

                }else if (position == 10) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://kotobank.jp/word/"+searchKeyword);
                    startActivity(web);

                }else if (position == 11) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://www.sangyo-honyaku.jp/dictionaries/index/search_info:"+searchKeyword+"_ＩＴ・機械・電気電子");
                    startActivity(web);

                }else if (position == 12) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://kanji.jitenon.jp/cat/search.php?getdata="+searchKeyword+"&search=fpart&search2=twin");
                    startActivity(web);

                }else if (position == 13) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://eow.alc.co.jp/search?q="+searchKeyword);
                    startActivity(web);

                }else if (position == 14) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://eikaiwa.dmm.com/uknow/search/?keyword="+searchKeyword);
                    startActivity(web);

                }else if (position == 15) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://dict.hjenglish.com/jp/jc/"+searchKeyword);
                    startActivity(web);

                }else if (position == 16) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://jisho.org/search/"+searchKeyword);
                    startActivity(web);

                }

                JpDictionarySpinner.setAdapter(JpDictionarySpinnerAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });



        /**
         * GoogleWordSearchSpinner & Spinner Adapters
         */
        final Spinner GoogleWordSearchSpinner = findViewById(R.id.Google_word_searcher_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        final ArrayAdapter<CharSequence> GoogleWordSearchSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.Google_word_searcher_spinner_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        GoogleWordSearchSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        GoogleWordSearchSpinner.setAdapter(GoogleWordSearchSpinnerAdapter);

        GoogleWordSearchSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                searchKeyword = wordInputView.getText().toString();

                if (position == 0){
                    return;

                }
                if (position == 1){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+中文");
                    startActivity(web);

                }else if (position == 2) {
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+英文");
                    startActivity(web);

                }else if (position == 3){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+英語");
                    startActivity(web);

                }else if (position == 4) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+翻譯");
                    startActivity(web);

                }else if (position == 5) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+日文");
                    startActivity(web);

                }else if (position == 6) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+日語");
                    startActivity(web);

                }else if (position == 7) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+日本語");
                    startActivity(web);

                }else if (position == 8) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+意思");
                    startActivity(web);

                }else if (position == 9) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.google.com/search?q="+searchKeyword+"+meaning");
                    startActivity(web);

                }

                GoogleWordSearchSpinner.setAdapter(GoogleWordSearchSpinnerAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });



        /**
         * SentenceSearchSpinner & Spinner Adapters
         */
        final Spinner SentenceSearchSpinner = findViewById(R.id.Sentence_searcher_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        final ArrayAdapter<CharSequence> SentenceSearchSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.Sentence_searcher_spinner_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        SentenceSearchSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        SentenceSearchSpinner.setAdapter(SentenceSearchSpinnerAdapter);

        SentenceSearchSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                searchKeyword = wordInputView.getText().toString();

                if (position == 0){
                    return;

                }
                if (position == 1){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://ludwig.guru/s/"+searchKeyword);
                    startActivity(web);

                }else if (position == 2) {
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://sentence.yourdictionary.com/"+searchKeyword);
                    startActivity(web);

                }else if (position == 3){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.jukuu.com/search.php?q="+searchKeyword);
                    startActivity(web);

                }else if (position == 4) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.jukuu.com/jsearch.php?q="+searchKeyword);
                    startActivity(web);

                }else if (position == 5) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.jukuu.com/jcsearch.php?q="+searchKeyword);
                    startActivity(web);

                }

                SentenceSearchSpinner.setAdapter(SentenceSearchSpinnerAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });



        /**
         * MiscellaneousSpinner & Spinner Adapters
         */
        final Spinner MiscellaneousSpinner = findViewById(R.id.Miscellaneous_searcher_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        final ArrayAdapter<CharSequence> MiscellaneousSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.Miscellaneous_searcher_spinner_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        MiscellaneousSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        MiscellaneousSpinner.setAdapter(MiscellaneousSpinnerAdapter);

        MiscellaneousSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                searchKeyword = wordInputView.getText().toString();

                if (position == 0){
                    return;

                }
                if (position == 1){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://en.wikipedia.org/wiki/"+searchKeyword);
                    startActivity(web);

                }else if (position == 2) {
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://forvo.com/search/"+searchKeyword);
                    startActivity(web);

                }else if (position == 3){
                    Intent web=new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://wikidiff.com/"+searchKeyword);
                    startActivity(web);

                }else if (position == 4) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.netspeak.org/#query="+searchKeyword);
                    startActivity(web);

                }else if (position == 5) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://yomikatawa.com/kanji/"+searchKeyword+"?search=1");
                    startActivity(web);

                }else if (position == 6) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://cse.google.co.jp/cse?cx=partner-pub-1137871985589263%3A3025760782&ie=UTF-8&q="+searchKeyword);
                    startActivity(web);

                }else if (position == 7) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://www.gavo.t.u-tokyo.ac.jp/ojad/search/index/sortprefix:accent/narabi1:kata_asc/narabi2:accent_asc/narabi3:mola_asc/yure:visible/curve:invisible/details:invisible/limit:20/word:"+searchKeyword);
                    startActivity(web);

                }else if (position == 8) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://translate.google.com.tw/?hl=zh-TW#view=home&op=translate&sl=auto&tl=zh-CN&text="+searchKeyword);
                    startActivity(web);

                }else if (position == 9) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "https://translate.google.com.tw/?hl=zh-CN&tab=TT#view=home&op=translate&sl=auto&tl=zh-TW&text="+searchKeyword);
                    startActivity(web);

                }else if (position == 10) {
                    Intent web = new Intent(getApplicationContext(), com.example.android.dictionaryalmighty.WebViewActivity.class);
                    web.putExtra(key, "http://images.google.com/search?tbm=isch&q="+searchKeyword);
                    startActivity(web);

                }

                MiscellaneousSpinner.setAdapter(MiscellaneousSpinnerAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


    }

}




