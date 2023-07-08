package com.example.mydata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        btn=findViewById(R.id.splash_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SplashScreen.this, "Lets go", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(SplashScreen.this,First_Screen.class);
                startActivity(i);
                finish();

            }
        });

    }
}