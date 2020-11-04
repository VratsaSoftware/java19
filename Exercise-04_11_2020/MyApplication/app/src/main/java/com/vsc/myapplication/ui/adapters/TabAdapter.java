package com.vsc.myapplication.ui.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.vsc.myapplication.ui.fragments.Tab1Fragment;
import com.vsc.myapplication.ui.fragments.Tab2Fragment;

public class TabAdapter extends FragmentStateAdapter {

    public TabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new Tab1Fragment();
            case 1: return new Tab2Fragment();
            default: throw new IllegalArgumentException("There are not that much fragments");
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
