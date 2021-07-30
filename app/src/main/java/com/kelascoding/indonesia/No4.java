package com.kelascoding.indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class No4 extends AppCompatActivity {
    Button btnCek;
    TextView tvHasil;
    TextInputEditText huruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no4);

        tvHasil = findViewById(R.id.tv_kata_balik);
        huruf = findViewById(R.id.edtHuruf);
        btnCek = findViewById(R.id.btn_cek);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer katabalik;
                katabalik = new StringBuffer(huruf.getText().toString());
                tvHasil.setText(katabalik.reverse());
            }
        });
    }
}