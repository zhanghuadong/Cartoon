package com.dongzi.cartoon.ui;


import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.dongzi.cartoon.R;

public class SplashActivity extends BaseFrameWorkActivity {

    ImageView splash_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splash_image=(ImageView)findViewById(R.id.splash_image);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        splash_image.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //1:有网络时候登陆；无网络时直接跳转
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
