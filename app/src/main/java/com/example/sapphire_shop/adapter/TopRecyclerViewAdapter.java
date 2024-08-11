package com.example.sapphire_shop.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//ada import class

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.product.Top;
import com.example.sapphire_shop.product.TopDetailActivity;

import java.util.List;

public class TopRecyclerViewAdapter extends RecyclerView.Adapter<TopRecyclerViewAdapter.TopViewHolder> {

    public List<Top> TopList;
    private Context context;

    public TopRecyclerViewAdapter(Context context, List<Top> TopList) {
        this.context = context;
        this.TopList = TopList;
    }

    @NonNull
    @Override
    public TopRecyclerViewAdapter.TopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View top_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_row, null);

        TopViewHolder topVH = new TopViewHolder(top_row);
        return topVH;

    }

    @Override
    public void onBindViewHolder(@NonNull TopRecyclerViewAdapter.TopViewHolder holder, int position) {

        holder.tvTopName.setText(TopList.get(position).getName());
        holder.tvTopPrice.setText(TopList.get(position).getPrice());
        holder.imgViewTopImage.setImageResource(TopList.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return TopList.size();
    }

    public class TopViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tvTopName,tvTopPrice;
        public ImageView imgViewTopImage;


        public TopViewHolder(View itemView) {
            super(itemView);
            tvTopName = itemView.findViewById(R.id.tv_top_name);
            imgViewTopImage = itemView.findViewById(R.id.img_top);
            tvTopPrice = itemView.findViewById(R.id.tv_top_price);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Top Name : " + TopList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), TopDetailActivity.class);
            intent.putExtra("Top Name ", TopList.get(getAdapterPosition()).getName());
            intent.putExtra("Price ", TopList.get(getAdapterPosition()).getPrice());


            view.getContext().startActivity(intent);
        }

    }
}


