package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Detail_2 extends AppCompatActivity {

    private Button prebtn11, prebtn12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        prebtn11 = findViewById(R.id.prebtn11);
        prebtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail_2.this, Board_1.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        prebtn12 = findViewById(R.id.prebtn12);
        prebtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail_2.this, MainHomeActivity.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}