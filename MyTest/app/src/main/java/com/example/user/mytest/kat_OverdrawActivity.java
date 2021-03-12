package com.example.user.mytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.graphics.PixelFormat;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;


public class kat_OverdrawActivity extends Service{

    private WindowManager windowManager;
    private View view;

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
    @Override
    public void onCreate(){
        super.onCreate();

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.overdraw_button,null);

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_ACCESSIBILITY_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT

        );
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        windowManager.addView(view, layoutParams);

    }

    @Override
    public void onDestroy() {
        if (windowManager != null) {
            if (view != null) {
                windowManager.removeView(view);
            }
        }
        super.onDestroy();
    }
}
