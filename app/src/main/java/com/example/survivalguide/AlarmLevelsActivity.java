package com.example.survivalguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlarmLevelsActivity extends AppCompatActivity {

    private ImageView img_fire_alarm;

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_levels);

        img_fire_alarm = (ImageView) findViewById(R.id.img_fire_alarm);
        back = (Button) findViewById(R.id.btn_back);

        img_fire_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(v.getContext());
                imageView.setImageResource(R.drawable.firelevels);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AlarmLevelsActivity.this);
                alertDialogBuilder.setView(imageView);

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmLevelsActivity.this, FireActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
            }
        });
    }
}