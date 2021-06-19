package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Mileage extends AppCompatActivity {
    private Button Prebtn_Mileage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mileage);

        final String[] mileage_1 = {"-현재 보유한 마일리지-","웰컴 고객 3000원 마일리지","..."};


        Spinner spinner = (Spinner) findViewById(R.id.mileagespinner);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,mileage_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Prebtn_Mileage = findViewById(R.id.Prebtn_Coupon);
        Prebtn_Mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mileage.this,Person_Info.class);

                startActivity(intent); //액티비티 이동.
            }
        });

    }
}