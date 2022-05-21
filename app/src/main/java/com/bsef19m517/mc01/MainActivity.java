package com.bsef19m517.mc01;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button mButtonView, mButtonCounter;
    TextView mTextView;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc);
        Log.d(TAG,":::onCreate function:::");
        mButtonView = findViewById(R.id.btn1);
        mTextView = findViewById(R.id.t1);
        mButtonCounter = findViewById(R.id.btn2);

        mButtonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++counter;
                mTextView.setText("Total" + counter);
            }
        });

        if(savedInstanceState != null){
            String count = savedInstanceState.getString("count");
            if(mTextView!= null){
                mTextView.setText(count);
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("count",String.valueOf(mTextView.getText()));
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

    public void scnd(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}