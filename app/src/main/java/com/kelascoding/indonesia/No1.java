package com.kelascoding.indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class No1 extends AppCompatActivity {
    Button btnCek;
    TextView tvHasil;
    TextInputEditText bilangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no1);

        tvHasil = findViewById(R.id.tv_hasil);
        bilangan = findViewById(R.id.edtBilangan);
        btnCek = findViewById(R.id.btn_cek);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input = Integer.parseInt(bilangan.getText().toString());
                if(input % 3 == 0  && input %5 == 0){
                    tvHasil.setText("Hello World");
                } else if( input %5 == 0){
                    tvHasil.setText("World");
                } else if ( input % 3 == 0){
                    tvHasil.setText("Hello");
                }
            }
        });
    }
}