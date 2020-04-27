package com.apathyforge.degree_planning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMainActivity(View view)
    {
        //starts the main menu of the application
        startActivity(new Intent(this, Menu.class));
    }
}
