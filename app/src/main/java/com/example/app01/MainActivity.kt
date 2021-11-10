package com.example.app01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Validar si una persona es mayor o menor de edad
        //validarEdad()

        // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente
        //tablaMultiplicar()

        // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos
        // por proyectos (Mostrar los resultados ordenados).
        listadoParalelo()

        // Presentar las propiedades de un vehículo utilizando clases, como tracción, motor,
        // tipo de vehículo, capacidad
        //propiedadesVehiculo()
    }

    private fun validarEdad() {
        val persona1 = Persona(name = "Alex", lastname = "Romero", age = 18)
        persona1.mayorMenor()
    }

    private fun tablaMultiplicar() {
        var tabla = 9

        // Ascendente
        println("Tabla del $tabla de forma Ascendente")
        for (i in 0..12) {
            println("$tabla * $i = " + tabla * i)
        }

        // Descendente
        println("Tabla del $tabla de forma Descendente")
        for (i in 12 downTo 0) {
            println("$tabla * $i = " + tabla * i)
        }
    }

    private fun listadoParalelo() {
        val listado = listOf(
            "Joan Briceño", "Jeferson Cueva", "Jordy Esparza", "Ricardo Freire",
            "Santiago Garcia", "Edgar Guamo", "Erick Jaramillo", "Daniel Medina", "Ian Ortega",
            "David Pillco"
        )

        val subgrupo = mutableMapOf(
            "Joan Briceño" to 1, "Jeferson Cueva" to 1, "Jordy Esparza"
                    to 2, "Ricardo Freire" to 2, "Santiago Garcia" to 2, "Edgar Guamo" to 3,
            "Erick Jaramillo" to 1, "Daniel Medina" to 3, "Ian Ortega" to 4, "David Pillco"
                    to 4
        )


        // Listado ordenado
        val listadoOrdenado = listado.sorted()

        println("listado ordenado")
        for (lista in listadoOrdenado) {
            println(lista)
        }


        // subgrupo ordenado por key
        val subgrupoOrdenado = subgrupo.toSortedMap()
        // subgrupo ordenado por value
        val subgrupoOrdenado2 = subgrupo.toList().sortedBy { (k, v) -> v }.toMap()

        println("subgrupo ordenado")
        for (sub in subgrupoOrdenado) {
            println("${sub.key} - ${sub.value}")
        }

    }

    private fun propiedadesVehiculo() {
        val vehiculo1 = Vehiculos("4x4", "doble cilindro",
            Vehiculos.Tipo.Automovil, 4, "rojo")

        val vehiculo2 = Vehiculos("4WD", "alternativo",
            Vehiculos.Tipo.Autobus, 21, "azul")

        vehiculo1.propiedades()
    }
}