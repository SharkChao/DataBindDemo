package com.winning.sharkchao.databinddemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by SharkChao on 2018-01-30.
 */

public abstract class BaseActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding viewDataBinding = DataBindingUtil.setContentView(this, providerView());
        initData(viewDataBinding);
    }
    public abstract int providerView();
    public abstract void initData(ViewDataBinding viewDataBinding);
}
