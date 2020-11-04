package com.vsc.myapplication.ui.activities;

import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;
import com.vsc.myapplication.R;
import com.vsc.myapplication.ui.fragments.AllStudentsFragment;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener,
    AllStudentsFragment.ActivityListener {

    private NavController navController;
    private DrawerLayout drawerLayout;
    private NavigationView navView;
    private Toolbar toolbar;

    private TextView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();
        setupToolbar();
        setupDrawerLayout();
        setClickListeners();
    }

    private void getViews() {
        navController = Navigation.findNavController(this, R.id.navHostFragment);
        drawerLayout = findViewById(R.id.drawerLayout);
        navView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.toolbar);
        menu = findViewById(R.id.txtMenu);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
    }

    private void setupDrawerLayout() {
        navView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
    }

    private void setClickListeners() {
        menu.setOnClickListener(v -> {
            drawerLayout.openDrawer(GravityCompat.START);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, drawerLayout);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                navigateTo(R.id.fragmentHome);
                return true;
            case R.id.menu_students:
                navigateTo(R.id.fragmentAllStudents);
                return true;
            case R.id.menu_separated_students:
                navigateTo(R.id.fragmentSeparatedStudents);
                return true;
            case R.id.menu_logout:
                finish();
                return true;
            default: return false;
        }
    }

    private void navigateTo(int actionId) {
        navController.navigate(actionId);
        drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void doSomething() {

    }
}
