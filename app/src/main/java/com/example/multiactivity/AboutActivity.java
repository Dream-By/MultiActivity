package com.example.multiactivity;

import android.app.Activity;
import android.app.*;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class AboutActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);
    }
}
