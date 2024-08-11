package com.example.sapphire_shop.product;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.sapphire_shop.R;

public class DressCheckOut extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgBtnEmail;
    TextView tvQuantity, tvSize;
    String name;
    int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_check_out);

        imgBtnEmail = findViewById(R.id.img_btn_Email);

        tvSize = findViewById(R.id.tv_size_order);
        tvQuantity= findViewById(R.id.tv_quantity_num);

        Intent intent = getIntent();
        quantity = intent.getIntExtra("quantity",0);

        tvQuantity.setText("" + quantity);


        //tvName.setText(name);
        tvQuantity.setText(""+quantity);

        imgBtnEmail.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int img_btn_email = R.id.img_btn_Email;

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your order from Sapphire Shop");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message. Information about order.");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sapphire@company.com"});

        if(emailIntent.resolveActivity(getPackageManager())!=null) {
            startActivity(emailIntent);
        }
        else {
            Toast.makeText(DressCheckOut.this, "Sorry, no app can handle this action and data", Toast.LENGTH_SHORT).show();
        }

    }
}