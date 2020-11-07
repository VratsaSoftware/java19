package com.example.architecturedemo.view.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.architecturedemo.R;
import com.example.architecturedemo.databinding.FragmentMainBinding;
import com.example.architecturedemo.presenter.MainPresenter;

public class MainFragment extends Fragment {

    private FragmentMainBinding binding;
    private MainPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        return binding.getRoot();
    }
}