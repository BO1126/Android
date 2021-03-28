package com.example.androidbasicpractice4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email_textview, password_textview;
    LinearLayout login_btn, facebook_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email_textview    = findViewById(R.id.email_textview);
        password_textview = findViewById(R.id.password_textview);
        login_btn         = findViewById(R.id.login_btn);
        facebook_btn      = findViewById(R.id.facebook_btn);

        // 1. 값을 가져온다
        // 2. 클릭을 감지한다
        // 3. 1번의 값을 다음 액티비티로 넘긴다



        login_btn.setClickable(true);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email    = email_textview.getText().toString();
                String password = password_textview.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);

                startActivity(intent);

            }
        });


    }
}