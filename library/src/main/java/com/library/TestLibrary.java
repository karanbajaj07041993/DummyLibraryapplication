package com.library;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by karan.bajaj on 3/13/2017.
 */

public class TestLibrary {
    private final Activity activity;

    public TestLibrary(Activity activity) {
        this.activity = activity;
    }

    public void callLibrary() {
        Toast.makeText(activity, "Library called...", Toast.LENGTH_SHORT).show();
    }
}
