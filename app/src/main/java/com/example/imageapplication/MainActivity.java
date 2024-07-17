package com.example.imageapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;
    private ArrayList<String> imageUrls;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        imageUrls = new ArrayList<>();
        imageUrls.add("https://cdn.britannica.com/22/187222-050-07B17FB6/apples-on-a-tree-branch.jpg?w=400&h=300&c=crop");
        imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSG8zpeBAwHX8fSNly16RLQUa-iNc6Ws7H9XfqNxSqu9MhAYCg2XyywcrXRyEKJoC2Gsho&usqp=CAU");
        imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfsE5POIO5c7G0wgVks4lML7KJTlyQo3u1uR9qkd1DkTl-HzP7v2JI0J_6VAo9pylhq30&usqp=CAU");

        imageAdapter = new ImageAdapter(this, imageUrls);
        recyclerView.setAdapter(imageAdapter);
    }
}
