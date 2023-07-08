package com.example.mydata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class INR_TO_POUND extends AppCompatActivity {
    android.widget.Button Button,Button2,Button3;

    ImageView img;
    TextView name;
    TextView editText;
    RadioGroup group;


    double result=0,c,d=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inr_to_pound);


        Button = findViewById(R.id.btn1);

        Button2 = findViewById(R.id.btn2);


        name = findViewById(R.id.name);
        editText = findViewById(R.id.edit);


        Button.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    Toast.makeText(INR_TO_POUND.this, "Empty field not allowed!"
                            ,
                            Toast.LENGTH_SHORT).show();

                } else {


                    c = Float.parseFloat(editText.getText().toString());
                    result = c*0.0095;
                    name.setText(String.valueOf(result) + " £");


                }


            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }

    private void showDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("delete");
        alertDialog.setMessage("Do you want to reset?");

        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        editText.setText("");
                        name.setText("");

                    }
                }).show();
        alertDialog.create();


    }
}