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
import android.widget.Toast;

public class Admin5 extends AppCompatActivity {


    private Button Admin_detail01,deletebtnboard1,Admin_detail02,deletebtnboard10;
    private TextView Exitbtn,Homebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin5);


        Admin_detail01 = findViewById(R.id.Admin_detail01);
        Admin_detail01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin5.this,Admin_detail1.class);
                startActivity(intent); //액티비티 이동.
            }
        });
        Admin_detail02 = findViewById(R.id.Admin_detail02);
        Admin_detail02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin5.this,Admin_detail2.class);
                startActivity(intent); //액티비티 이동.
            }
        });

        Button deletebtnboard1 = (Button) findViewById(R.id.deletebtnboard1);
        deletebtnboard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(Admin5.this);
                dlg.setTitle("게시물 삭제 확인창"); //제목
                dlg.setMessage("게시물을 정말로 삭제하시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("삭제하기",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Admin5.this,"선택하신 계정이 정상적으로 삭제되었습니다.",Toast.LENGTH_SHORT).show();


                    }
                });
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dlg.show();



            }
        });
        Button deletebtnboard10 = (Button) findViewById(R.id.deletebtnboard10);
        deletebtnboard10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(Admin5.this);
                dlg.setTitle("게시물 삭제 확인창"); //제목
                dlg.setMessage("게시물을 정말로 삭제하시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("삭제하기",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Admin5.this,"선택하신 계정이 정상적으로 삭제되었습니다.",Toast.LENGTH_SHORT).show();


                    }
                });
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dlg.show();



            }
        });
    }
}