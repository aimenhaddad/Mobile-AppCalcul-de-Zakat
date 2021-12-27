package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_lor extends AppCompatActivity {
 TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_lor);

        afch=(TextView) findViewById(R.id.tv_lor);
        Bundle lor=getIntent().getExtras();
        afch.setText(lor.getString("nissablor"));

    }

    public void back(View view) {
        Intent go=new Intent(res_lor.this,Home.class);
        startActivity(go);
        finish();
    }

}