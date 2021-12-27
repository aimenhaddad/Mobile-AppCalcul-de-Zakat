package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class res_artificiellea extends AppCompatActivity {
    TextView afch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_artificiellea);

        afch=(TextView) findViewById(R.id.tv_artificiellea);
        Bundle ar=getIntent().getExtras();
        afch.setText(ar.getString("nissabar"));
    }

    public void back(View view) {
        Intent go=new Intent(res_artificiellea.this,Home.class);
        startActivity(go);
        finish();
    }
}