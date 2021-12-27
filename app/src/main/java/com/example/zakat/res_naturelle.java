package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_naturelle extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_naturelle);
        afch=(TextView) findViewById(R.id.tv_naturalle);
        Bundle na=getIntent().getExtras();
        afch.setText(na.getString("nissabna"));
    }

    public void back(View view) {
        Intent go=new Intent(res_naturelle.this,Home.class);
        startActivity(go);
        finish();
    }
}