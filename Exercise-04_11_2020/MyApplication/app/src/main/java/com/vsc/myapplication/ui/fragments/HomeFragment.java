package com.vsc.myapplication.ui.fragments;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vsc.myapplication.R;
import com.vsc.myapplication.data.local.database.StudentService;
import com.vsc.myapplication.data.local.database.models.Student;
import com.vsc.myapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private StudentService studentService;
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        studentService = new StudentService(getContext());
        setClickListeners();
    }

    private void setClickListeners() {
        binding.btnSave.setOnClickListener(v -> {
            String name = binding.edtName.getText().toString();
            int classNumber = Integer.parseInt(binding.edtClassNumber.getText().toString());
            float averageGrade = Float.parseFloat(binding.edtAverageGrade.getText().toString());

            Student student = new Student(name, classNumber, averageGrade);
            studentService.addStudent(student);

            binding.edtName.setText("");
            binding.edtClassNumber.setText("");
            binding.edtAverageGrade.setText("");
        });
    }
}
