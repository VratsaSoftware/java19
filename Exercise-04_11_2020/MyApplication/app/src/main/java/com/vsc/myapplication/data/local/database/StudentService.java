package com.vsc.myapplication.data.local.database;

import android.content.Context;
import android.os.AsyncTask;
import com.vsc.myapplication.data.local.database.models.Student;

import java.util.List;

public class StudentService {

    private final StudentDao studentDao;

    public StudentService(Context context) {
        studentDao = Database.getInstance(context).studentDao();
    }

    public void getAllStudents(DataListener<List<Student>> dataListener) {
        new AsyncTask<Void, Void, List<Student>>() {

            @Override
            protected List<Student> doInBackground(Void... voids) {
                return studentDao.getAll();
            }

            @Override
            protected void onPostExecute(List<Student> students) {
                dataListener.onData(students);
                super.onPostExecute(students);
            }
        }.execute();
    }

    public void getAllNonGradeAStudents(DataListener<List<Student>> dataListener) {
        new AsyncTask<Void, Void, List<Student>>() {

            @Override
            protected List<Student> doInBackground(Void... voids) {
                return studentDao.getAllNonGradeA();
            }

            @Override
            protected void onPostExecute(List<Student> students) {
                dataListener.onData(students);
                super.onPostExecute(students);
            }
        }.execute();
    }

    public void addStudent(Student student) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                studentDao.insertAll(student);
                return null;
            }
        }.execute();
    }

    public interface DataListener<T> {
        void onData(T data);
    }
}
