/**
 * DISCLAIMER: This code is taken from deitel tutorials. Modified for the test purpose.
 * This code can't be use reused for any commercial purpose and fully meant to educational purposes. 
 * I'm using this to learn android.
 */
package com.ptyagi911.intro;

import com.ptyagi911.intro.R;

import android.app.Activity;
import android.os.Bundle;

public class Intro extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}