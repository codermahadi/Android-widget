package com.example.mahadi.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name,age,textShow;
    Button btn;
    public int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.name);
        textShow = (TextView) findViewById(R.id.text3);
        age = (TextView) findViewById(R.id.age);

        name.setText("Anisul Islam");
        age.setText("25 years Old");

        btn  = (Button) findViewById(R.id.btn);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textShow.setText("You clicked " + count + " Times");
            }
        });

    }
}
