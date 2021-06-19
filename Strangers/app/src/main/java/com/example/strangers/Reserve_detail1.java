package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reserve_detail1 extends AppCompatActivity {
    private Button reserve08,prebtnReserve_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_detail1);

        reserve08 = findViewById(R.id.reserve08);
        reserve08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_detail1.this,Reserve_detail1_2.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        prebtnReserve_3 = findViewById(R.id.prebtnReserve_3);
        prebtnReserve_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_detail1.this,Reserve_2.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}