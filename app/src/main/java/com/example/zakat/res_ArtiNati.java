package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_ArtiNati extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_arti_nati);

        afch=(TextView) findViewById(R.id.tv_ArtiNati);
        Bundle na=getIntent().getExtras();
        afch.setText(na.getString("nissaban"));

    }

    public void back(View view) {
        Intent go=new Intent(res_ArtiNati.this,Home.class);
        startActivity(go);
        finish();
    }
}