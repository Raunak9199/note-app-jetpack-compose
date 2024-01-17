package com.example.mynoteapp.di

import android.content.Context
import androidx.room.Room
import com.example.mynoteapp.data.NoteDataBase
import com.example.mynoteapp.data.NoteDatabaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Singleton
    @Provides
    fun provideNotesDao(noteDataBase: NoteDataBase): NoteDatabaseDao = noteDataBase.noteDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): NoteDataBase =
        Room.databaseBuilder(
            context,
            NoteDataBase::class.java,
            "note_db"
        )
            .fallbackToDestructiveMigration()
            .build()
}