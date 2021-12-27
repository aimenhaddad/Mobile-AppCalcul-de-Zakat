package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_Numeraires extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_numeraires);

        afch=(TextView) findViewById(R.id.tv_numeraires);
        Bundle num=getIntent().getExtras();
        afch.setText(num.getString("nissabnum"));
    }

    public void back(View view) {
        Intent go=new Intent(res_Numeraires.this,Home.class);
        startActivity(go);
        finish();
    }
}