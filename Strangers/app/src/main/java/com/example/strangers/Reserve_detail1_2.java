package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reserve_detail1_2 extends AppCompatActivity {
    private Button reserve100,prebtn03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_detail12);

        reserve100 = findViewById(R.id.reserve100);
        reserve100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Reserve_detail1_2.this,Payment_2.class);
                startActivity(intent); //액티비티 이동.
            }
        });
        prebtn03 = findViewById(R.id.prebtn03);
        prebtn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_detail1_2.this,Reserve_detail1.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}