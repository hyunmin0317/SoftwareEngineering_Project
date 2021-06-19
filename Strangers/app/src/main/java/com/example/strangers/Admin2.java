package com.example.strangers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Admin2 extends AppCompatActivity {
    private Button admin_person_control, admin_deposit,admin_reserve,admin_board;
    private TextView Exitbtn,Homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin2);

        //회원관리하기 Admin4
        admin_person_control = findViewById(R.id.admin_person_control);
        admin_person_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin2.this, Admin_Person.class);

                startActivity(intent); //액티비티 이동.
            }
        });

        //입금내역확인
        admin_deposit = findViewById(R.id.admin_deposit);
        admin_deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin2.this, Admin3.class);
                startActivity(intent); //액티비티 이동.
            }
        });


        //관리자4예약 확인
        admin_reserve = findViewById(R.id.admin_reserve);
        admin_reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin2.this,Admin4.class);
                startActivity(intent); //액티비티 이동.
            }
        });

        //관리자3은 게시판관리 Admin3
        admin_board = findViewById(R.id.admin_board);
        admin_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin2.this,Admin5.class);
                startActivity(intent); //액티비티 이동.
            }
        });


        //MainActivity로 이동
        Homebtn = findViewById(R.id.Homebtn);
        Homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin2.this,MainActivity.class);
                startActivity(intent); //액티비티 이동.
            }
        });

        //어플을 아예 종료하기 위함
        Exitbtn = (TextView) findViewById(R.id.Exitbtn);
        Exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Admin2.this);
                builder.setMessage("어플을 종료하시겠습니까?");
                builder.setTitle("어플 종료 확인창")
                        .setCancelable(false)
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
                                ActivityCompat.finishAffinity(Admin2.this);
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("아니요", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("종료 알림창");
                alert.show();

            }
        });



    }
}