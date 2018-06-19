package fr.acos.junitwithkotlin.dao

import android.arch.persistence.room.*
import fr.acos.junitwithkotlin.entities.Personne

@Dao
interface PersonneDao {

    @Query("SELECT * FROM personnes WHERE nom = :nom")
    fun get(nom: String): Personne

    @Insert
    fun insertAll(vararg listCategories: Personne)
}