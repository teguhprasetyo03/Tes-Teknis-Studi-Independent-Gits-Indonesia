package com.kelascoding.indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class No2 extends AppCompatActivity {

    Button btnValidate;
    TextInputEditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no2);

        btnValidate = findViewById(R.id.btn_validate);
        email = findViewById(R.id.edtEmail);

        btnValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmailAddress(email);
            }
        });
    }

    private boolean validateEmailAddress(TextInputEditText email) {
        String mail = email.getText().toString().trim();

        String emailPattern = "[a-zA-Z0-9._-] + @[a-z]+\\.+[a-z]+";

        if (mail.matches(emailPattern)) {
            Toast.makeText(No2.this, "Valid Email address", Toast.LENGTH_SHORT).show();
            return true;
        }else if ((email.length() > 20) && mail.matches("@")) {
            Toast.makeText(No2.this, "Email Tidak Boleh Lebih Dari 20 Karakter", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
            return false;
        }


    }
}