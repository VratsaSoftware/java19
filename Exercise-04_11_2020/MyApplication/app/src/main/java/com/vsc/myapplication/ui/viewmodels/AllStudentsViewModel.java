package com.vsc.myapplication.ui.viewmodels;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.vsc.myapplication.data.local.database.StudentService;
import com.vsc.myapplication.data.local.database.models.Student;

import java.util.List;

public class AllStudentsViewModel extends ViewModel {

    private MutableLiveData<List<Student>> students;
    private StudentService studentService;

    public AllStudentsViewModel() {
    }

    public void initStudentService(Context context) {
        studentService = new StudentService(context);
    }

    public LiveData<List<Student>> getStudents() {
        if (students == null) {
            students = new MutableLiveData<>();

            studentService.getAllStudents(students -> {
                Log.e("KKKK", "Fetched students: " + students.size());
                this.students.postValue(students);
            });
        }
        return students;
    }
}
