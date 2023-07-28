package com.cookandroid.gazae;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.gazae.R;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("아약스 베스트 11 선수 보기+감독");

        ImageView image[]=new ImageView[12];
        Integer imageId[]={R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4,R.id.tv5,R.id.tv6,
                R.id.tv7,R.id.tv8,R.id.tv9,R.id.tv10,R.id.tv11,R.id.tv12};
        final String imgName[]={"24. GK(골키퍼) 오나나 ","31.DF (수비수) 탈리아피코 ","21.DF (수비수) 마르티네즈 ",
                "17.DF (수비수) 블린트 ","12.DF (수비수)마즈라위 ","8.MF(미드필더) 흐라벤베르흐","23.MF(미드필더) 베르흐하위스 ","4.MF(미드필더) 알바레스 ",
                "10.FW(공격수) 타디치 ","22.FW(공격수) 알레 ","11.FW(공격수) 안토니 ","감독 에릭 텐 하흐"};
        for (int i =0;i<12;i++){
            final int index;
            index =i;
            image[index]=(ImageView)findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),imgName[index],Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}