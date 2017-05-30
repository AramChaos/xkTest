package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by XK on 2017/5/29.
 */

public class DrawView extends View{
    public float currentX=40;
    public float currentY=50;
    //定义并创建画笔
    Paint p=new Paint();
    public DrawView(Context context)
    {
        super(context);
    }
    public DrawView(Context context, AttributeSet set)
    {
        super(context,set);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        //设置画笔的颜色
        p.setColor(Color.RED);
        //绘制一个小圆
        canvas.drawCircle(currentX,currentY,15,p);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //修改currentX、currentY两个属性
        currentX=event.getX();
        currentY=event.getY();
        //通知当前组件重绘自己
        invalidate();;
        //放回true表明该处理方法已经处理该事件
        return true;
    }
}
