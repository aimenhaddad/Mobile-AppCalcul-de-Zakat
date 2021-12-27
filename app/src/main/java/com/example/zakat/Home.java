package com.example.zakat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void setting(View view) {
        Intent go=new Intent(Home.this,setting.class);
        startActivity(go);
        finish();
    }
    public void about(View view) {
        Intent go=new Intent(Home.this,about.class);
        startActivity(go);
        finish();
    }
    public void click(View view) {
        Intent go=new Intent(Home.this,chameaux.class);
        startActivity(go);
        finish();
    }


    public void clicko(View view) {
        Intent go=new Intent(Home.this,Ovins.class);
        startActivity(go);
        finish();
    }

    public void clickb(View view) {
        Intent go=new Intent(Home.this,Bovin.class);
        startActivity(go);
        finish();
    }

    public void clickan(View view) {
        Intent go=new Intent(Home.this,ArtificielleaNaturelle.class);
        startActivity(go);
        finish();
    }

    public void clicka(View view) {
        Intent go=new Intent(Home.this,artificiellea.class);
        startActivity(go);
        finish();
    }

    public void clickn(View view) {
        Intent go=new Intent(Home.this,naturelle.class);
        startActivity(go);
        finish();
    }

    public void clickMoney(View view) {
        Intent go=new Intent(Home.this,Numeraires.class);
        startActivity(go);
        finish();
    }

    public void clickSelver(View view) {
        Intent go=new Intent(Home.this,largent.class);
        startActivity(go);
        finish();
    }

    public void clickLor(View view) {
        Intent go=new Intent(Home.this,Lor.class);
        startActivity(go);
        finish();
    }
}