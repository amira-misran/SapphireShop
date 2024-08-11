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

//ada class import

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.product.Shoes;
import com.example.sapphire_shop.product.ShoesDetailActivity;

import java.util.List;

public class ShoesRecyclerViewAdapter extends RecyclerView.Adapter<ShoesRecyclerViewAdapter.ShoesViewHolder> {

    public List<Shoes> ShoesList;
    private Context context;

    public ShoesRecyclerViewAdapter(Context context, List<Shoes> ShoesList) {
        this.context = context;
        this.ShoesList = ShoesList;
    }

    @NonNull
    @Override
    public ShoesRecyclerViewAdapter.ShoesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View shoes_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.shoes_row, null);

        ShoesRecyclerViewAdapter.ShoesViewHolder shoesVH = new ShoesRecyclerViewAdapter.ShoesViewHolder(shoes_row);
        return shoesVH;

    }
    @Override
    public void onBindViewHolder(@NonNull ShoesRecyclerViewAdapter.ShoesViewHolder holder, int position) {

        holder.tvShoesName.setText(ShoesList.get(position).getName());
        holder.tvShoesPrice.setText(ShoesList.get(position).getPrice());
        holder.imgViewShoesImage.setImageResource(ShoesList.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return ShoesList.size();
    }

    public class ShoesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tvShoesName,tvShoesPrice;
        public ImageView imgViewShoesImage;


        public ShoesViewHolder(View itemView) {
            super(itemView);
            tvShoesName = itemView.findViewById(R.id.tv_shoes_name);
            tvShoesPrice = itemView.findViewById(R.id.tv_shoes_price);
            imgViewShoesImage = itemView.findViewById(R.id.img_shoes);
            itemView.setOnClickListener(this);


        }


        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Shoes Name : " + ShoesList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), ShoesDetailActivity.class);
            intent.putExtra("Shoes Name: ",ShoesList.get(getAdapterPosition()).getName());
            intent.putExtra("Price : ",ShoesList.get(getAdapterPosition()).getPrice());


            view.getContext().startActivity(intent);
        }

    }}
