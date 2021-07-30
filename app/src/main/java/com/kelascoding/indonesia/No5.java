package com.kelascoding.indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class No5 extends AppCompatActivity {
    Button btnCek;
    TextView tvHasil;
    TextInputEditText kata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no5);

        tvHasil = findViewById(R.id.tv_kata);
        kata = findViewById(R.id.edtKata);
        btnCek = findViewById(R.id.btn_cek);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String KataAsli, KataBalik = "";
                KataAsli = kata.getText().toString();

                int p = KataAsli.length();

                for (int i = p - 1; i >= 0; i--) {
                    KataBalik = KataBalik + KataAsli.charAt(i);
                }
                if (KataAsli.equals(KataBalik)){
                    tvHasil.setText("Palindrome");
                } else{
                    tvHasil.setText("Bukan Palindrome");
                }
            }
        });
    }

}