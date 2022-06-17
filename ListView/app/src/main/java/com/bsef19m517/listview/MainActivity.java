package com.bsef19m517.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = this.findViewById(R.id.listView);
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Barira","bsef19m534",20,R.drawable.cat));
        students.add(new Student("Maria","bsef19m517",20,R.drawable.alligator));


    }
}