package com.example.yuka.raindropsexercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class RainDrops extends View{

    private static final float SIZE = 10;
    private float width;
    private ArrayList<RainDrop> raindrops = new ArrayList<>();
    private int animationTick = 0;


    public RainDrops(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint blue = new Paint();
        blue.setARGB(255, 0, 0, 255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);


        width = canvas.getWidth();
        //ballX = ((float)Math.random() * width);

        animationTick++;

        if (animationTick % (50 / 2) == 0){
            float random = ((float) (Math.random() * width));
            RainDrop drop = new RainDrop(random, 0, 20);
            raindrops.add(drop);
        }


        for (RainDrop drop : raindrops){
            drop.setRainY(drop.getRainY() + 5);
            canvas.drawCircle(drop.getRainX(), drop.getRainY(), drop.getRadius(), blue);

        }



    }
}
