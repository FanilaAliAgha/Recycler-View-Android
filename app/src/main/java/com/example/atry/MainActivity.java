package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programminglist = (RecyclerView)findViewById(R.id.programminglist);



        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"JAVA", "C#","C","PYTHON", "PHP","HTML","CSS","JAVASCRIPT","NodeJS","Jquerry"};
        programminglist.setAdapter(new programmingadapter(languages));
    }
}