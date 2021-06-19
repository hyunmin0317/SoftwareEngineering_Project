package com.example.strangers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sing_Up extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth; // 파이어베이스 인증처리
    private DatabaseReference mDatabaseRef; //실시간 데이터베이스 객체
    private EditText mEtEmail, mEtpws; //회원가입 입력필드
    private Button mBtnRegister; //회원가입 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("Strangers");

        mEtEmail  = findViewById(R.id.et_email);
        mEtpws  = findViewById(R.id.et_pwd);
        mBtnRegister = findViewById(R.id.tv_sign_up);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //회원가입 처리 시작

                String strEmali = mEtEmail.getText().toString(); //회원가입 버튼을 눌렀을 때 이메일에 문자를 strEmail에 할당
                String strPwd = mEtpws.getText().toString();


                //firebase auth 진행
                mFirebaseAuth.createUserWithEmailAndPassword(strEmali, strPwd).addOnCompleteListener(Sing_Up.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task <AuthResult> task) {
                        //회원가입이 이루어졌을 때 처리
                        if(task.isSuccessful()){
                            FirebaseUser firebaseUser = mFirebaseAuth.getCurrentUser();// 현재의 유저를 가져온다~
                            UserAccount account = new UserAccount();
                            account.setEmailId(firebaseUser.getEmail());
                            account.setPassword(strPwd);
                            account.setIdToken(firebaseUser.getUid());

                            //DB 삽입행위
                            mDatabaseRef.child("UserAccount").child(firebaseUser.getUid()).setValue(account);

                            Toast.makeText(Sing_Up.this,"회원가입이 되었습니다. \n 메인화면에서 로그인해주세요",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Sing_Up.this,MainActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(Sing_Up.this,"         회원가입에 실패했습니다. \n 아이디와 비밀번호를 확인해주세요.",Toast.LENGTH_SHORT).show();
                        }

                    }
                });


            }
        });
    }
}