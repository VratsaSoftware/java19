package com.vsc.myapplication.ui.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vsc.myapplication.R;
import com.vsc.myapplication.databinding.FragmentGradeAStudentsBinding;

public class Tab1Fragment extends Fragment {

    private FragmentGradeAStudentsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentGradeAStudentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
