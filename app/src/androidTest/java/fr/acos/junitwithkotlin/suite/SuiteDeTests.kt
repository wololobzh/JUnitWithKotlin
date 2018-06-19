package fr.acos.junitwithkotlin.suite

import fr.acos.junitwithkotlin.ExampleInstrumentedTest
import fr.acos.junitwithkotlin.dao.PersonneDaoTest
import org.junit.runners.Suite
import org.junit.runner.RunWith

/**
 * Classe représentant une suite de tests.
 *
 * La suite de tests contient les tests des classes de test PersonneDaoTest et ExampleInstrumentedTest
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(PersonneDaoTest::class, ExampleInstrumentedTest::class)
class SuiteDeTests