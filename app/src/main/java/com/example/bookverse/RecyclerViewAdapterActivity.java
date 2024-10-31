package com.example.bookverse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterActivity extends RecyclerView.Adapter<RecyclerViewAdapterActivity.ViewHolder> {

    private ArrayList<RecyclerViewListActivity> recyclerView_list;
    private Context context;

    public RecyclerViewAdapterActivity(ArrayList<RecyclerViewListActivity> recyclerView_list, Context context) {
        this.recyclerView_list = recyclerView_list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewListActivity item = recyclerView_list.get(position);
        holder.imageView.setImageResource(item.getImage());
        holder.textView.setText(item.getText());

        holder.cardView.setOnClickListener(e -> {
            Intent intent = new Intent(context, PagesActivity.class);
            intent.putExtra("id", position);
            intent.putExtra("title", item.getText());
            intent.putExtra("image", item.getImage());
            intent.putExtra("synopsis", item.getSynopsis());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return recyclerView_list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}