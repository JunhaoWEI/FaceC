package com.example.weijunhao.facec.chart;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.blankj.utilcode.util.TimeUtils;
import com.example.weijunhao.facec.R;
import com.example.weijunhao.facec.base.BaseActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.OnClick;

public class ChatActivity extends BaseActivity {
    public static void start(Context context) {
        Intent starter = new Intent(context, ChatActivity.class);
        context.startActivity(starter);
    }

    @Override
    public int getContentLayoutId() {
        return R.layout.activity_chat;
    }

    @Override
    public void onCreating() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    @BindView(R.id.et_message)
    EditText etMessge;

    @OnClick({
            R.id.btn_send
    })
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send:
                Message message = new Message();
                message.setFrom_uid(mAuth.getUid());
                message.setTo_uid(mAuth.getUid());
                message.setMessage(etMessge.getText().toString());
                message.setTime(TimeUtils.getNowMills());
                mDatabase.child("users").child(mAuth.getUid()).child("message")
                        .push()
                        .setValue(message);
                break;
        }
    }

    private DatabaseReference mDatabase;

}
