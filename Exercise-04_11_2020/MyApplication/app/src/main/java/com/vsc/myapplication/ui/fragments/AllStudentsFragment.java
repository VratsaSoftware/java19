package com.vsc.myapplication.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vsc.myapplication.data.local.database.models.Student;
import com.vsc.myapplication.databinding.FragmentAllStudentsBinding;
import com.vsc.myapplication.ui.adapters.AllStudentsAdapter;
import com.vsc.myapplication.ui.viewmodels.AllStudentsViewModel;

import java.util.ArrayList;
import java.util.List;

public class AllStudentsFragment extends Fragment implements AllStudentsAdapter.ClickListener {

    private ActivityListener activityListener;
    private AllStudentsAdapter adapter;
    private FragmentAllStudentsBinding binding;
    private AllStudentsViewModel allStudentsViewModel;
    private List<Student> selectedStudents;
    private MutableLiveData<Integer> selectedCount;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            activityListener = (ActivityListener) context;
        } catch (ClassCastException e) {
            Log.e("ASD", "cannot cast");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAllStudentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        selectedStudents = new ArrayList<>();
        selectedCount = new MutableLiveData<>();
        selectedCount.observe(getViewLifecycleOwner(), count ->
            binding.txtSelectedCount.setText(String.valueOf(count)));

        allStudentsViewModel = new ViewModelProvider(this).get(AllStudentsViewModel.class);
        allStudentsViewModel.initStudentService(getContext());

        binding.rvStudents.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new AllStudentsAdapter(this);
        binding.rvStudents.setAdapter(adapter);

        allStudentsViewModel.getStudents().observe(getViewLifecycleOwner(), students -> {
            adapter.setStudents(students);
        });

        activityListener.doSomething();
    }

    @Override
    public void onStudentClicked(Student student) {
        if (selectedStudents.contains(student)) {
            selectedStudents.remove(student);
        } else {
            selectedStudents.add(student);
        }

        Log.e("STUDENTS", selectedStudents.toString());
        selectedCount.setValue(selectedStudents.size());
    }

    public interface ActivityListener {
        void doSomething();
    }
}
