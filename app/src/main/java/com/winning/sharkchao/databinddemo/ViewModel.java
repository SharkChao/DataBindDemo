package com.winning.sharkchao.databinddemo;

/**
 * Created by SharkChao on 2018-01-25.
 */

public class ViewModel {

    private final User mUser;

    public ViewModel(){
        mUser = new User("SharkChao","22");
    }

    /**
     * 负责处理业务
     * @return
     */
    public User getUser(){
        return mUser;
    }
}
