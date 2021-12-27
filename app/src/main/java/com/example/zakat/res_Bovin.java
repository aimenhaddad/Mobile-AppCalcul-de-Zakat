package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_Bovin extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_bovin);
        afch=(TextView) findViewById(R.id.tv_bovin);
        Bundle O=getIntent().getExtras();
        afch.setText(O.getString("nissabBo"));
    }
    public void back(View view) {
        Intent go=new Intent(res_Bovin.this,Home.class);
        startActivity(go);
        finish();
    }
}