package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reserve_2 extends AppCompatActivity {


    private Button prebtn2,region,region1,region2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve2);



        prebtn2 = findViewById(R.id.prebtnReserve_3);
        prebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_2.this,Reserve_1.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        region = findViewById(R.id.region);
        region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_2.this,Reserve_3.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        region1 = findViewById(R.id.region1);
        region1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_2.this,Reserve_3.class);

                startActivity(intent); //액티비티 이동
            }
        });

        region2 = findViewById(R.id.region2);
        region2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_2.this,Reserve_detail1.class);

                startActivity(intent); //액티비티 이동
            }
        });

    }
}