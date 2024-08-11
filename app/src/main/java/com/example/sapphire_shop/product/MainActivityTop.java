package com.example.sapphire_shop.product;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.adapter.TopRecyclerViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivityTop extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_top);

        FloatingActionButton floatingactionbutton = findViewById(R.id.fab);
        floatingactionbutton.bringToFront();
        floatingactionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerView2 = findViewById(R.id.recycler_view2);

        linearLayoutManager = new LinearLayoutManager(MainActivityTop.this);
        recyclerView2.setLayoutManager(linearLayoutManager);


        List< Top> allTopInfor = getAllTopInfor();
        TopRecyclerViewAdapter topRecyclerViewAdapter = new TopRecyclerViewAdapter(MainActivityTop.this,allTopInfor);
        recyclerView2.setAdapter(topRecyclerViewAdapter);

    }

    private List <Top> getAllTopInfor()
    {
        List<Top> allTop= new ArrayList<>();

        allTop.add( new Top ("Adidas Black shirt ","RM 200",R.drawable.adidasoriginallockuptee));
        allTop.add( new Top("Adidas Men shirt","RM 239",R.drawable.adventuremountainbacktshirt) );
        allTop.add( new Top("Back Button Shirt","RM 56",R.drawable.backbuttonedshirt));
        allTop.add( new Top("Checkered Shirt","RM 78",R.drawable.longsleevecheckeredshirt));
        allTop.add( new Top("Leila Top","RM 213",R.drawable.longsleeveleilatop));
        allTop.add( new Top("Oxford Shirt ","RM 76",R.drawable.longsleeveoxfordshirt));
        allTop.add( new Top("Viscose Shirt ","RM 89",R.drawable.longsleeveviscoseshirt));
        allTop.add( new Top("Metal Button Shirt","RM 243",R.drawable.metalbuttondoublepocketshirt));
        allTop.add( new Top("Pinup Shirt","RM 134",R.drawable.sexypinupshirt));
        allTop.add( new Top("Floria Tee","RM 87",R.drawable.shortsleevefloriatee));



        return allTop;
    }

}
