package com.vsc.myapplication.data.local.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.vsc.myapplication.data.local.database.models.Student;

@Database(entities = {Student.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract StudentDao studentDao();
}
