package com.example.survivalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FireActivity extends AppCompatActivity {

    private Button about_fire, back, alarm_levels, fire_classification, fire_tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        about_fire = (Button) findViewById(R.id.about_fire);
        alarm_levels = (Button) findViewById(R.id.btn_alarm_levles);
        back = (Button) findViewById(R.id.btn_back);
        fire_classification = (Button) findViewById(R.id.btn_fire_classification);
        fire_tips = (Button) findViewById(R.id.btn_fire_tips);

        about_fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FireActivity.this, aboutActivity.class);
                intent.putExtra("tag", getString(R.string.about_fire));
                intent.putExtra("title", "Fire");
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        alarm_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FireActivity.this, AlarmLevelsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        fire_classification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FireActivity.this, FireClassificationActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        fire_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FireActivity.this, FireTipsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FireActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
            }
        });
    }
}