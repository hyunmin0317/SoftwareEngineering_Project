package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Reserve_4 extends AppCompatActivity {
    private Button prebtn03, reserve100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve4);


        prebtn03 = findViewById(R.id.prebtn03);
        prebtn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_4.this,Reserve_3.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        reserve100 = findViewById(R.id.reserve100);
        reserve100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Reserve_4.this,Payment_1.class);
                startActivity(intent); //액티비티 이동.
            }
        });

    }
}