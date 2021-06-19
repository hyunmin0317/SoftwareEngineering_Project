package com.example.strangers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payment_1 extends AppCompatActivity {

    private Button cardPay,paymentttt,phonepay, Previous3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment1);


        cardPay = findViewById(R.id.cardPay);
        cardPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Payment_1.this);
                dlg.setTitle("카드 결제 예약 확인 창"); //제목
                dlg.setMessage("카드결제로 예약을 하시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Payment_1.this,"예약이 완료되었습니다. 예약내역을 확인해주세요.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Payment_1.this,Reserve_5.class);
                        startActivity(intent); //액티비티 이동.
                    }
                });
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dlg.show();



            }
        });
        paymentttt = findViewById(R.id.paymentttt);
        paymentttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Payment_1.this);
                dlg.setTitle("무통장 입금 예약 확인 창"); //제목
                dlg.setMessage("무통장 입금으로 예약을 하시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Payment_1.this,"예약이 완료되었습니다. 예약내역을 확인해주세요.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Payment_1.this,Reserve_5.class);
                        startActivity(intent); //액티비티 이동.
                    }
                });
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dlg.show();



            }
        });
        phonepay = findViewById(R.id.phonepay);
        phonepay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Payment_1.this);
                dlg.setTitle("핸드폰 결제 예약 확인 창"); //제목
                dlg.setMessage("핸드폰 결제로 예약을 하시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Payment_1.this,"예약이 완료되었습니다. 예약내역을 확인해주세요.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Payment_1.this,Reserve_5.class);
                        startActivity(intent); //액티비티 이동.
                    }
                });
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dlg.show();



            }
        });

        Previous3 = findViewById(R.id.Previous3);
        Previous3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Payment_1.this);
                dlg.setTitle("결제 중도 취소 확인창"); //제목
                dlg.setMessage("결제를 취소하고 전화면으로 돌아가시겠습니까?"); // 메시지

//                버튼 클릭시 동작
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //토스트 메시지
                        Toast.makeText(Payment_1.this,"결제가 취소되었습니다. 감사합니다.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Payment_1.this,Reserve_4.class);
                        startActivity(intent); //액티비티 이동.
                    }
                });

                //취소를 누르면 그대로 다시 결제창으로~
                dlg.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dlg.show();




            }
        });

    }
}