package com.alertnetph.alertnetph;

import static com.alertnetph.alertnetph.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 1024;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler.postDelayed(() -> {
            Intent splash = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(splash);
            finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}