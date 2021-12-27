package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_Ovons extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_ovons);
        afch=(TextView) findViewById(R.id.tv_Ovins);
        Bundle O=getIntent().getExtras();
        afch.setText(O.getString("nissabo"));
    }

    public void back(View view) {
        Intent go=new Intent(res_Ovons.this,Home.class);
        startActivity(go);
        finish();
    }
}