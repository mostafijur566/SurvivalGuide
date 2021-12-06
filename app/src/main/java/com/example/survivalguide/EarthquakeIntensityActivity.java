package com.example.survivalguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EarthquakeIntensityActivity extends AppCompatActivity {

    private Button back;
    private ImageView img_intensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake_intensity);

        back = (Button) findViewById(R.id.btn_back);
        img_intensity = (ImageView) findViewById(R.id.img_earthquake_intensity);

        img_intensity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(v.getContext());
                imageView.setImageResource(R.drawable.earthquakeintensity);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(EarthquakeIntensityActivity.this);
                alertDialogBuilder.setView(imageView);

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarthquakeIntensityActivity.this, EarthquakeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
            }
        });
    }
}