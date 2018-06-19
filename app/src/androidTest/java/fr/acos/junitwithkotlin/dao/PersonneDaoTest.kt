package fr.acos.junitwithkotlin.dao

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import fr.acos.junitwithkotlin.entities.Personne
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith

/**
 * Classe permettant de tester la classe PersonneDao.
 * L'annotation @RunWith(AndroidJUnit4::class) indique que les test doivent être effetués par JUnit.
 */
@RunWith(AndroidJUnit4::class)
class PersonneDaoTest
{

    private var personneDao: PersonneDao? = null
    private var bdd: MaBaseDeDonnees? = null

    /**
     * Fonction exécutée avant tout les tests.
     */
    @Before
    fun createDb()
    {
        val context = InstrumentationRegistry.getTargetContext()
        bdd = Room.inMemoryDatabaseBuilder(context, MaBaseDeDonnees::class.java!!).build()
        personneDao = bdd!!.personneDao()
    }

    /**
     * Fonction exécutée après tout les tests
     */
    @After
    fun closeDb() {
        bdd!!.close()
    }

    /**
     * Fonction de test.
     */
    @Test
    fun insertAndGetByNameTest()
    {
        val user = Personne(0,"Cosson","Barbara")
        personneDao!!.insertAll(user)
        val byName = personneDao!!.get("Cosson")
        assertEquals(user.nom, byName.nom)
        assertEquals(user.prenom, byName.prenom)
    }
}