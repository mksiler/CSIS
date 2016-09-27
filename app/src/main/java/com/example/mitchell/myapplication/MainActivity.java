package com.example.mitchell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFaculty(View view) {
       setContentView(R.layout.activity_faculty);
    }

    public void onClickCourse(View view) {
        setContentView(R.layout.activity_course);
    }

    public void onClickBack(View view){
        setContentView(R.layout.activity_main);
    }
}
