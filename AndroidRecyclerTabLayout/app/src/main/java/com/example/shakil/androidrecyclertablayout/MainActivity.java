package com.example.shakil.androidrecyclertablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.shakil.androidrecyclertablayout.Adapter.MyViewPagerAdapter;
import com.example.shakil.androidrecyclertablayout.Fragments.AmberFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.BlueFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.BlueGreyFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.BrownFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.CyanFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.DeepOrangeFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.DeepPurpleFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.GreenFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.GreyFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.IndigoFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.LightBlueFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.LightGreenFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.LimeFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.OrangeFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.PinkFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.PurpleFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.RedFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.TealFragment;
import com.example.shakil.androidrecyclertablayout.Fragments.YellowFragment;

public class MainActivity extends AppCompatActivity {

    CardView btn_red, btn_pink, btn_purple, btn_deep_purple, btn_indigo, btn_blue, btn_light_blue,
            btn_cyan, btn_teal, btn_green, btn_light_green, btn_lime, btn_yellow, btn_amber,
            btn_orange, btn_deep_orange, btn_brown, btn_grey, btn_blue_grey;

    ViewPager viewPager;
    MyViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_red = findViewById(R.id.btn_red);
        btn_pink = findViewById(R.id.btn_pink);
        btn_purple = findViewById(R.id.btn_purple);
        btn_deep_purple = findViewById(R.id.btn_deep_purple);
        btn_indigo = findViewById(R.id.btn_indigo);
        btn_blue = findViewById(R.id.btn_blue);
        btn_light_blue = findViewById(R.id.btn_light_blue);
        btn_cyan = findViewById(R.id.btn_cyan);
        btn_teal = findViewById(R.id.btn_teal);
        btn_green = findViewById(R.id.btn_green);
        btn_light_green = findViewById(R.id.btn_light_green);
        btn_lime = findViewById(R.id.btn_lime);
        btn_yellow = findViewById(R.id.btn_yellow);
        btn_amber = findViewById(R.id.btn_amber);
        btn_orange = findViewById(R.id.btn_orange);
        btn_deep_orange = findViewById(R.id.btn_deep_orange);
        btn_brown = findViewById(R.id.btn_brown);
        btn_grey = findViewById(R.id.btn_grey);
        btn_blue_grey = findViewById(R.id.btn_blue_grey);

        viewPager = findViewById(R.id.viewPager);
        adapter = new MyViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RedFragment());
        adapter.addFragment(new PinkFragment());
        adapter.addFragment(new PurpleFragment());
        adapter.addFragment(new DeepPurpleFragment());
        adapter.addFragment(new IndigoFragment());
        adapter.addFragment(new BlueFragment());
        adapter.addFragment(new LightBlueFragment());
        adapter.addFragment(new CyanFragment());
        adapter.addFragment(new TealFragment());
        adapter.addFragment(new GreenFragment());
        adapter.addFragment(new LightGreenFragment());
        adapter.addFragment(new LimeFragment());
        adapter.addFragment(new YellowFragment());
        adapter.addFragment(new AmberFragment());
        adapter.addFragment(new OrangeFragment());
        adapter.addFragment(new DeepOrangeFragment());
        adapter.addFragment(new BrownFragment());
        adapter.addFragment(new GreyFragment());
        adapter.addFragment(new BlueGreyFragment());

        viewPager.setAdapter(adapter);

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        btn_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        btn_deep_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        btn_indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(5);
            }
        });

        btn_light_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(6);
            }
        });

        btn_cyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(7);
            }
        });

        btn_teal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(8);
            }
        });

        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(9);
            }
        });

        btn_light_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(10);
            }
        });

        btn_lime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(11);
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(12);
            }
        });

        btn_amber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(13);
            }
        });

        btn_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(14);
            }
        });

        btn_deep_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(15);
            }
        });

        btn_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(16);
            }
        });

        btn_grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(17);
            }
        });

        btn_blue_grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(18);
            }
        });
    }
}
