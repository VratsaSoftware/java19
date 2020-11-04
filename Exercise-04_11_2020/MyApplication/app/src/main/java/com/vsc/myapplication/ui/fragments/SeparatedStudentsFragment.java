package com.vsc.myapplication.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.vsc.myapplication.R;
import com.vsc.myapplication.databinding.FragmentSeparatedStudentsBinding;
import com.vsc.myapplication.ui.adapters.TabAdapter;

public class SeparatedStudentsFragment extends Fragment {

    private FragmentSeparatedStudentsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSeparatedStudentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TabAdapter fragementAdapter = new TabAdapter(getActivity().getSupportFragmentManager(), getLifecycle());

        binding.viewpager.setAdapter(fragementAdapter);
        binding.viewpager.setUserInputEnabled(false);
        TabLayoutMediator mediator = new TabLayoutMediator(binding.tabs, binding.viewpager, (tab, position) -> {
            Log.e("ASDASD", "" + position);
            tab.setText("Title " + position);
        });
        mediator.attach();
    }
}
