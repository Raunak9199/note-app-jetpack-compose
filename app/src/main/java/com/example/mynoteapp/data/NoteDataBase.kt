package com.example.mynoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.mynoteapp.model.Note
import com.example.mynoteapp.utils.DateConverter
import com.example.mynoteapp.utils.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDataBase : RoomDatabase(){
    abstract fun noteDao(): NoteDatabaseDao
}