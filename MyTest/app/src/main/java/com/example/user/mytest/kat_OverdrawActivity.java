package com.example.user.mytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class kat_OverdrawActivity extends Service{
    @Override
    public IBinder onBind(Intent arg0){
        return null;
    }
    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }

}
