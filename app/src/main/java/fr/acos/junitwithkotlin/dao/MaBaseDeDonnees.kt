package fr.acos.junitwithkotlin.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import fr.acos.junitwithkotlin.entities.Personne


@Database(entities = [(Personne::class)], version = 1)
abstract class MaBaseDeDonnees : RoomDatabase()
{
    abstract fun personneDao(): PersonneDao
}