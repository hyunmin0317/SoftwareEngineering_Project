package com.example.strangers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Reserve_detail1_3 extends AppCompatActivity {
    private Button home01,cancel01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_detail13);

        final Button cancel01 = (Button) findViewById(R.id.cancel01);
        cancel01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(Reserve_detail1_3.this);
                dlg.setTitle("예약 취소 확인 창"); //제목
                dlg.setMessage("예약을 정말로 취소하시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Reserve_detail1_3.this,"예약이 정상적으로 취소 되었습니다.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Reserve_detail1_3.this,MainHomeActivity.class);
                        startActivity(intent);

                    }
                });
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dlg.show();



            }
        });


        home01 = findViewById(R.id.home01);
        home01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserve_detail1_3.this,MainHomeActivity.class);
//                Toast.makeText(Reserve_5.this,"",Toast.LENGTH_SHORT).show()

                startActivity(intent); //액티비티 이동.
            }
        });
    }
}