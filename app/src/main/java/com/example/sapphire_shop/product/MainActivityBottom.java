package com.example.sapphire_shop.product;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sapphire_shop.R;
import com.example.sapphire_shop.adapter.BottomRecyclerViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivityBottom extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bottom);

        FloatingActionButton floatingactionbutton = findViewById(R.id.fab);
        floatingactionbutton.bringToFront();
        floatingactionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerView3 = findViewById(R.id.recycler_view3);

        linearLayoutManager = new LinearLayoutManager(MainActivityBottom.this);
        recyclerView3.setLayoutManager(linearLayoutManager);

        List<Bottom> allBottomInfor = getAllBottomInfor();
        BottomRecyclerViewAdapter bottomRecyclerViewAdapter;
        bottomRecyclerViewAdapter = new BottomRecyclerViewAdapter(MainActivityBottom.this,allBottomInfor);
        recyclerView3.setAdapter(bottomRecyclerViewAdapter);

    }

    private List <Bottom> getAllBottomInfor()
    {
        List<Bottom> allBottom = new ArrayList<>();

        allBottom.add( new Bottom("Angel Short", "RM 45", R.drawable.angelshorts));
        allBottom.add( new Bottom("Denim Skirt","RM 38",R.drawable.basicminidenimskirt) );
        allBottom.add( new Bottom("Denim Short","RM 67",R.drawable.freayeddenimshorts));
        allBottom.add( new Bottom("High Mom Shorts","RM 89",R.drawable.highmomdenimshorts));
        allBottom.add( new Bottom("High Waist skirt","RM 54",R.drawable.judohighwaistpaperbagskirt));
        allBottom.add( new Bottom("Sweat pants","RM 72",R.drawable.luxemensweatpant));
        allBottom.add( new Bottom("Low Layered Skirt","RM 56",R.drawable.rosepinkhighlowlayeredkirt));
        allBottom.add( new Bottom("Running Short","RM 76",R.drawable.womendriditrunningshort));
        allBottom.add( new Bottom("Printed Track Pants","RM 90",R.drawable.t7printedtrackpants));




        return allBottom;
    }
}
