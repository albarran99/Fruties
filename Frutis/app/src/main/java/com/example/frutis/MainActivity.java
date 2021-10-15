package com.example.frutis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected Boolean isFruitVisible;

    protected Boolean isVegetableVisible;

    private ImageButton imgbtnMeloq, imgbtnBanna,
            imgbtnPimiento, imgbtnPotatoe;

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageMeloq = (ImageButton) findViewById(R.id.imgbtnMeloq);
        ImageButton imgbtnBanna = (ImageButton) findViewById(R.id.imgbtnBanna);
        ImageButton imgbtnPimiento = (ImageButton) findViewById(R.id.imgbtnPimiento);
        ImageButton imgbtnPotatoe = (ImageButton) findViewById(R.id.imgbtnPotatoe);

        imageMeloq.setVisibility(View.GONE);
        imgbtnBanna.setVisibility(View.GONE);
        imgbtnPimiento.setVisibility(View.GONE);
        imgbtnPotatoe.setVisibility(View.GONE);

        TextView tvPotatoe = (TextView) findViewById(R.id.tvPotatoe);
        TextView tvPimiento = (TextView) findViewById(R.id.tvPimiento);
        TextView tvBanna = (TextView) findViewById(R.id.tvBanna);
        TextView tvMeloq = (TextView) findViewById(R.id.tvMeloq);

        tvPotatoe.setVisibility(View.GONE);
        tvPimiento.setVisibility(View.GONE);
        tvBanna.setVisibility(View.GONE);
        tvMeloq.setVisibility(View.GONE);

        isFruitVisible = false;

        isVegetableVisible = false;
    }

    public void showFruta(View v) {
        Toast toast = Toast.makeText(this, "Has elegido fruta", Toast.LENGTH_SHORT);
        toast.show();

        ImageButton imagenMeloq = (ImageButton) findViewById(R.id.imgbtnMeloq);

        ImageButton imagenBanna = (ImageButton) findViewById(R.id.imgbtnBanna);

        TextView tvBanna = (TextView) findViewById(R.id.tvBanna);

        TextView tvMeloq = (TextView) findViewById(R.id.tvMeloq);

        if (isFruitVisible) {
            imagenMeloq.setVisibility(View.GONE);
            imagenBanna.setVisibility(View.GONE);
            tvBanna.setVisibility(View.GONE);
            tvMeloq.setVisibility(View.GONE);
            isFruitVisible = false;
        } else {
            imagenMeloq.setVisibility(View.VISIBLE);
            imagenBanna.setVisibility(View.VISIBLE);
            tvBanna.setVisibility(View.VISIBLE);
            tvMeloq.setVisibility(View.VISIBLE);
            isFruitVisible = true;
        }

    }

    public void showVegetables(View v) {
        Toast toast = Toast.makeText(this, "Has elegido Verdura", Toast.LENGTH_SHORT);
        toast.show();

        ImageButton imgbtnPimiento = (ImageButton) findViewById(R.id.imgbtnPimiento);

        ImageButton imgbtnPotatoe = (ImageButton) findViewById(R.id.imgbtnPotatoe);

        TextView tvPotatoe = (TextView) findViewById(R.id.tvPotatoe);

        TextView tvPimiento = (TextView) findViewById(R.id.tvPimiento);

        if (isVegetableVisible) {
            imgbtnPimiento.setVisibility(View.GONE);
            imgbtnPotatoe.setVisibility(View.GONE);
            tvPotatoe.setVisibility(View.GONE);
            tvPimiento.setVisibility(View.GONE);
            isVegetableVisible = false;
        } else {
            imgbtnPimiento.setVisibility(View.VISIBLE);
            imgbtnPotatoe.setVisibility(View.VISIBLE);
            tvPotatoe.setVisibility(View.VISIBLE);
            tvPimiento.setVisibility(View.VISIBLE);
            isVegetableVisible = true;
        }
    }

    public void addPotatoe(View v) {
        TextView tvresult = (TextView) findViewById(R.id.tvResult);

        tvresult.setText("Patatas" + "\n" + tvresult.getText());

    }

    public void addBanna(View v) {
        TextView tvresult = (TextView) findViewById(R.id.tvResult);

        tvresult.setText("Platano" + "\n" + tvresult.getText());

    }

    public void addMeloq(View v) {
        TextView tvresult = (TextView) findViewById(R.id.tvResult);

        tvresult.setText("Melocoton" + "\n" + tvresult.getText());

    }

    public void addPimiento(View v) {
        TextView tvresult = (TextView) findViewById(R.id.tvResult);

        tvresult.setText("Pimiento" + "\n" + tvresult.getText());

    }

}