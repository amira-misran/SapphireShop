package com.example.sapphire_shop.product;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.adapter.DressRecyclerViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivityDress extends AppCompatActivity {


    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dress);

        FloatingActionButton floatingactionbutton = findViewById(R.id.fab);
        floatingactionbutton.bringToFront();
        floatingactionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view1);

        linearLayoutManager = new LinearLayoutManager(MainActivityDress.this);
        recyclerView.setLayoutManager(linearLayoutManager);


        List<Dress> allDressInfor = getAllDressInfor();
        DressRecyclerViewAdapter dressRecyclerViewAdapter = new DressRecyclerViewAdapter(MainActivityDress.this,allDressInfor);
        recyclerView.setAdapter(dressRecyclerViewAdapter);

    }


    private List <Dress> getAllDressInfor()
    {
        List<Dress> allDress = new ArrayList<>();

        allDress.add( new Dress ("Nude Dress ","RM 67",R.drawable.dressnude));
        allDress.add( new Dress("Black Dress","RM 80",R.drawable.dressblack) );
        allDress.add( new Dress("White Dress","RM 45",R.drawable.dresswhite));
        allDress.add( new Dress("White Dress 2 ","RM 54",R.drawable.dresswhite2));
        allDress.add( new Dress("Lilac Dress ","RM 76",R.drawable.dresslilac));
        allDress.add( new Dress("Red Dress ","RM 90",R.drawable.dressred));
        allDress.add( new Dress("Polcadot Dress ","RM 43",R.drawable.dresspolcadot));
        allDress.add( new Dress("Pink Dress","RM 23",R.drawable.dresspink));
        allDress.add( new Dress("Grey Dress","RM 67",R.drawable.dressgrey));
        allDress.add( new Dress("Green Dress","RM 89",R.drawable.dressgreen));



        return allDress;
    }


}
