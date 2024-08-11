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


import com.example.sapphire_shop.R;
import com.example.sapphire_shop.product.Bottom;
import com.example.sapphire_shop.product.BottomDetailActivity;

import java.util.List;

public class BottomRecyclerViewAdapter extends RecyclerView.Adapter<BottomRecyclerViewAdapter.BottomViewHolder> {

    public List<Bottom> BottomList;
    private Context context;

    public BottomRecyclerViewAdapter(Context context,List <Bottom> BottomList) {
        this.context = context;
        this.BottomList = BottomList;
    }

    @NonNull
    @Override
    public BottomRecyclerViewAdapter.BottomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View bottom_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottom_row, null);

        BottomRecyclerViewAdapter.BottomViewHolder bottomVH = new BottomRecyclerViewAdapter.BottomViewHolder(bottom_row);
        return bottomVH;
    }


    @Override
    public void onBindViewHolder(@NonNull BottomRecyclerViewAdapter.BottomViewHolder holder, int position) {

        holder.tvBottomName.setText(BottomList.get(position).getName());
        holder.tvBottomPrice.setText(BottomList.get(position).getPrice());
        holder.imgViewBottomImage.setImageResource(BottomList.get(position).getImage());
    }


    @Override
    public int getItemCount () {

        return BottomList.size();
    }

    public class BottomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tvBottomName,tvBottomPrice;
        public ImageView imgViewBottomImage;


        public BottomViewHolder(View itemView) {
            super(itemView);
            tvBottomName = itemView.findViewById(R.id.tv_bottom_name);
            tvBottomPrice = itemView.findViewById(R.id.tv_bottom_price);
            imgViewBottomImage = itemView.findViewById(R.id.img_bottom);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Bottom Name : " + BottomList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), BottomDetailActivity.class);
            intent.putExtra("Bottom Name ", BottomList.get(getAdapterPosition()).getName());
            intent.putExtra("Price ", BottomList.get(getAdapterPosition()).getPrice());
            //get pid for each product
            intent.putExtra("pid",BottomList.get(getAdapterPosition()).getName());

            view.getContext().startActivity(intent);
        }

    }

}
