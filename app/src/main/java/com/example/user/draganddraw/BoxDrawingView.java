package com.example.user.draganddraw;


import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by guang on 2016/9/16.
 */
public class BoxDrawingView extends View {
    private static final String TAG = "BoxDrawingView";

    //Used when creating the view in code
    public BoxDrawingView(Context context) {
        this(context, null);
    }

    //
    public BoxDrawingView(Context context, AttributeSet attr) {
        super(context,attr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        PointF current = new PointF(event.getX(),event.getY());
        String action = "";

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "UP";
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "CANCEL";
                break;
        }

        Log.i(TAG, action + " at x=" + current.x + ", y=" + current.y);

        return true;
    }
}
