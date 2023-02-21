package com.example.myapplication;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyHome extends View {
    public MyHome(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        DrawRace(canvas);
        DrawSun(canvas);
        //DrawHome(canvas);
    }
    //Функция для отрисовки лужайки
    public void DrawRace(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.rgb(71,167,106));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);
        int Rectangle_x_0 = 0;
        int Rectangle_y_0 = 3000;
        int Rectangle_x_1 = 1500;
        int Rectangle_y_1 = 1000;
        canvas.drawRect(Rectangle_x_0,Rectangle_y_0,Rectangle_x_1,Rectangle_y_1,paint);
        DrawHome(canvas);
    }
    //Функция для отрисовки неба
    public void DrawSun(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.rgb( 30,144,255));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);

        int Rectangle_x_0 = 0;
        int Rectangle_y_0 = 0;
        int Rectangle_x_1 = 1500;
        int Rectangle_y_1 = 1000;
        canvas.drawRect(Rectangle_x_0,Rectangle_y_0,Rectangle_x_1,Rectangle_y_1,paint);
        DrawHome(canvas);

        paint.setColor(Color.rgb( 255,207,72));
        int Circle_x_0 = 100;
        int Circle_y_0 = 100;
        int Circle_radius = 150;
        canvas.drawCircle(Circle_x_0,Circle_y_0,Circle_radius,paint);

        float Rotate_center_x = 100;
        float Rotate_center_y = 100;
        float Rotate_angle = -10;
        for (int i = 200; Rotate_angle<i;Rotate_angle+=5)
        {
            canvas.rotate(Rotate_angle,Rotate_center_x,Rotate_center_y);
            int Drawline_x_0 = 100;
            int Drawline_y_0 = 100;
            int Drawline_x_1 = 400;
            int Drawline_y_1 = 50;
            canvas.drawLine(Drawline_x_0,Drawline_y_0,Drawline_x_1,Drawline_y_1,paint);
            Drawline_x_0 += 30;
            Drawline_y_0 += 30;
            Drawline_x_1 -= 20;
            Drawline_y_1 += 40;
            canvas.drawLine(Drawline_x_0,Drawline_y_0,Drawline_x_1,Drawline_y_1,paint);
        }
    }
    //Функция для отрисовки Домика
    public void DrawHome(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.rgb(204,63,84));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);
        int Rectangle_x_0 = 200;
        int Rectangle_y_0 = 700;
        int Rectangle_x_1 = 1000;
        int Rectangle_y_1 = 1400;
        canvas.drawRect(Rectangle_x_0, Rectangle_y_0, Rectangle_x_1, Rectangle_y_1,paint);

        Path path = new Path();
        path.moveTo(Rectangle_x_0,Rectangle_y_0);
        path.lineTo(Rectangle_x_0, Rectangle_y_0 );
        path.lineTo( Rectangle_x_0 + 370,  Rectangle_y_0 - 350);
        path.lineTo(Rectangle_x_1, Rectangle_y_0);
        canvas.drawPath(path,paint);

        paint.setColor(Color.WHITE);
        canvas.drawRect(Rectangle_x_0+450, Rectangle_y_0+200, Rectangle_x_1-50, Rectangle_y_1,paint);
        canvas.drawRect(Rectangle_x_0+100, Rectangle_y_0+100, Rectangle_x_1-450, Rectangle_y_1-350,paint);
        canvas.drawCircle(580,550,120,paint);

        // Делаем рамочку для объема домика

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        path.moveTo(Rectangle_x_0,Rectangle_y_0);
        path.lineTo(Rectangle_x_0, Rectangle_y_0 );
        path.lineTo( Rectangle_x_0 + 370,  Rectangle_y_0 - 350);
        path.lineTo(Rectangle_x_1, Rectangle_y_0);
        canvas.drawPath(path,paint);
        canvas.drawRect(Rectangle_x_0, Rectangle_y_0, Rectangle_x_1, Rectangle_y_1,paint);
        canvas.drawRect(Rectangle_x_0+450, Rectangle_y_0+200, Rectangle_x_1-50, Rectangle_y_1,paint);
        canvas.drawRect(Rectangle_x_0+100, Rectangle_y_0+100, Rectangle_x_1-450, Rectangle_y_1-350,paint);
        canvas.drawCircle(580,550,120,paint);
        Shtrich(canvas);
    }
    //Функция для отрисовки штрихов в окне и на двери домика
    public void Shtrich(Canvas canvas){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setColor(Color.BLACK);
        Path path = new Path();

        int Strich_x_0 = 650;
        int Strich_y_0 = 900;
        int Strich_x_1 = 950;
        int Strich_y_1 = 1400;
        int line = 0;

        for(int i = 6; line<i;line++){
            path.moveTo(Strich_x_0, Strich_y_0);
            path.lineTo(Strich_x_1, Strich_y_1);
            Strich_x_0 +=50;
            Strich_y_1 -=85;
            canvas.drawPath(path, paint);
        }
        line = 0;
        Strich_x_0 = 650;
        Strich_y_1 = 1400;

        for(int i = 6; line<i;line++){
            path.moveTo(Strich_x_0, Strich_y_0);
            path.lineTo(Strich_x_1, Strich_y_1);
            Strich_y_0 +=75;
            Strich_x_1 -=50;
            canvas.drawPath(path, paint);
            }

        line = 0;
        Strich_x_0 = 300;
        Strich_y_0 = 800;
        Strich_y_1 = 1050;

        for(int i = 6; line<i;line++){
            path.moveTo(Strich_x_0, Strich_y_0);
            path.lineTo(Strich_x_0, Strich_y_1);
            Strich_x_0 +=50;
            canvas.drawPath(path, paint);
        }
        line = 0;
        Strich_x_0 = 300;
        Strich_x_1 = 550;
        for(int i = 6; line<i;line++){
            path.moveTo(Strich_x_0, Strich_y_0);
            path.lineTo(Strich_x_1, Strich_y_0);
            Strich_y_0 +=50;
            canvas.drawPath(path, paint);
        }

        int x = 580;
        int y = 550;
        int radius = 120;
        int angle = 0;

        while (angle<=100){
            path.moveTo((float) (x + radius * cos(angle)), (float) (y + radius * sin(angle)));
            path.lineTo((float) (x - radius * cos(angle)), (float) (y - radius * sin(angle)));
            angle+=10;
        }
        path.close();
            canvas.drawPath(path, paint);
    }

}
