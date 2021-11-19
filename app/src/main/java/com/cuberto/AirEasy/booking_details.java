package com.cuberto.AirEasy;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.cuberto.AirEasy.AirEasy.FlightFragment;


public class booking_details extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView,ivFlight;
    TextView textView,tvFlight;

    LinearLayout llFlight;

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_details);

        imageView = findViewById(R.id.imgback);
        textView = findViewById(R.id.txtmobepay);

        textView.setText("Bookings");
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        fragment = new FlightFragment();
        loadFragment(fragment);


        ivFlight = findViewById(R.id.ivFlight);
        tvFlight = findViewById(R.id.tvFlight);
        llFlight = findViewById(R.id.llFlight);

        llFlight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Fragment fragment;

        switch (v.getId()){


            case R.id.llFlight:



                llFlight.setBackgroundResource(R.drawable.blue_rect3);
                tvFlight.setTextColor(Color.parseColor("#087cba"));

                fragment = new FlightFragment();
                loadFragment(fragment);

                break;
        }

    }

    /*load fragment method can be here*/

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framlayout, fragment);
        transaction.commit();
    }
}
