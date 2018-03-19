package com.example.weijunhao.facec;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.weijunhao.facec.R;
import com.example.weijunhao.facec.base.BaseActivity;

public class SignupActivity extends BaseActivity {
    public static void start(Context context) {
        Intent starter = new Intent(context, SignupActivity.class);
        context.startActivity(starter);
    }

    @Override
    public int getContentLayoutId() {
        return R.layout.activity_signup;
    }

    @Override
    public void onCreating() {

    }
}
