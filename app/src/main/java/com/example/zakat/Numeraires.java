package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Numeraires extends AppCompatActivity {
    EditText qte;
    SharedPreferences nissab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeraires);
        qte=(EditText)findViewById(R.id.et_num);
    }
    public void back(View view) {
        Intent go=new Intent(Numeraires.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try {

            Intent resl=new Intent(Numeraires.this,res_Numeraires.class);
            Bundle num=new Bundle();

            double q=Double.parseDouble(String.valueOf(qte.getText()));

            nissab =getSharedPreferences("NISSAB", Context.MODE_PRIVATE);
            float n=Float.parseFloat(String.valueOf(nissab.getFloat("monny",705500)));

            if(q< n) {num.putString("nissabnum","لم يبلغ نصاب الزكاة" );}
            if(q>= n) {double i=(q*2.5)/100;num.putString("nissabnum",i+" DA " );}

            resl.putExtras(num);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();
        }
    }
}