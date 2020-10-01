package com.vsc.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String VALID_EMAIL = "gosho@vratsasoftware.com";
    private static final String VALID_PASSWORD = "GoshkoLoshko123";

    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();
        setOnClickListeners();
    }

    private void getViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void setOnClickListeners() {
        btnLogin.setOnClickListener(view -> {
            String email = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();
            if (isEmailValid(email) && isPasswordValid(password)) {
                sendToWelcomeScreen(email);
            }
        });
    }

    private boolean isEmailValid(String email) {
        return VALID_EMAIL.equals(email);
    }

    private boolean isPasswordValid(String password) {
        return VALID_PASSWORD.equals(password);
    }

    private void sendToWelcomeScreen(String email) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra(WelcomeActivity.ARG_EMAIL, email);

        startActivity(intent);
    }
}
