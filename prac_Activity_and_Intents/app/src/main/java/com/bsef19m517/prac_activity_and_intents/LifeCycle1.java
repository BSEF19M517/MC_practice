package com.bsef19m517.prac_activity_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LifeCycle1 extends AppCompatActivity {
    Button btn;
    private static final String TAG = "Life Cycle 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle1);
        Log.d(TAG,":::onCreate:::");

        btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycle1.this,LifeCycle2.class);
                startActivity(intent);
            }
        });
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