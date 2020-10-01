package com.vsc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    public static final String ARG_EMAIL = "arg_email";
    public static final String ARG_CORRECT_ANSWERS = "arg_total_correct_answers";

    private TextView welcome;
    private Button btnYes;
    private Button btnNo;

    private String email;
    private int totalCorrectAnswers;

    public WelcomeActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getArgs();
        getViews();
        setWelcomeText();
        setClickListeners();
    }

    private void getArgs() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.getString(ARG_EMAIL) != null) {
                email = extras.getString(ARG_EMAIL);
            }

            totalCorrectAnswers = extras.getInt(ARG_CORRECT_ANSWERS);
        }
    }

    private void getViews() {
        welcome = findViewById(R.id.txtWelcome);
        btnYes = findViewById(R.id.btnYes);
        btnNo = findViewById(R.id.btnNo);
    }

    private void setWelcomeText() {
        welcome.setText(getString(R.string.welcome_template, email));
    }

    private void setClickListeners() {
        // Грешен отговор
        btnYes.setOnClickListener(view -> sendToNextQuestion());

        // Верен отговор
        btnNo.setOnClickListener(view -> {
            totalCorrectAnswers++;
            sendToNextQuestion();
        });
    }

    private void sendToNextQuestion() {
        Log.e("QQQQQQ", "" + totalCorrectAnswers);
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra(ARG_CORRECT_ANSWERS, totalCorrectAnswers);
        startActivity(intent);
    }
}
