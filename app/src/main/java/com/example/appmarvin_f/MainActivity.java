package com.example.appmarvin_f;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.appmarvin_f.ui.main.SectionsPagerAdapter;
import com.example.appmarvin_f.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        // tabs es la variable del TabLayout.
        // Y en esta parte Mostarmos cada icono en cada tab item del tabLayout.
        tabs.getTabAt(0).setIcon(R.drawable.persona);
        tabs.getTabAt(1).setIcon(R.drawable.academica);
        tabs.getTabAt(2).setIcon(R.drawable.redes);
    }
}