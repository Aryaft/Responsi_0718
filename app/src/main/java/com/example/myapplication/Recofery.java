package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Recofery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recofery);
        getSupportActionBar().setTitle("Recovery");
        getSupportActionBar().setDisplayHomeAsUpEnabled(True);
    }
}