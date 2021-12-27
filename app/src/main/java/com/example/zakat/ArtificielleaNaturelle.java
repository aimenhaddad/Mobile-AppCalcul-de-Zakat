package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ArtificielleaNaturelle extends AppCompatActivity {
    EditText qte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificiellea_naturelle);
        qte=(EditText)findViewById(R.id.et_AryifiNatur);
    }

    public void back(View view) {
        Intent go=new Intent(ArtificielleaNaturelle.this,Home.class);
        startActivity(go);
        finish();
    }

    public void calcul(View view) {
        try {
            Intent resl=new Intent(ArtificielleaNaturelle.this,res_ArtiNati.class);
            Bundle an=new Bundle();
            double q =Double.parseDouble(String.valueOf(qte.getText()));
            if(q<675) {
                an.putString("nissaban","لم يبلغ نصاب الزكاة" );
            }
            if(q>=675){
                double i=0;i=q*0.075;an.putString("nissaban"," % "+i );
            }
            resl.putExtras(an);
            startActivity(resl);
            finish();
        }catch (Exception e){
            Toast.makeText(this, "يرجى ملئ الخانة", Toast.LENGTH_SHORT).show();
        }
    }
}