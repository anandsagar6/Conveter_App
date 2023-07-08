package com.example.mydata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class First_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it=new Intent(First_Screen.this, SecondScreen.class);
                startActivity(it);
               finish();
            }
        }, 2000);



    }
}