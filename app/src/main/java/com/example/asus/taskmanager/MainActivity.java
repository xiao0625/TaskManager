package com.example.asus.taskmanager;

import android.accounts.AccountAuthenticatorActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView welcomeImg;
    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity);
        welcomeImg = (ImageView)findViewById(R.id.welcome);
        anim=new AlphaAnimation(0.1f,1.0f);//设置透明度动画效果
        anim.setDuration(200);//设置动画持续时间2秒钟
        welcomeImg.startAnimation(anim);
        anim.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //这里启动注册和登录页面，目前什么都不做，直接退出
               *//* Intent intent = new Intent(MainActivity.this, AccountAuthenticatorActivity.class);
                startActivity(intent);
                *//*
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });*/
    }
}
