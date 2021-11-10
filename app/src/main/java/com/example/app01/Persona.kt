package com.example.app01

class Persona(val name: String, val lastname: String, val age: Int) {
    fun mayorMenor() {
        if (age >= 18) {
            println("$name $lastname es mayor de edad")
        } else {
            println("$name $lastname es menor de edad")
        }
    }
}