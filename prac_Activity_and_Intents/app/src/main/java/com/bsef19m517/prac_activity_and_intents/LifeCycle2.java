package com.bsef19m517.prac_activity_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle2 extends AppCompatActivity {
    private static final String TAG = "Life Cycle 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle2);
        Log.d(TAG,":::onCreate:::");
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,":::onStart:::");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,":::onResume:::");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,":::onPause:::");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,":::onStop:::");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,":::onDestroy:::");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,":::onRestart:::");
    }
}