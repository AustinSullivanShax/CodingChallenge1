package com.example.codingchallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public ScrollView scrollView;
    public LinearLayout lineLayout;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        scrollView = findViewById(R.id.scrollTextView);
        lineLayout = findViewById(R.id.info);
        textView = new TextView(this);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        textView.setText(str);
        lineLayout.addView(textView);

    }
}