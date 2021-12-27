package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class naturelle extends AppCompatActivity {
    EditText qte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturelle);
        qte=(EditText)findViewById(R.id.et_natural);
    }

    public void back(View view) {
        Intent go=new Intent(naturelle.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try {
            Intent resl=new Intent(naturelle.this,res_naturelle.class);
            Bundle na=new Bundle();
            double q =Double.parseDouble(String.valueOf(qte.getText()));
            if(q<675) {
                na.putString("nissabna","لم يبلغ نصاب الزكاة" );
            }
            if(q>=675){
                double i=0;i=q*0.1;na.putString("nissabna"," % "+i );
            }
            resl.putExtras(na);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();
        }
    }
}