package com.bsef19m517.mc01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear1);
        etName = (EditText) findViewById(R.id.editTextTextPersonName);
        etPass = (EditText) findViewById(R.id.editTextTextPersonName2);
    }

    public void Function1(View view) {
       String myName =  etName.getText().toString();
       String myPass = etPass.getText().toString();
        Toast.makeText(MainActivity.this, "Welcome " + myName + "\nPassword: " + myPass , Toast.LENGTH_LONG).show();
    }
}