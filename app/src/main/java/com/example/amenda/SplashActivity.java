package com.example.amenda;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {

        setTheme(R.style.AppTheme);
        //setContentView(R.layout.splash_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // getSupportActionBar().hide();
        ActionBar actionBar = getActionBar();
        if(actionBar != null)
            actionBar.hide();

        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onResume() {
        Intent intent = new Intent(this, MainActivity.class);
        //intent.setClassName("com.example.amenda", MainActivity.class);
        startActivity(intent);
        finish();
        super.onResume();
    }
}
