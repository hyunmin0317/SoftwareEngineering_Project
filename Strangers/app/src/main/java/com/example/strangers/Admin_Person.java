package com.example.strangers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Admin_Person extends AppCompatActivity {

    private TextView tv_exitbtn, tv_homebtn;
    private Button PersonDeletebtn,PersonDeletebtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_person);

        tv_exitbtn = findViewById(R.id.tv_exitbtn);
        tv_exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.finishAffinity(Admin_Person.this);
                System.exit(0);
            }
        });
        tv_homebtn = findViewById(R.id.tv_homebtn);
        tv_homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Person.this,MainActivity.class);
                startActivity(intent); //액티비티 이동.
            }
        });
        PersonDeletebtn = findViewById(R.id.PersonDeletebtn);
        PersonDeletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Admin_Person.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("회원정보 삭제 확인창");
                builder.setMessage("회원 정보를 정말로 삭제하시겠습니까? 삭제한 정보는 다시 복구할 수 없습니다.");
                builder.setPositiveButton(Html.fromHtml("<font color = '#AAAAAA'>Delete</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"회원정보가 삭제되었습니다.",Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNegativeButton(Html.fromHtml("<font color = '#AAAAAA'>Cancle</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
        PersonDeletebtn4 = findViewById(R.id.PersonDeletebtn4);
        PersonDeletebtn4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Admin_Person.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("회원정보 삭제 확인창");
                builder.setMessage("회원 정보를 정말로 삭제하시겠습니까? 삭제한 정보는 다시 복구할 수 없습니다.");
                builder.setPositiveButton(Html.fromHtml("<font color = '#AAAAAA'>Delete</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"회원정보가 삭제되었습니다.",Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(Admin_Person.this,Admin_person2.class);
                        startActivity(intent); //액티비티 이동.
                    }
                });
                builder.setNegativeButton(Html.fromHtml("<font color = '#AAAAAA'>Cancle</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });


    }
}