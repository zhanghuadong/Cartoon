package com.dongzi.cartoon.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;


/**
 * @author https://github.com/hongyangAndroid/okhttp-utils
 * @author  http://antonioleiva.com   ====best author
 */
public class BaseFrameWorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected  void  startActivityTransitions(){

        // ActivityOptionsCompat options= ActivityOptionsCompat.makeSceneTransitionAnimation()
    }

    /**
     *
     * @param activity
     * @param it
     * @param options 各种动画选项
     */
    private void baseStartActivity(Activity activity, Intent it, ActivityOptionsCompat options){
        ActivityCompat.startActivity(activity,it,options.toBundle());
    }

}
