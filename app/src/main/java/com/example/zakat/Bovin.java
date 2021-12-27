package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bovin extends AppCompatActivity {
    EditText qte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bovin);
        qte=(EditText)findViewById(R.id.et_bovin);

    }

    public void back(View view) {
        Intent go=new Intent(Bovin.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try{
        Intent resl=new Intent(Bovin.this,res_Bovin.class);
        Bundle bo=new Bundle();
        int q=Integer.parseInt(String.valueOf(qte.getText()));
        if(q<30) {bo.putString("nissabBo","لم يبلغ نصاب الزكاة");}
        if(q>=30 && q<=39) { bo.putString("nissabBo","T");}
        if(q>=40 && q<=59) { bo.putString("nissabBo","Mo");}
        if(q>=60 && q<=69) { bo.putString("nissabBo","2T");}
        if(q>=70 && q<=79) { bo.putString("nissabBo","Mo+T");}
        if(q>=80 && q<=89) { bo.putString("nissabBo","2Mo");}
        if(q>=90 && q<=99) { bo.putString("nissabBo","3T");}
        if(q>=100 && q<=119){ bo.putString("nissabBo","Mo+2T");}
        if(q>=120) { int i =q /40; int j=q/30; bo.putString("nissabBo",i+"Mo OU "+j+"T");; }
        resl.putExtras(bo);
        startActivity(resl);
        finish();
    }catch (Exception e){
        Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();

    }}
}