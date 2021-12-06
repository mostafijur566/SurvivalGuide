package com.example.survivalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FloodActivity extends AppCompatActivity {

    private Button about_flood, warning_flood, topical_warning, flood_tips, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood);

        about_flood = (Button) findViewById(R.id.about_flood);
        warning_flood = (Button) findViewById(R.id.warning_flood);
        topical_warning = (Button) findViewById(R.id.topical_warning_flood);
        flood_tips = (Button) findViewById(R.id.flood_tips);
        back = (Button) findViewById(R.id.btn_back);

        about_flood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FloodActivity.this, aboutActivity.class);
                intent.putExtra("tag", getString(R.string.about_flood));
                intent.putExtra("title", "Flood");
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        warning_flood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FloodActivity.this, WarningActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        topical_warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FloodActivity.this, TopicalActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        flood_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FloodActivity.this, FloodTipsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FloodActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
            }
        });
    }
}