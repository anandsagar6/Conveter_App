package com.example.mydata;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SecondScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
 Spinner spinner;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
      spinner=findViewById(R.id.sp);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.converter, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        ConstraintLayout constraintLayout=findViewById(R.id.sec);

        AnimationDrawable animationdrawable= (AnimationDrawable) constraintLayout.getBackground();
        animationdrawable.setEnterFadeDuration(2500);
        animationdrawable.setExitFadeDuration(5000);
        animationdrawable.start();



    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
        if(position==1){
            Intent i=new Intent(SecondScreen.this, MainActivity.class);
            startActivity(i);
        }
        else  if(position==2){
            Intent i=new Intent(SecondScreen.this,Currency_converter.class);
            startActivity(i);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


