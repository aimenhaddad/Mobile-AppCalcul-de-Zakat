package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_Chamaux extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_chamaux);
        afch=(TextView) findViewById(R.id.tv_chamaux);
        Bundle b=getIntent().getExtras();
        afch.setText(b.getString("nissab"));
    }

    public void back(View view) {
        Intent go=new Intent(res_Chamaux.this,Home.class);
        startActivity(go);
        finish();
    }
}