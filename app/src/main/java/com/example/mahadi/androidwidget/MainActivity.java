package com.example.mahadi.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private TextView name,age,textShow;
    Button login,logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.name);
        textShow = (TextView) findViewById(R.id.text3);
        age = (TextView) findViewById(R.id.age);

        login = (Button) findViewById(R.id.login);
        logout = (Button) findViewById(R.id.logout);

        name.setText("Anisul Islam");
        age.setText("25 years Old");

        Hendler hendler = new Hendler();

        login.setOnClickListener(hendler);
        logout.setOnClickListener(hendler);

    }

    class Hendler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.login){

                textShow.setText("You Clicked Log In Button");
            }else if (view.getId()==R.id.logout){

                textShow.setText("You Clicked Log Out Button");
            }else {
                textShow.setText("Please Clicked Login or logout button");
            }
        }
    }


}
