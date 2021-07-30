package com.kelascoding.indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class No3 extends AppCompatActivity {
    Button btnCek;
    TextView tvHasil;
    TextInputEditText waktu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no3);

        tvHasil = findViewById(R.id.tv_hasil);
        waktu = findViewById(R.id.edtWaktu);
        btnCek = findViewById(R.id.btn_cek);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String format;
                String time = waktu.getText().toString();

                // Parsing hours, minutes and seconds in array
                String[] arr = time.split(":");

                // Converting hours into integer
                int hh = Integer.parseInt(arr[0]);

                if (hh > 12) {
                    hh = hh - 12;
                    format = "PM";
                } else if (hh == 00) {
                    hh = 12;
                    format = "AM";
                } else if (hh == 12) {
                    hh = 12;
                    format = "PM";
                } else {
                    format = "AM";
                }

                // Converting hh to String and
                // padding it with 0 on left side
                String hour = String.format("%02d", hh);
                String minute = arr[1];
                String second = arr[2];

                tvHasil.setText(hour + ":" + minute + ":" + second
                        + " " + format );
            }
        });

    }
}

