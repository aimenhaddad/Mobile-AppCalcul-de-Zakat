package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ovins extends AppCompatActivity {
    EditText qte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovins);
        qte=(EditText)findViewById(R.id.et_ovin);

    }

    public void back(View view) {
        Intent go=new Intent(Ovins.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {


        try {
            Intent resl=new Intent(Ovins.this,res_Ovons.class);
            Bundle o=new Bundle();
            int q=Integer.parseInt(String.valueOf(qte.getText()));

            if(q<40) {o.putString("nissabo","لم يبلغ نصاب الزكاة");}
            if(q>=40 && q<=120) {o.putString("nissabo","1C"); }
            if(q>=121 && q<=200) {o.putString("nissabo","2C"); }
            if(q>=201 && q<=399) {o.putString("nissabo","3C"); }
            if(q>399) { int i =q/100;o.putString("nissabo",i+"C"); }
            resl.putExtras(o);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();
        }



    }
}