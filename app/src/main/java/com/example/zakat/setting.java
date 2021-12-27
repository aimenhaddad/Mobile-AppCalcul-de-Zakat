package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class setting extends AppCompatActivity {

    SharedPreferences nissab;
    EditText lor,argen,monny;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        try {
            nissab=getSharedPreferences("NISSAB", Context.MODE_PRIVATE);
            rg=(RadioGroup)findViewById(R.id.radioGroup);
            // Button ID
            lor=(EditText)findViewById(R.id.et_Nlor);
            argen=(EditText)findViewById(R.id.et_Nargent);
            monny=(EditText)findViewById(R.id.et_Nmony);
            // affiche valaur nissab de argen et monney
            monny.setText(String.valueOf(nissab.getFloat("monny",705500)));
            argen.setText(String.valueOf(nissab.getFloat("argen",595)));

        }catch(Exception ex){
            Toast.makeText(this, "error block 1"+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }
    // affiche valaur nissab de lor
    public void clickR(View view){
        try {

            int rid=rg.getCheckedRadioButtonId();
            rb=findViewById(rid);
            if(rb.getText().equals("24")){
                lor.setText(String.valueOf(nissab.getFloat("lor_24",85)));
            }
            if(rb.getText().equals("21")){
                lor.setText(String.valueOf(nissab.getFloat("lor_21",97)));
            }
            if(rb.getText().equals("18")){

                lor.setText(String.valueOf(nissab.getFloat("lor_18",113)));
            }
        }catch(Exception es){
            Toast.makeText(this,"selcte crate"+es.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

    // add valaur nissab de outhr
    public void save(View view) {
        try {
            SharedPreferences.Editor myedit=nissab.edit();
            int rid=rg.getCheckedRadioButtonId();
            rb=findViewById(rid);

            if(rb.getText().equals("24")){
                myedit.putFloat("lor_24", Float.parseFloat(String.valueOf(lor.getText())));
            }
            if(rb.getText().equals("21")){
                myedit.putFloat("lor_21", Float.parseFloat(String.valueOf(lor.getText())));
            }
            if(rb.getText().equals("18")){
                myedit.putFloat("lor_18", Float.parseFloat(String.valueOf(lor.getText())));
            }
            myedit.putFloat("argen", Float.parseFloat(String.valueOf(argen.getText())));
            myedit.putFloat("monny", Float.parseFloat(String.valueOf(monny.getText())));
            myedit.commit();

            Intent back=new Intent(setting.this,Home.class);
            startActivity(back);
            finish();
        }catch(Exception ex){
            Toast.makeText(this, "error block 2"+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void back(View view) {
        Intent back=new Intent(setting.this,Home.class);
        startActivity(back);
        finish();
    }
}