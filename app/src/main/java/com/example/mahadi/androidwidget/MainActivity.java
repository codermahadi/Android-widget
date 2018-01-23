package com.example.mahadi.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.name);
        name.setText("Anisul Islam");


        age = (TextView) findViewById(R.id.age);

        age.setText("25 years Old");
    }
}
