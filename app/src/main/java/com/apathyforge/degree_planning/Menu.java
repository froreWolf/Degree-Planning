package com.apathyforge.degree_planning;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;

public class Menu extends AppCompatActivity {

    Spinner majors;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //action bar on the top will have the back button
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        majors = findViewById(R.id.majorSelector);
    }

    //action bar stuff
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    //continue code here



    //this method is the onclick for the button in menu
    //it will be responsible for opening the web ex view
    public void showPlan(View view)
    {
        //use the majors variable here
        //you can get the currently selected item by doing
        //majors.getSelectedItem().toString();
        Intent intent = new Intent(/*intent for Web Ex*/);
    }
}
