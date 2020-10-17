package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.retrofit.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnGetQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onGetQuoteClicked();
            }
        });
    }

    private void onGetQuoteClicked() {
        Api.getInstance().getRandomQuote(new Api.ApiListener() {
            @Override
            public void onQuoteReceived(String quote) {
                binding.txtQuote.setText(quote);
            }

            @Override
            public void onFailure() {
                Toast.makeText(MainActivity.this, "Something happened", Toast.LENGTH_LONG).show();
            }
        });
    }
}