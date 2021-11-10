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
        //listadoParalelo()

        // Presentar las propiedades de un vehículo utilizando clases, como tracción, motor,
        // tipo de vehículo, capacidad
        //propiedadesVehiculo()

        // Algoritmo para ordenar un array
        //ordenarArray()

        // Validación de cedula
        validarCedula()
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

    private fun ordenarArray() {
        val arrayNumeros = arrayListOf(1, 4, 5, 2, 6, 8, 9)
        var aux = 0

        for (i in 0 until arrayNumeros.size) {
            for (j in 0 until (arrayNumeros.size - 1)) {
                if (arrayNumeros[j + 1] < arrayNumeros[j]) {
                    aux = arrayNumeros[j + 1]
                    arrayNumeros[j + 1] = arrayNumeros[j]
                    arrayNumeros[j] = aux
                }
            }
        }
        println("Array ordenado: ")
        for(x in arrayNumeros) {
            println(x)
        }

    }

    private fun validarCedula() {
        val cedula = "1900419183"
        val arrayCedula = arrayListOf<Int>()
        val arrayNValidar = arrayListOf(2, 1, 2, 1, 2, 1, 2, 1, 2)
        var multiplicar = 0
        var numeroString = ""
        var sumarArray = arrayListOf<Int>()
        var sumar = 0
        var resultadoValidacion = ""
        var respuesta = 0

        println("VALIDACIÓN DE CEDULA")
        for (x in cedula) {
            arrayCedula.add(Character.getNumericValue(x))
            print("$x ")
        }
        print("\n")

        for (i in arrayNValidar) {
            print("$i ")
        }
        print("\n-------------------------\n")

        for (j in 0 until arrayNValidar.size){
            multiplicar = arrayCedula[j] * arrayNValidar[j]
            if (multiplicar >= 10) {
                numeroString = multiplicar.toString()
                sumarArray.add(Character.getNumericValue(numeroString[0]) +
                        Character.getNumericValue(numeroString[1]))
            } else {
                sumarArray.add(multiplicar)
            }
        }

        for (s in sumarArray) {
            sumar += s
            print("$s ")
        }

        resultadoValidacion = "$sumar - "
        if (sumar <= 10 && sumar > 0) {
            resultadoValidacion += "10 = "
            respuesta = (sumar - 10) * -1
        } else if (sumar <= 20 && sumar > 10) {
            resultadoValidacion += "20 = "
            respuesta = (sumar - 20) * -1
        } else if (sumar <= 30 && sumar > 20) {
            resultadoValidacion += "30 = "
            respuesta = (sumar - 30) * -1
        } else if (sumar <= 40 && sumar > 30) {
            resultadoValidacion += "40 = "
            respuesta = (sumar - 40) * -1
        } else if (sumar <= 50 && sumar > 40) {
            resultadoValidacion += "50 = "
            respuesta = (sumar - 50) * -1
        } else if (sumar <= 60 && sumar > 50) {
            resultadoValidacion += "60 = "
            respuesta = (sumar - 60) * -1
        } else if (sumar <= 70 && sumar > 60) {
            resultadoValidacion += "70 = "
            respuesta = (sumar - 70) * -1
        } else if (sumar <= 80 && sumar > 70) {
            resultadoValidacion += "80 = "
            respuesta = (sumar - 80) * -1
        } else if (sumar <= 90 && sumar > 80) {
            resultadoValidacion += "90 = "
            respuesta = (sumar - 90) * -1
        } else if (sumar <= 100 && sumar > 90) {
            resultadoValidacion += "100 = "
            respuesta = (sumar - 100) * -1
        }

        print("\nResultado: $resultadoValidacion$respuesta\n")

        if (arrayCedula[arrayCedula.size - 1] == respuesta) {
            print("LA CEDULA ES CORRECTA\n")
        } else {
            print("LA CEDULA ES INCORRECTA\n")
        }
        println("Por qué " + arrayCedula[arrayCedula.size - 1] + " = $respuesta")

    }
}