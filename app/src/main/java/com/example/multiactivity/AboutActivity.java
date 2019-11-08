package com.example.multiactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String user = "Животное";
        String gift = "дырку от бублика";

        TextView infoTextView = (TextView)findViewById(R.id.textView_about_content);
        infoTextView.setText(user + " , вам передали " + gift);
    }
}
