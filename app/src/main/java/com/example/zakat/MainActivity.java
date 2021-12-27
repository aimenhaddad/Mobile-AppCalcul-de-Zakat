package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
Timer t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= new Timer();
    t.schedule(new TimerTask() {
        @Override
        public void run() {
            Intent start=new Intent(MainActivity.this,Home.class);
            startActivity(start);
            finish();
        }
    },1500);
    }
}