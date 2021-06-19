package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Reserve_1 extends AppCompatActivity {
    private Button solid_button2,prebtn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve1);


        //Next 버튼을 눌렀을 때
        solid_button2 = findViewById(R.id.solid_button2);
        solid_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_1.this,Reserve_2.class);

                startActivity(intent); //액티비티 이동.
            }
        });
        //previous 버튼을 눌렀을 때
        prebtn1 = findViewById(R.id.prebtn1);
        prebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_1.this,MainHomeActivity.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}