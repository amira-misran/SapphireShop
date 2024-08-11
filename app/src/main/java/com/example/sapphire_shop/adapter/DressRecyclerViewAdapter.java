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

//ada import class sapphire_shop

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.product.Dress;
import com.example.sapphire_shop.product.DressDetailActivity;

import java.util.List;

public class DressRecyclerViewAdapter extends RecyclerView.Adapter<DressRecyclerViewAdapter.DressViewHolder> {

    public List <Dress> DressList;
    private Context context;

    public DressRecyclerViewAdapter(Context context,List <Dress> DressList) {
        this.context = context;
        this.DressList = DressList;
    }



    @NonNull
    @Override
    public DressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View dress_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.dress_row, null);

        DressViewHolder dressVH = new DressViewHolder(dress_row);
        return dressVH;

    }

    @Override
    public void onBindViewHolder(@NonNull DressViewHolder holder, int position) {

        holder.tvDressName.setText(DressList.get(position).getName());
        holder.tvDressPrice.setText(DressList.get(position).getPrice());
        holder.imgViewDressImage.setImageResource(DressList.get(position).getImage());


    }

    @Override
    public int getItemCount() {

        return DressList.size();
    }

    public class DressViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView tvDressName,tvDressPrice;
        public ImageView imgViewDressImage;


        public DressViewHolder(View itemView) {
            super(itemView);
            tvDressName = itemView.findViewById(R.id.tv_dress_name);
            tvDressPrice= itemView.findViewById(R.id.tv_dress_price);
            imgViewDressImage = itemView.findViewById(R.id.img_dress);
            itemView.setOnClickListener(this);



        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Dress Name : " + DressList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), DressDetailActivity.class);
            intent.putExtra("Dress Name: ",DressList.get(getAdapterPosition()).getName());
            intent.putExtra("Price : ",DressList.get(getAdapterPosition()).getPrice());


            view.getContext().startActivity(intent);
        }



    }
}
