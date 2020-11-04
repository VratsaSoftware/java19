package com.vsc.myapplication.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vsc.myapplication.data.local.database.StudentService;
import com.vsc.myapplication.databinding.FragmentNonGradeAStudentsBinding;
import com.vsc.myapplication.ui.adapters.NonGradeAStudentsAdapter;

public class Tab2Fragment extends Fragment {

    private FragmentNonGradeAStudentsBinding binding;
    private StudentService studentService;

    private NonGradeAStudentsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNonGradeAStudentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        studentService = new StudentService(getContext());
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        binding.rvStudents.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new NonGradeAStudentsAdapter();
        binding.rvStudents.setAdapter(adapter);

        getNonGradeAStudents();
    }

    private void getNonGradeAStudents() {
        studentService.getAllNonGradeAStudents(data -> adapter.setStudents(data));
    }
}
