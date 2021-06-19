package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Board_1 extends AppCompatActivity {
    private Button write01, home02,detailbtn1,detailbtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board1);

        write01 = findViewById(R.id.write01);
        write01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Board_1.this,Board_2.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        home02 = findViewById(R.id.home02);
        home02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Board_1.this,MainHomeActivity.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        detailbtn1 = findViewById(R.id.detailbtn1);
        detailbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Board_1.this,Detail_1.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        detailbtn2 = findViewById(R.id.detailbtn2);
        detailbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Board_1.this,Detail_2.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}