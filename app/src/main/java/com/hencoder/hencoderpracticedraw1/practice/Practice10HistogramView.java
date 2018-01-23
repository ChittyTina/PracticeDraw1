package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice10HistogramView extends View {

    private Paint paint;
    /**
     * 纵轴 起始点 X 坐标
     */
    private float y_startX = 100;
    /**
     * 纵轴 起始点 Y 坐标
     */
    private float y_startY = 20;
    /**
     * 纵轴 终止点 X 坐标
     */
    private float y_stopX = 100;
    /**
     * 纵轴 终止点 Y 坐标
     */
    private float y_stopY = 500;

    /**
     * 横轴 起始点 X 坐标
     */
    private float x_startX = 100;
    /**
     * 横轴 起始点 Y 坐标
     */
    private float x_startY = 500;
    /**
     * 横轴 终止点 X 坐标
     */
    private float x_stopX = 1000;
    /**
     * 横轴 终止点 Y 坐标
     */
    private float x_stopY = 500;

    private float x_offect = 20;
    private float x_rect_width = 100;
    private float y_rect_height = 500;

    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        // 画 坐标轴 x y 轴
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(y_startX, y_startY, y_stopX, y_stopY, paint);
        canvas.drawLine(x_startX, x_startY, x_stopX, x_stopY,paint);

        // 画 柱状图 间隙宽 20 ，矩形宽 100，
        paint.setColor(Color.GREEN);
        canvas.drawRect(120,498,220,500,paint);
        canvas.drawRect(240,484,340,500,paint);
        canvas.drawRect(360,484,460,500,paint);
        canvas.drawRect(480,330,580,500,paint);
        canvas.drawRect(600,180,700,500,paint);
        canvas.drawRect(720,100,820,500,paint);
        canvas.drawRect(840,360,940,500,paint);

        // 画 字
        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("Froyo",130,530,paint);
        canvas.drawText("GB",270,530,paint);
        canvas.drawText("ICS",390,530,paint);
        canvas.drawText("JB",510,530,paint);
        canvas.drawText("KitKat",610,530,paint);
        canvas.drawText("L",760,530,paint);
        canvas.drawText("M",880,530,paint);

    }
}
