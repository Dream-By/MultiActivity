package com.example.multiactivity;import androidx.appcompat.app.AppCompatActivity;import android.content.Intent;import android.os.Bundle;public class MainActivity extends AppCompatActivity {    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);    }    public void onclick(android.view.View view) {        Intent intent = new Intent(MainActivity.this, AboutActivity.class);        startActivity(intent);    }}