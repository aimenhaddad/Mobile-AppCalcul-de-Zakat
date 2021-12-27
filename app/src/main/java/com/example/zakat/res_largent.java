package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_largent extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_largent);

        afch=(TextView) findViewById(R.id.tv_largen);
        Bundle arg=getIntent().getExtras();
        afch.setText(arg.getString("nissabarg"));
}

    public void back(View view) {
        Intent go=new Intent(res_largent.this,Home.class);
        startActivity(go);
        finish();
    }
}