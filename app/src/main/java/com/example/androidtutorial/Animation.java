package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Animation extends AppCompatActivity {

    public ImageView imageLogo, imageTravel;
    public LinearLayout developer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        imageLogo = findViewById(R.id.logo);
        android.view.animation.Animation dropAnimation = AnimationUtils.loadAnimation(this, R.anim.drop);
        imageLogo.startAnimation(dropAnimation);

        imageTravel = findViewById(R.id.imageTravel);
        android.view.animation.Animation liftAnimation = AnimationUtils.loadAnimation(this, R.anim.lift);
        imageTravel.startAnimation(liftAnimation);

        developer = findViewById(R.id.developerView);
        android.view.animation.Animation devlist = AnimationUtils.loadAnimation(this, R.anim.lift);
        developer.startAnimation(devlist);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Animation.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}