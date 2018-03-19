package com.example.weijunhao.facec;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.weijunhao.facec.base.BaseActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, LoginActivity.class);
        context.startActivity(starter);
    }

    private FirebaseAuth mAuth;

    @Override
    public int getContentLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onCreating() {
        mAuth = FirebaseAuth.getInstance();
    }

    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_password)
    EditText etPassword;


    @OnClick({
            R.id.btn_signup,
            R.id.btn_login
    })
    void onCLick(View view) {
        switch (view.getId()) {
            case R.id.btn_signup:
                SignupActivity.start(mContext);
                break;
            case R.id.btn_login:
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    MainActivity.start(mContext);
                                } else {
                                    Toast.makeText(mContext, "密码错误", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                break;
        }
    }

}
