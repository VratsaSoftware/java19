package com.vsc.myapplication.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vsc.myapplication.R;
import com.vsc.myapplication.data.local.database.models.Student;

import java.util.ArrayList;
import java.util.List;

public class NonGradeAStudentsAdapter extends RecyclerView.Adapter<NonGradeAStudentsAdapter.ViewHolder> {

    private List<Student> students;

    public NonGradeAStudentsAdapter() {
        students = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_non_grade_a_student, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = students.get(position);
//        holder.studentName.setText(student.name);
//        holder.studentClass.setText(String.valueOf(student.classNumber));
    }

    public void setStudents(List<Student> students) {
        this.students = students;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView studentName;
        TextView studentClass;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            studentName = itemView.findViewById(R.id.txtStudentName);
            studentClass = itemView.findViewById(R.id.txtStudentClass);
        }
    }
}
