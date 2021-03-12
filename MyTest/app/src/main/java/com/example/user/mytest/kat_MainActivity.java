package com.example.user.mytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import com.example.user.mytest.R;
import com.example.user.mytest.kat_OverdrawActivity;



public class kat_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overdraw);
    }
    public void onStartClick(View view){
        Intent intent = new Intent(this, kat_OverdrawActivity.class);
        startService(intent);
    }

    public void onEndClick(View view){
        Intent intent = new Intent(this, kat_OverdrawActivity.class);
        stopService(intent);
    }

}