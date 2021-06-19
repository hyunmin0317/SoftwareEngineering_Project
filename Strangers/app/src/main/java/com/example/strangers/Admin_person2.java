package com.example.strangers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Admin_person2 extends AppCompatActivity {
    private TextView tv_exitbtn,tv_homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_person2);


        tv_exitbtn = findViewById(R.id.tv_exitbtn);
        tv_exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.finishAffinity(Admin_person2.this);
                System.exit(0);
            }
        });
        tv_homebtn = findViewById(R.id.tv_homebtn);
        tv_homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_person2.this,MainActivity.class);
                startActivity(intent); //액티비티 이동.
            }
        });
    }
}