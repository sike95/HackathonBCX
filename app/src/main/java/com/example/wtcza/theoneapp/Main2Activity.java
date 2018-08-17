package com.example.wtcza.theoneapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    SurfaceView surfaceView;
    CameraSource cameraSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        TextView  textView = findViewById(R.id.textview);
//        textView.setText("QRScanner");
    }
}
