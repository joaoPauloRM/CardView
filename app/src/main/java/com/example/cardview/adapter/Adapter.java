package com.example.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cardview.R;
import com.example.cardview.model.Posts;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Posts> posts;

    public Adapter(List<Posts> posts) {
        this.posts = posts;
    }
    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.adapter, viewGroup, false);
        return new MyViewHolder(item);
    }
    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder myViewHolder, int i) {
        Posts p = posts.get(i);
        myViewHolder.name.setText(p.getName());
        myViewHolder.image.setImageResource(p.getImage());
        myViewHolder.post.setText(p.getPost());
    }
    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView post;
        private ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameId);
            post = itemView.findViewById(R.id.postId);
            image = itemView.findViewById(R.id.imageId);
        }
    }
}
