package com.kelascoding.indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button no1, no2, no3, no4, no5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        no1 = findViewById(R.id.btn_no1);
        no2 = findViewById(R.id.btn_no2);
        no3 = findViewById(R.id.btn_no3);
        no4 = findViewById(R.id.btn_no4);
        no5 = findViewById(R.id.btn_no5);

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, No1.class);
                startActivity(i);
            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, No2.class);
                startActivity(i);
            }
        });

        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, No3.class);
                startActivity(i);
            }
        });

        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, No4.class);
                startActivity(i);
            }
        });

        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, No5.class);
                startActivity(i);
            }
        });
    }
}