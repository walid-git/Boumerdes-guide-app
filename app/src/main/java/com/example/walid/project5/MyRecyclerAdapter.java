package com.example.walid.project5;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    ArrayList<RecyclerViewElement> items;

    public MyRecyclerAdapter(ArrayList<RecyclerViewElement> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setTitle(items.get(position).getTitle());
        holder.setImg(items.get(position).getImg_res());
        holder.setOnClick(position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView img;
        TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
            cardView = itemView.findViewById(R.id.card);
        }

        public void setImg(int resId) {
            img.setImageResource(resId);
        }

        public void setTitle(String str) {
            title.setText(str);
        }

        public void setOnClick(final int pos) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), DetailsActivity.class);
                    intent.putExtra("title", items.get(pos).getTitle());
                    intent.putExtra("img", items.get(pos).getImg_res());
                    intent.putExtra("location", items.get(pos).getLocation());
                    intent.putExtra("details", items.get(pos).getDetails_res());
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
