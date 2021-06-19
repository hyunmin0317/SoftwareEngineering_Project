package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Coupon extends AppCompatActivity {
    private Button Prebtn_Coupon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);


        final String[] coupon_1 = {"-현재 보유한 쿠폰-","웰컴 고객 10% 할인 쿠폰","..."};


        Spinner spinner = (Spinner) findViewById(R.id.couponspinner);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,coupon_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        Prebtn_Coupon = findViewById(R.id.Prebtn_Coupon);
        Prebtn_Coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coupon.this,Person_Info.class);

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}