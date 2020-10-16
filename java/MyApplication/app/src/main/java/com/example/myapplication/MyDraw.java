package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(10);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(180, 180, 200, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(0, canvas.getHeight(), canvas.getWidth(), (float) (canvas.getHeight()*0.8), paint);
        paint.setColor(Color.parseColor("#901290"));
        canvas.drawRect(100, (float) (getHeight()*0.9), 700, (float) (canvas.getHeight()*0.9)-700, paint);
        paint.setColor(Color.parseColor("#435345"));
        canvas.drawRect(400, (float) (getHeight()*0.9), 600, (float) (canvas.getHeight()*0.9)-500, paint);
        canvas.drawRect(120, (float) (getHeight()*0.78), 300, (float) (canvas.getHeight()*0.9)-500, paint);



        paint.setColor(Color.parseColor("#891283"));
        paint.setStrokeWidth(60);
        canvas.drawLine(1100, (float) (getHeight()*0.93), 1100, (float) (getHeight()*0.87), paint);
        paint.setColor(Color.BLUE);
        canvas.drawOval(900, (float) (getHeight()*0.9), 1300, (float) (getHeight()*0.9)-700, paint);
        paint.setColor(Color.parseColor("#901290"));
        Path path = new Path();
        path.moveTo(100, (float) (canvas.getHeight()*0.9)-700);
        path.lineTo(700, (float) (canvas.getHeight()*0.9)-700);
        path.lineTo(400,(float) (canvas.getHeight()*0.9)-1000);
        canvas.drawPath(path, paint);
        paint.setColor(Color.parseColor("#435345"));
        canvas.drawCircle(400, (float) (getHeight()*0.9)-800, 70,  paint);
    }
}
