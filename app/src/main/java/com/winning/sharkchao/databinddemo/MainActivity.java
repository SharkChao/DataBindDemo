package com.winning.sharkchao.databinddemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.winning.sharkchao.databinddemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ViewModel model = new ViewModel();
        //1.给对象赋值
        binding.setUser(model.getUser());
        //2.设置点击事件
        binding.setTestListener(new TestClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "测试点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        //3.include的使用     需要bind:user来把user对象给显式传递过去
        //4.ViewStub的使用
        binding.btnViewStub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstActivity.startFirstActivity(MainActivity.this);
            }
        });
    }

    public interface TestClickListener{
        void onClick();
    }
}
