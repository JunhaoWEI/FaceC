package com.example.weijunhao.facec.base;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by weijunhao on 2018/3/17.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
