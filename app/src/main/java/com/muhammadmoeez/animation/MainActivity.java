package com.muhammadmoeez.animation;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    ImageView  top_left_image, top_right_image, bottom_left_image, bottom_right_image;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        top_left_image = (ImageView) findViewById(R.id.t_l_imageView);
        top_right_image = (ImageView) findViewById(R.id.t_r_imageView1);

        bottom_left_image = (ImageView) findViewById(R.id.b_l_imageView);
        bottom_right_image = (ImageView) findViewById(R.id.b_r_imageView);


        Animation anim = AnimationUtils.loadAnimation(this,R.anim.image_in_left);
        top_left_image.setAnimation(anim);

        Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.image_in_right);
        top_right_image.setAnimation(anim1);


        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.image_in_left);
        bottom_left_image.setAnimation(anim2);

        Animation anim3 = AnimationUtils.loadAnimation(this,R.anim.image_in_right);
        bottom_right_image.setAnimation(anim3);





    }


}

