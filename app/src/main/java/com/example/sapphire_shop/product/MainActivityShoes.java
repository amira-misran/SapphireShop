package com.example.sapphire_shop.product;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.adapter.ShoesRecyclerViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivityShoes extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shoes);

        FloatingActionButton floatingactionbutton = findViewById(R.id.fab);
        floatingactionbutton.bringToFront();
        floatingactionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerView4 = findViewById(R.id.recycler_view4);

        linearLayoutManager = new LinearLayoutManager(MainActivityShoes.this);
        recyclerView4.setLayoutManager(linearLayoutManager);


        List<Shoes> allShoesInfor = getAllShoesInfor();
        ShoesRecyclerViewAdapter shoesRecyclerViewAdapter = new ShoesRecyclerViewAdapter(MainActivityShoes.this,allShoesInfor);
        recyclerView4.setAdapter(shoesRecyclerViewAdapter);

    }

    private List <Shoes> getAllShoesInfor()
    {
        List<Shoes> allShoes= new ArrayList<>();

        allShoes.add( new Shoes ("Black Heels","RM 345",R.drawable.blackheels));
        allShoes.add( new Shoes("Nude Heels","RM 323",R.drawable.heelsnude));
        allShoes.add( new Shoes("Transparent Heels","RM 234",R.drawable.heelstransparent));
        allShoes.add( new Shoes("Khaki Puma Shoes","RM 67",R.drawable.khakipuma));
        allShoes.add( new Shoes("Lilac Puma Shoes","RM 54",R.drawable.lilacpuma));
        allShoes.add( new Shoes("Rainbow Puma Shoes","RM 125",R.drawable.rainbowpuma));
        allShoes.add( new Shoes("Gold Puma Shoes","RM 321",R.drawable.goldpuma));
        allShoes.add( new Shoes("Black Puma Shoes","RM 230",R.drawable.blackpuma));
        allShoes.add( new Shoes("NIKE Air Force ","RM 129",R.drawable.nikeairforce));
        allShoes.add( new Shoes("NIKE Sport Shoes ","RM 180",R.drawable.nikesport));

        return allShoes;
    }



}
