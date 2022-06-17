package com.bsef19m517.listview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StudentArrayAdapter extends ArrayAdapter<Student> {

    public StudentArrayAdapter(@NonNull Context context, ArrayList<Student> studentArrayList) {
        super(context, 0,studentArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main,parent);

        TextView name = convertView.findViewById(R.id.textView);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("LOG",student.getName());
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("LOG",String.valueOf(student.getImgId()));
                Intent intent = new Intent(getContext(),MainActivity.class);
                getContext().startActivity(intent);
            }
        });
        name.setText(student.getName());
        imageView.setImageResource(student.getImgId());
        return convertView;
    }
}
