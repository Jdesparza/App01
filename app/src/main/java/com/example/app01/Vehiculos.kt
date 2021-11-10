package com.example.app01

class Vehiculos(
    val traccion: String, val motor: String, val tipoVehiculo: Tipo,
    val capacidad: Int, val color: String) {
    enum class Tipo{
        Autobus,
        Camión,
        Automovil
    }

    fun propiedades() {
        println("Propiedades del vehiculo: ")
        println("Tracción: $traccion\nMotor: $motor\nTipo de vehículo: $tipoVehiculo\n" +
                "Capacidad: $capacidad\nColor: $color")
    }
}