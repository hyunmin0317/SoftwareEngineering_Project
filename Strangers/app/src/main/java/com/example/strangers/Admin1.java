package com.example.strangers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin1 extends AppCompatActivity {
    private TextView un_sign_in, tv_sign_up,textView17,textView15;
    private FirebaseAuth mFirebaseAuth; // 파이어베이스 인증처리
    private DatabaseReference mDatabaseRef; //실시간 데이터베이스 객체
    private EditText mEtEmail, mEtpws; //로그인 입력필드
    private Button logbtn1;
    private ToggleButton user_admin_btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin1);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("Strangers");

        mEtEmail  = findViewById(R.id.et_email);
        mEtpws  = findViewById(R.id.et_pwd);

        Button logbtn1 = findViewById(R.id.logbtn1);
        logbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로그인 요청
                String strEmali = mEtEmail.getText().toString(); //회원가입 버튼을 눌렀을 때 이메일에 문자를 strEmail에 할당
                String strPwd = mEtpws.getText().toString();

                mFirebaseAuth.signInWithEmailAndPassword(strEmali,strPwd).addOnCompleteListener(Admin1.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            // 로그인 성공!
                            Intent intent = new Intent(Admin1.this,Admin2.class);
                            startActivity(intent);
                            finish(); //로그인이 성공하면 현재 액티비티 파과
                        }else{
                            Toast.makeText(Admin1.this,"관리자의 아이디와 비밀번호를 확인해주세요.",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        textView17 = findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin1.this,MainActivity.class);
                startActivity(intent); //액티비티 이동.
            }
        });

        textView15 = findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin1.this,Admin2.class);
                startActivity(intent); //액티비티 이동.
            }
        });

    }
}