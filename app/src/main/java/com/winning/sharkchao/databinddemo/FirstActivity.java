package com.winning.sharkchao.databinddemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.ViewDataBinding;
import android.view.View;
import android.view.ViewStub;

import com.winning.sharkchao.databinddemo.databinding.ActivityFirstBinding;


/**
 * Created by SharkChao on 2018-01-30.
 */

public class FirstActivity extends BaseActivity{
    @Override
    public int providerView() {
        return R.layout.activity_first;
    }

    @Override
    public void initData(ViewDataBinding viewDataBinding) {
        final ActivityFirstBinding binding = (ActivityFirstBinding) viewDataBinding;

        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub viewStub, View view) {
                ViewModel viewModel = new ViewModel();
                binding.setUser(viewModel.getUser());
            }
        });
        binding.viewStub.getViewStub().inflate();
    }
    public static void startFirstActivity(Context context){
        context.startActivity(new Intent(context,FirstActivity.class));
    }
}
