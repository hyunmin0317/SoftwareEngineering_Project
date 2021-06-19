package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Person_Info extends AppCompatActivity {
    private TextView tv_coupon, tv_mileage,logout;
    private FirebaseAuth mFirebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);
        mFirebaseAuth = FirebaseAuth.getInstance(); //초기화


        tv_coupon = findViewById(R.id.tv_coupon);
        tv_coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Person_Info.this,Coupon.class);

                startActivity(intent); //액티비티 이동.
            }
        });

        tv_mileage = findViewById(R.id.tv_mileage);
        tv_mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Person_Info.this,Mileage.class);

                startActivity(intent); //액티비티 이동.
            }
        });

        TextView logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로그아웃 하기
                mFirebaseAuth.signOut();

                Toast.makeText(Person_Info.this,"로그아웃 되었습니다. 감사합니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Person_Info.this, MainActivity.class);
                startActivity(intent);

            }
        });



    }
}