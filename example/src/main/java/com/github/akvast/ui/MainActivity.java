package com.github.akvast.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.github.akvast.R;
import com.github.akvast.databinding.ActivityMainBinding;
import com.github.akvast.ui.adapter.MainAdapter;
import com.github.akvast.ui.adapter.NavigationAdapter;

public class MainActivity extends AppCompatActivity {

    private final MainAdapter mMainAdapter = new MainAdapter();
    private final NavigationAdapter mNavigationAdapter = new NavigationAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setSupportActionBar(binding.toolbar);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                binding.toolbar,
                0,
                0);
        drawerToggle.syncState();

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(mMainAdapter);

        binding.navigationRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.navigationRecyclerView.setAdapter(mNavigationAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMainAdapter.reload();
        mNavigationAdapter.reload();
    }

}
