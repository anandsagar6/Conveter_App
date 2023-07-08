package com.example.mydata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Currency_converter extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

      Spinner sp1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        sp1=findViewById(R.id.sp1);





        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Currency_converter, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);

        sp1.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
        if(position ==1 ){
            Intent i=new Intent(Currency_converter.this,INR_DOLLAR.class);
            startActivity(i);
        }else if(position ==2 ){
            Intent i=new Intent(Currency_converter.this,INR_TO_POUND.class);
            startActivity(i);
        }else if(position ==3 ){
            Intent i=new Intent(Currency_converter.this,INR_TO_YUAN.class);
            startActivity(i);
        }else if(position ==4 ){
            Intent i=new Intent(Currency_converter.this,INR_TAKA.class);
            startActivity(i);
        }else if(position ==5 ){
            Intent i=new Intent(Currency_converter.this,INR_PAK.class);
            startActivity(i);
        }
        else if(position ==6 ){
            Intent i=new Intent(Currency_converter.this,INR_SRL.class);
            startActivity(i);
        }
        else if(position ==7 ){
            Intent i=new Intent(Currency_converter.this,INR_NPL.class);
            startActivity(i);
        }else if(position ==8 ){
            Intent i=new Intent(Currency_converter.this,DOLLAR_INR.class);
            startActivity(i);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}