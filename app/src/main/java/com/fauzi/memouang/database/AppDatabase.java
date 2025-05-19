package com.fauzi.memouang.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.fauzi.memouang.database.dao.DatabaseDao;
import com.fauzi.memouang.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}