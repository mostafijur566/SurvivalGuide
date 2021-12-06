package com.example.survivalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private Animation left_to_right;
    private TextView title;
    private ImageView btn_up;

    private CardView card_flood, card_fire, card_earthquake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left_to_right = AnimationUtils.loadAnimation(this, R.anim.left_slide_in);
        title = (TextView) findViewById(R.id.home_title);

        btn_up = (ImageView) findViewById(R.id.btn_up);

        card_flood = (CardView) findViewById(R.id.card_flood);
        card_fire = (CardView) findViewById(R.id.card_fire);
        card_earthquake = (CardView) findViewById(R.id.card_earthquake);

        title.setAnimation(left_to_right);

        card_flood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FloodActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        card_fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FireActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        card_earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EarthquakeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_out, R.anim.right_slide_in);
            }
        });

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this, R.style.BottomSheetDialogTheme);

                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_layout, (LinearLayout)findViewById(R.id.bottom_layout));

                bottomSheetView.findViewById(R.id.btn_down).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                    }
                });

                bottomSheetView.findViewById(R.id.btn_national).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:911"));
                        startActivity(intent);
                    }
                });

                bottomSheetView.findViewById(R.id.btn_phivolcs).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:117"));
                        startActivity(intent);
                    }
                });

                bottomSheetView.findViewById(R.id.btn_pagasa).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:102"));
                        startActivity(intent);
                    }
                });

                bottomSheetView.findViewById(R.id.btn_fire).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:(02)8426-0219"));
                        startActivity(intent);
                    }
                });

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });
    }
}