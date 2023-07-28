package com.cookandroid.gazae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Ajax");


        final String[] mid={"1. 아약스란?",
                "2. 아약스 선수보기 ","3. 아약스는 위대하다.",
                "4. 엠블럼 소개","유럽 챔스 16강  벤피카 vs 아약스 2022.02.24 05:00(한국시간)"};

        TextView text=(TextView) findViewById(R.id.tx1);
        ListView list=(ListView)findViewById(R.id.listView1);

        text.setText("축구클럽 아약스 유럽챔스 조별리그 전승 기념 축하 기념 팬메이드 앱 ");
        ArrayAdapter<String > adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mid);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                if (mid[arg2]==mid[0])
                {
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);

                }
               if(mid[arg2]==mid[1])
               {
                   Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                   startActivity(intent);
               }
                if(mid[arg2]==mid[2])
                {
                    Intent intent=new Intent(MainActivity.this,FourthActivity.class);
                    startActivity(intent);
                }
                if(mid[arg2]==mid[3])
                {
                    Intent intent=new Intent(MainActivity.this,FifithActivity.class);
                    startActivity(intent);
                }
                if(mid[arg2]==mid[4])
                {
                    Toast.makeText(getApplicationContext(),"많이 많이 응원해주세요~ 아약스 우승 가즈아!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}