package com.tanmay.speedometerview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SpeedometerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speedometer_view);

        CustomSpeedometer speedometer = (CustomSpeedometer) findViewById(R.id.speedometer);
        speedometer.setMaxSpeed(50);
        speedometer.setLabelConverter(new CustomSpeedometer.LabelConverter() {
            @Override
            public String getLabelFor(double progress, double maxProgress) {
                return String.valueOf((int) Math.round(progress));
            }
        });
        speedometer.setMaxSpeed(50);
        speedometer.setMajorTickStep(5);
        speedometer.setMinorTicks(4);
        speedometer.addColoredRange(0, 30, Color.GREEN);
        speedometer.addColoredRange(30, 45, Color.YELLOW);
        speedometer.addColoredRange(45, 50, Color.RED);
        speedometer.setSpeed(33, 1000, 300);
    }
}
