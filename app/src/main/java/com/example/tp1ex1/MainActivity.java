package com.example.tp1ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c, java, cobol;
    Button btn1;
    String ch,ch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c=findViewById(R.id.c);
        java=findViewById(R.id.java);
        cobol=findViewById(R.id.cobol);
        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ch="";
                if(c.isChecked()){
                    ch = "c";
                }
                if(java.isChecked()){
                    ch = ch + "java";
                }
                if(cobol.isChecked()){
                    ch = ch + "cobol";
                }
                Toast.makeText(MainActivity.this, ch, Toast.LENGTH_SHORT).show();
                Intent in = new Intent(MainActivity.this,Affichage.class);
                in.putExtra("ch1",ch);
                startActivity(in);
            }
        });

    }
}