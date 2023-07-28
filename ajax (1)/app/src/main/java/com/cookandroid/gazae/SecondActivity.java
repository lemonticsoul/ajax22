package com.cookandroid.gazae;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("아약스란?");

        TextView text1=findViewById(R.id.text3);
        text1.setText("초기화면으로 갈려면 홈바에 있는 뒤로 가기 눌러주세요");
        WebView web1=findViewById(R.id.web1);
        web1.loadUrl("https://namu.wiki/w/AFC%20%EC%95%84%EC%95%BD%EC%8A%A4");

    }
}