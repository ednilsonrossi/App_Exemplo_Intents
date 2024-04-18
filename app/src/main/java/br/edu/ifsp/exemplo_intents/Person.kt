package br.edu.ifsp.exemplo_intents

import java.io.Serializable
import java.time.LocalDate

class Person(val yearBird: Int) : Serializable {

    fun getAge() = LocalDate.now().year - yearBird

}