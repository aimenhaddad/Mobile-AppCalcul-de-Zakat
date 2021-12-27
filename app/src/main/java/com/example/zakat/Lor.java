package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Lor extends AppCompatActivity {
    EditText qte;
    RadioButton rb;
    RadioGroup rg;
    SharedPreferences nissab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lor);
        rg = findViewById(R.id.radioGroup);
        qte=(EditText)findViewById(R.id.et_lor);
    }

    public void back(View view) {
        Intent go=new Intent(Lor.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try {
            Intent resl=new Intent(Lor.this,res_lor.class);
            Bundle lor=new Bundle();
            double q=Double.parseDouble(String.valueOf(qte.getText()));
            nissab =getSharedPreferences("NISSAB", Context.MODE_PRIVATE);

            int radioId = rg.getCheckedRadioButtonId();
            rb = findViewById(radioId);

            if(rb.getText().equals("24قراط"))
            {
                float c24=Float.parseFloat(String.valueOf(nissab.getFloat("lor_24",85)));

                if(q<c24) { lor.putString("nissablor","لم يبلغ نصاب الزكاة" );}
                if(q>=c24){double i=(q*2.5)/100;lor.putString("nissablor"," غرام "+i);}
            }
            if(rb.getText().equals("21قراط"))
            {
                float c21=Float.parseFloat(String.valueOf(nissab.getFloat("lor_21",97)));

                if(q<c21) {lor.putString("nissablor","لم يبلغ نصاب الزكاة" );}
                if(q>=c21){double i=(q*2.5)/100; lor.putString("nissablor"," غرام "+i);;
                }}
            if(rb.getText().equals("18قراط"))
            {
                float c18=Float.parseFloat(String.valueOf(nissab.getFloat("lor_18",113)));

                if(q<c18) {lor.putString("nissablor","لم يبلغ نصاب الزكاة" );}
                if(q>=c18){ double i=(q*2.5)/100;lor.putString("nissablor"," غرام "+i); }
            }
            resl.putExtras(lor);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();
        }
    }
}