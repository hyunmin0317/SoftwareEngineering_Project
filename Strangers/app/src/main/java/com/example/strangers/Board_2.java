package com.example.strangers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Board_2 extends AppCompatActivity {
    private Button previous01,register01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board2);


        previous01 = findViewById(R.id.previous01);
        previous01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Board_2.this,Board_1.class);

                startActivity(intent); //액티비티 이동.
            }
        });

        register01 = findViewById(R.id.register01);
        register01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Board_2.this);
                dlg.setTitle("게시물 작성"); //제목
                dlg.setMessage("게시물을 작성하시겠습니까? " +
                        "무분별한 욕설과 근거 없는 타인에 대한 비난은 경고 없이 삭제될 수 있습니다"); // 메시지

//                버튼 클릭시 동작

                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Board_2.this,"게시물이 등록되었습니다.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Board_2.this,Board_1.class);
                        startActivity(intent); //액티비티 이동.
                    }
                });

                dlg.show();



            }
        });

//        register01  = findViewById(R.id.register01);
//        register01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Board_2.this,Board_1.class);
//                Toast.makeText(Board_2.this,"게시물이 등록되었습니다.",Toast.LENGTH_SHORT).show();
//                startActivity(intent); //액티비티 이동.
//            }
//        });
    }
}