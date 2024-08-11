package com.example.sapphire_shop.product;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sapphire_shop.R;

public class ShoesDetailActivity extends AppCompatActivity {

    Button btnAdd, btnMinus, btnAddCart;
    TextView tvQuantity, tvSize;
    LinearLayout ll_setting_size;
    int quantity;

    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    String SP_SIZE ="size";

    String[ ] values ={"35","36","37","38","39"};

    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoes_detail_activity);

        tvSize = findViewById(R.id.tv_size_alp);
        ll_setting_size = findViewById(R.id.ll_setting_size);

        sharedPref = getSharedPreferences("app_settings", MODE_PRIVATE);
        editor = sharedPref.edit();

        tvSize.setText(values[sharedPref.getInt(SP_SIZE, 0)]);

        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);
        tvQuantity = findViewById(R.id.tv_qt_num);
        btnAddCart = findViewById(R.id.btn_AddCart);


        quantity = 1;

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                tvQuantity.setText("" + quantity);


            }

        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity--;
                tvQuantity.setText("" + quantity);

            }
        });

        Intent intent = getIntent();

        TextView tvName = findViewById(R.id.tv_shoes_detail);
        tvName.setText(intent.getStringExtra("Shoes Name "));

        TextView tvPrice = findViewById(R.id.tv_price_alp);
        tvPrice.setText(intent.getStringExtra("Price "));

        ll_setting_size.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ShowSizeOptions();
            }
        });

        btnAddCart.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick (View view){


                // Toast.makeText(BottomDetailActivity.this, "Thank You  for order: " + quantity, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ShoesDetailActivity.this,BottomCheckOut.class);
                Toast.makeText(ShoesDetailActivity.this, "Added to cart list", Toast.LENGTH_SHORT).show();
                intent.putExtra("quantity",quantity);

                startActivity(intent);


            }

        });

    }

    private void ShowSizeOptions() {

        AlertDialog.Builder builder = new AlertDialog.Builder(ShoesDetailActivity.this);
        builder.setTitle("Select your Size");
        builder.setSingleChoiceItems(values, sharedPref.getInt(SP_SIZE, 0), new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                switch (i) {
                    case 0:
                        editor.putInt(SP_SIZE, 0);
                        editor.commit();
                        break;

                    case 1:
                        editor.putInt(SP_SIZE, 1);
                        editor.commit();
                        break;

                    case 2:
                        editor.putInt(SP_SIZE, 2);
                        editor.commit();
                        break;

                    case 3:
                        editor.putInt(SP_SIZE, 3);
                        editor.commit();
                        break;

                    case 4:
                        editor.putInt(SP_SIZE, 4);
                        editor.commit();
                        break;

                }

                alertDialog.dismiss();
                tvSize.setText(values[sharedPref.getInt(SP_SIZE, 0)]);

            }

        });

        alertDialog = builder.create();
        alertDialog.show();

    }
}
