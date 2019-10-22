package com.example.fandomheroesandroid

import java.io.Serializable

data class Hero(
    val name: String = "",
    val powerType: String = "",
    val age: String = "",
    val imgRes: Int = -1
) : Serializable