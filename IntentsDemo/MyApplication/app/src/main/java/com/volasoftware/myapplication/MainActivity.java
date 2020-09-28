package com.volasoftware.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public final static String NAME = "name";

    private EditText edtName;
    private Button btnHi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        edtName = findViewById(R.id.edt_name);
        btnHi = findViewById(R.id.btn_hi);
        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClicked();
            }
        });
    }

    private void onClicked(){
        String name  = edtName.getText().toString();
        Intent intent = new Intent(this, GreetingsActivity.class);
        intent.putExtra(NAME, name);
        startActivity(intent);
    }
}