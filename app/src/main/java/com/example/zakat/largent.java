package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class largent extends AppCompatActivity {
    EditText qte;
    SharedPreferences nissab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_largent);
        qte=(EditText)findViewById(R.id.et_argent);
    }

    public void back(View view) {
        Intent go=new Intent(largent.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try {
            Intent resl=new Intent(largent.this,res_largent.class);
            Bundle arg=new Bundle();

            nissab =getSharedPreferences("NISSAB", Context.MODE_PRIVATE);
            float n=Float.parseFloat(String.valueOf(nissab.getFloat("argen",595)));
            double q;
            q =Double.parseDouble(String.valueOf(qte.getText()));
            if(q<n) { arg.putString("nissabarg","لم يبلغ نصاب الزكاة" ); }
            if(q>=n){ double i=(q*2.5)/100;arg.putString("nissabarg"," غرام "+i ); }
            resl.putExtras(arg);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة" , Toast.LENGTH_SHORT).show();
        }
    }
}