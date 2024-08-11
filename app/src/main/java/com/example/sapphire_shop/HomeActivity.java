package com.example.sapphire_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sapphire_shop.product.MainActivityBottom;
import com.example.sapphire_shop.product.MainActivityDress;
import com.example.sapphire_shop.product.MainActivityShoes;
import com.example.sapphire_shop.product.MainActivityTop;


public class HomeActivity extends AppCompatActivity {


    Button btnTop,btnBottom,btnDress,btnShoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnTop = findViewById(R.id.btn_top);
        btnBottom= findViewById(R.id.btn_bottom);
        btnDress = findViewById(R.id.btn_dress);
        btnShoes = findViewById(R.id.btn_shoes);


        btnDress.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                Toast.makeText(HomeActivity.this, "Browsing Dress", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, MainActivityDress.class));



            }
        });

        btnTop.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                Toast.makeText(HomeActivity.this, " Browsing Top " , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, MainActivityTop.class));

                // Intent intent = new Intent(MainActivity.this,TopDetailActivity.class);
                //startActivity(intent);



            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                Toast.makeText(HomeActivity.this, " Browsing Bottom" , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, MainActivityBottom.class));

                // Intent intent = new Intent(MainActivity.this,TopDetailActivity.class);
                //startActivity(intent);



            }
        });

        btnShoes.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                Toast.makeText(HomeActivity.this, " Browsing Shoes" , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, MainActivityShoes.class));

                // Intent intent = new Intent(MainActivity.this,TopDetailActivity.class);
                //startActivity(intent);



            }
        });





    }





}

