package com.wh.mvplayer.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wh.mvplayer.R;

import butterknife.ButterKnife;

/*
 * @创建者 Administrator
 * @创建时间 2017/10/21 0021 22:44
 * @描述 ${TODO}
 *
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 * 
 */

public abstract class BaseActivity extends AppCompatActivity {

    private int mLayoutId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        //将这行代码放在BaseActivity，放在继承的activity会报错
        ButterKnife.bind(this);
        initView();
        initDate();
    }

    //添加布局
    public abstract int getLayoutId();

    //初始化控件
    protected abstract void initView();

    //初始化数据
    protected abstract void initDate();

    //封装activity跳转
    public void startActivity(Class clazz, boolean isFinish) {
        startActivity(new Intent(this, clazz));
        if (isFinish) {
            finish();
        }
    }


}
