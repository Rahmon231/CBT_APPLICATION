package com.example.cbtapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView titleTV;
    private Button ma_startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleTV = findViewById(R.id.ma_titleID);
        ma_startBtn = findViewById(R.id.ma_startBtnID);
        Typeface typeface = ResourcesCompat.getFont(this,R.font.blacklist);
        titleTV.setTypeface(typeface);
        ma_startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
                startActivity(intent);

            }
        });
    }
}