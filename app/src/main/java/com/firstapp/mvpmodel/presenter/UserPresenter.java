package com.firstapp.mvpmodel.presenter;

import android.view.View;

import com.firstapp.mvpmodel.model.User;

public class UserPresenter {
    private User user;
    private View view;

    public UserPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void UserPresenter(String fullName){
        user.setName(fullName);
        view.updateUserInfoTextView(user.toString());

    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(email);

    }

    public void updateName(String name){
        user.setName(name);
        view.updateUserInfoTextView(name);

    }

    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}