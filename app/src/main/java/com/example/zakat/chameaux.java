package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class chameaux extends AppCompatActivity {
    EditText qte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chameaux);
        qte=(EditText)findViewById(R.id.et_chamaux);

    }


        public void back(View view) {
            Intent go=new Intent(chameaux.this,Home.class);
            startActivity(go);
            finish();
        }
    int  q;
    public void calcul(View view) {
       try {
        Intent resl=new Intent(chameaux.this,res_Chamaux.class);
        Bundle b=new Bundle();

         q=Integer.parseInt(String.valueOf(qte.getText()));

        if(q<5) {b.putString("nissab","لم يبلغ نصاب الزكاة");}

        if(q>=5 &&q<=24) {int i =q/5; b.putString("nissab",i+"C");}
        if(q>=25 && q<=35) { b.putString("nissab","M");}
        if(q>=46 && q<=60) { b.putString("nissab","H");}
        if(q>=36 && q<=45) { b.putString("nissab","L");}
        if(q>=61 && q<=75) { b.putString("nissab","J");}
        if(q>=76 && q<=90) { b.putString("nissab","2L");}
        if(q>=91 && q<=120){ b.putString("nissab","2H");}
        if(q>120) {
            int h =q/50;
            int res =q %50;
            int l = res/40;
            if(h==0) {b.putString("nissab",l+"L"); }
            else{if(l==0) {b.putString("nissab",h+"H"); }
            else{ b.putString("nissab",h+"H + "+l+" L");}
            }}
        resl.putExtras(b);
        startActivity(resl);
        finish();
    }catch (Exception e){
        Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();

    }
    }
}