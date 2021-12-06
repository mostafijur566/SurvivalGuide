package com.example.survivalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EarthquakeActivity extends AppCompatActivity {

    private Button btn_about, btn_intensity, btn_preparations, btn_tips, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        btn_about = (Button) findViewById(R.id.btn_about_earthquake);
        btn_intensity = (Button) findViewById(R.id.btn_intensity);
        btn_preparations = (Button) findViewById(R.id.btn_earthquake_preparations);
        btn_tips = (Button) findViewById(R.id.btn_earthquake_tips);
        back = (Button) findViewById(R.id.btn_back);

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarthquakeActivity.this, aboutActivity.class);
                intent.putExtra("tag", getString(R.string.about_earthquake));
                intent.putExtra("title", "Earthquake");
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        btn_intensity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarthquakeActivity.this, EarthquakeIntensityActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        btn_preparations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarthquakeActivity.this, EarthquakePreparationsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        btn_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarthquakeActivity.this, EarthquakeTipsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarthquakeActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
            }
        });
    }
}