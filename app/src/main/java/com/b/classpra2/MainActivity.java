package com.b.classpra2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("i am in","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("i am in ","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("i am in","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("i am in ","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("i am in ","onDestroy");
    }
}
