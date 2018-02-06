package com.example.ansh.kotlinplayground.dataclasses.inheritance

/**
 * Created by ansh on 06/02/18.
 */
interface Person {
    val name: String
    val age: Int
    val email: String

    fun hasResponsibilities(): Boolean
}

data class Adult(override val name: String, override val age: Int, override val email: String) : Person {
    val isMarried: Boolean = false
    val hasKids: Boolean = false
    override fun hasResponsibilities(): Boolean = true
}

data class Child(override val name: String, override val age: Int, override val email: String = "") : Person {
    override fun hasResponsibilities(): Boolean = false
}