package com.cookandroid.gazae;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FifithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
        setTitle("유니폼과 엠블럼");



    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Bitmap picture = BitmapFactory.decodeResource(getResources(),R.drawable.ajax);
            int picX=(this.getWidth()-picture.getWidth())/2 ;
            int picY=(this.getHeight()-picture.getHeight())/2 ;

            Paint paint=new Paint();
            EmbossMaskFilter eMask;

            eMask=new EmbossMaskFilter(new float[]{3,3,10},0.5f,5,10);
            paint.setMaskFilter(eMask);
            canvas.drawBitmap(picture,picX,picY,paint);
            picture.recycle();



        }

    }
}