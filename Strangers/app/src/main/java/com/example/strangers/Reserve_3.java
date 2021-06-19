package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reserve_3 extends AppCompatActivity {
    private Button reserve01, prebtnReserve_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve3);


        reserve01 = findViewById(R.id.reserve08);
        reserve01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_3.this,Reserve_4.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        prebtnReserve_3 = findViewById(R.id.prebtnReserve_3);
        prebtnReserve_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_3.this,Reserve_2.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}