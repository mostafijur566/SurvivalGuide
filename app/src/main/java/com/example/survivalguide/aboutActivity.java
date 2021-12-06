package com.example.survivalguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class aboutActivity extends AppCompatActivity {

    private TextView txt_about, txt_title, photo_credit;

    private Button btn_back;

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        txt_about = (TextView) findViewById(R.id.about);
        txt_title = (TextView) findViewById(R.id.txt_title);
        btn_back = (Button) findViewById(R.id.btn_back);
        photo_credit = (TextView) findViewById(R.id.photo_credit);
        img = (ImageView) findViewById(R.id.about_img);

        Intent intent = getIntent();

        String value = intent.getStringExtra("tag");
        String title = intent.getStringExtra("title");


        if(title.equals("Flood"))
        {
            txt_title.setText("ABOUT FLOOD");
            txt_about.setText(value);
            photo_credit.setText(getString(R.string.flood_photo_credit));

            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(aboutActivity.this, FloodActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
                }
            });

            img.setImageResource(R.drawable.flood_img);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView imageView = new ImageView(v.getContext());
                    imageView.setImageResource(R.drawable.flood_img);
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(aboutActivity.this);
                    alertDialogBuilder.setView(imageView);

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
            });
        }

        else if(title.equals("Fire"))
        {
            txt_title.setText("ABOUT FIRE");
            txt_about.setText(value);
            photo_credit.setText(getString(R.string.fire_photo_credit));

            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(aboutActivity.this, FireActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
                }
            });

            img.setImageResource(R.drawable.fire_img);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView imageView = new ImageView(v.getContext());
                    imageView.setImageResource(R.drawable.fire_img);
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(aboutActivity.this);
                    alertDialogBuilder.setView(imageView);

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
            });
        }

        else if(title.equals("Earthquake"))
        {
            txt_title.setText("ABOUT EARTHQUAKE");
            txt_about.setText(value);
            photo_credit.setText(getString(R.string.earthquake_photo_credit));

            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(aboutActivity.this, EarthquakeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
                }
            });

            img.setImageResource(R.drawable.earthquake);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView imageView = new ImageView(v.getContext());
                    imageView.setImageResource(R.drawable.earthquake);
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(aboutActivity.this);
                    alertDialogBuilder.setView(imageView);

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
            });
        }

    }
}