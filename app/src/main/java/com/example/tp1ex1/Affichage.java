package com.example.tp1ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Affichage extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
        res =  (TextView) findViewById(R.id.Res);
        Intent in = getIntent();
        //String ch2 = in.getStringExtra("ch1");
        Toast.makeText(this, in.getStringExtra("ch1"), Toast.LENGTH_SHORT).show();
        res.setText(in.getStringExtra("ch1"));

    }
}