package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.adapter.Adapter;
import com.example.cardview.model.Posts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Posts> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recycleId);

        //Definindo layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerPostagem.setLayoutManager(layoutManager);
        //Definindo Adapter
        preparePosts();
        Adapter adapter = new Adapter(posts);
        recyclerPostagem.setAdapter(adapter);
    }

    public void preparePosts() {
        Posts p = new Posts("João paulo", "Viagem", R.drawable.imagem1);
        this.posts.add(p);

        p = new Posts("Silva Rocha", "Estudos", R.drawable.imagem2);
        this.posts.add(p);

        p = new Posts("Mendes", "Android", R.drawable.imagem3);
        this.posts.add(p);
    }
}
