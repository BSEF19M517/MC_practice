package com.bsef19m517.mc01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_calc);
        Log.d(TAG,":::onCreate function:::");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,":::onStart function:::");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,":::onResume function:::");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,":::onPause function:::");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,":::onRestart function:::");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,":::onStop function:::");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,":::onDestroy function:::");
    }
}