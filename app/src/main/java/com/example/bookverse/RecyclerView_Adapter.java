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

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder> {

    private ArrayList<RecyclerView_List> recyclerView_list;
    private Context context;

    public RecyclerView_Adapter(ArrayList<RecyclerView_List> recyclerView_list, Context context) {
        this.recyclerView_list = recyclerView_list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_card,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(recyclerView_list.get(position).getImage());
        holder.textView.setText(recyclerView_list.get(position).getText());

        holder.cardView.setOnClickListener(e->{
            Intent intent = new Intent(context, Pages.class);
            intent.putExtra("id", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return recyclerView_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
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
