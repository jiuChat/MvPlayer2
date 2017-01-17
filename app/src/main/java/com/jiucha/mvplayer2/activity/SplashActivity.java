package com.jiucha.mvplayer2.activity;

import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.jiucha.mvplayer2.R;

import butterknife.BindView;

public class SplashActivity extends BaseActivity {


    @BindView(R.id.splash_image)
    ImageView mSplashImage;

    @Override
    public int getContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mSplashImage.setAnimation(animation);
    }
}
