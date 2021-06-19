package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Admin4 extends AppCompatActivity {
    private Button reserveprebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin4);

        reserveprebtn = findViewById(R.id.reserveprebtn);
        reserveprebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin4.this,Admin2.class);
                startActivity(intent); //액티비티 이동.
            }
        });

    }
}