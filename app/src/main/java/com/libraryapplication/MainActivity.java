package com.libraryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.library.TestLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestLibrary testLibrary=new TestLibrary(MainActivity.this);
        testLibrary.callLibrary();
    }
}
