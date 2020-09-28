package com.volasoftware.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GreetingsActivity extends AppCompatActivity {

    private TextView txtHello;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        txtHello = findViewById(R.id.txt_hello);
        sayHi();
    }

    private void sayHi(){
        Bundle extras = getIntent().getExtras();
        String name = extras.getString(MainActivity.NAME);
        txtHello.setText(name);
    }
}
