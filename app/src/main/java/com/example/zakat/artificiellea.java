package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class artificiellea extends AppCompatActivity {
    EditText qte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificiellea);
        qte=(EditText)findViewById(R.id.et_Artificiellea);

    }

    public void back(View view) {
        Intent go=new Intent(artificiellea.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try {
            Intent resl=new Intent(artificiellea.this,res_artificiellea.class);
            Bundle ar=new Bundle();
            double q =Double.parseDouble(String.valueOf(qte.getText()));
            if(q<675) {
                ar.putString("nissabar","لم يبلغ نصاب الزكاة" );
            }
            if(q>=675){
                double i=0;i=q*0.05; ar.putString("nissabar"," % "+i);
            }
            resl.putExtras(ar);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();
        }

    }
}