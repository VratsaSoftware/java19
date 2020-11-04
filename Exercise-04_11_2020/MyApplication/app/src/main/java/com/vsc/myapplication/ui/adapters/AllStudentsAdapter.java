package com.vsc.myapplication.ui.adapters;

import android.content.res.Resources;
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

public class AllStudentsAdapter extends RecyclerView.Adapter<AllStudentsAdapter.ViewHolder> {

    private List<Student> students;
    private final ClickListener listener;

    public AllStudentsAdapter(ClickListener listener) {
        this.listener = listener;
        students = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_student, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = students.get(position);
        holder.name.setText(student.name);
        holder.averageGrade.setText(String.valueOf(student.averageGrade));

        holder.itemView.setOnClickListener(v -> {
            listener.onStudentClicked(student);

            boolean isSelected = holder.itemView.isSelected();
            holder.itemView.setSelected(!isSelected);

            Resources resources = holder.itemView.getResources();
            if (holder.itemView.isSelected()) {
                holder.itemView.setBackgroundColor(resources.getColor(R.color.selected_student, resources.newTheme()));
            } else {
                holder.itemView.setBackgroundColor(resources.getColor(R.color.white, resources.newTheme()));
            }
        });
    }

    public void setStudents(List<Student > students) {
        this.students = students;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView averageGrade;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtStudentName);
            averageGrade = itemView.findViewById(R.id.txtAverageGrade);
        }
    }

    public interface ClickListener {
        void onStudentClicked(Student student);
    }
}
