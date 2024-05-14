package com.example.onlinemoviebookingapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Load animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        // Hooks
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);

        // Set animations
        logo.setAnimation(topAnim);
        appName.setAnimation(bottomAnim);

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }).start();
    }
}