package com.example.practical_12;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageview);
        final Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.clock);
        final Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.anticlock);
        img.startAnimation(anim2);
        anim2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) { }
            @Override
            public void onAnimationEnd(Animation animation) {
                img.startAnimation(anim1);
            }
            @Override
            public void onAnimationRepeat(Animation animation) { }});
        anim1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                img.setImageResource(R.drawable.boll); }
            @Override
            public void onAnimationEnd(Animation animation) {
                img.startAnimation(anim2);
                finish(); }
            @Override
            public void onAnimationRepeat(Animation animation) { }}); }}
