package com.example.survivalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {

    private Animation left_to_right;
    private Button btn_learn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        btn_learn = (Button) findViewById(R.id.btn_learn);

        btn_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}