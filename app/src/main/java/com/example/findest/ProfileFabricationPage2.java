package com.example.findest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileFabricationPage2 extends AppCompatActivity {

    RelativeLayout page1, page2;
    CardView graduate_card;

    TextView selected_heading, selected_card, next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_fabrication_page2);

        graduate_card = findViewById(R.id.graduate_card);

        page1 = findViewById(R.id.relativeLayout);
        page2 = findViewById(R.id.relativeLayout2);

        selected_heading = findViewById(R.id.selected_heading);
        selected_card = findViewById(R.id.selected_card);

        next_button = findViewById(R.id.next_button);

        graduate_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page1.setVisibility(View.GONE);
                page2.setVisibility(View.VISIBLE);
                selected_heading.setVisibility(View.VISIBLE);
                selected_card.setVisibility(View.VISIBLE);
            }
        });

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileFabricationPage2.this, "Next clicked!", Toast.LENGTH_SHORT).show();;
            }
        });


    }
}