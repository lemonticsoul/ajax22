package com.cookandroid.gazae;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        setTitle("아약스는 위대하다.");

        EditText edtRaw=(EditText)findViewById(R.id.edtRaw);
        TextView text=(TextView)findViewById(R.id.text1);
        text.setText("본문으로 가실려면 뒤로가기 버튼을 눌러주세요.");
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setText("본문 보기");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputStream inputS=getResources().openRawResource(R.raw.ajax);
                    byte [] txt=new byte[inputS.available()];
                    inputS.read(txt);
                    edtRaw.setText(new String(txt));
                    inputS.close();
                } catch (IOException e) {

                }

            }
        });



    }
}