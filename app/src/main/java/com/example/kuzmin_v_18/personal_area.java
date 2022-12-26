package com.example.kuzmin_v_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class personal_area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
        ImageView logout = findViewById(R.id.imageView2);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(personal_area.this, login.class);
                personal_area.this.startActivity(logout);
            }
        });
        ImageView outre = findViewById(R.id.imageView3);
                outre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent outre = new Intent(personal_area.this, notice.class);
                    }
                });
        Button call = findViewById(R.id.button2);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+7 901 671 45 74"));
                personal_area.this.startActivity(call);
            }
        });
    }
}