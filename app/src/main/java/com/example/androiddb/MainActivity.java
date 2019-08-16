package com.example.androiddb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androiddb.DatabaseUtils.ExampleDBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleDBHelper exampleDBHelper = new ExampleDBHelper(this);
    }
}
