// Puntos 1 al 4: Declaración, recorrido, modificación y búsqueda en arreglos
fun main() {
    // Declarar un arreglo de 10 enteros con valores aleatorios del 1 al 100
    val numeros = IntArray(10) { (1..100).random() }

    println("Arreglo inicializado con valores aleatorios:")
    println(numeros.joinToString(" "))

    // --- Punto 2: Recorrido e impresión ---

    // Recorrido con for clásico usando rango de índices
    println("\nRecorrido con for clásico:")
    for (i in numeros.indices) {
        println("  numeros[$i] = ${numeros[i]}")
    }

    // Recorrido con forEach (equivalente a for-each)
    println("\nRecorrido con forEach:")
    numeros.forEach { n -> print("$n ") }
    println()

    // --- Punto 3: Modificación ---

    // Cambiar todos los valores impares por cero
    val numerosModif = numeros.copyOf()
    println("\nCambio de impares a cero:")
    for (i in numerosModif.indices) {
        if (numerosModif[i] % 2 != 0) numerosModif[i] = 0
    }
    println(numerosModif.joinToString(" "))

    // Multiplicar todos los valores por su índice
    println("\nMultiplicación por índice:")
    for (i in numerosModif.indices) {
        numerosModif[i] *= i
    }
    println(numerosModif.joinToString(" "))

    // --- Punto 4: Búsqueda lineal ---
    val valorABuscar = numeros[(numeros.indices).random()]
    val posicion = busquedaLineal(numeros, valorABuscar)
    println("\nBuscar $valorABuscar en el arreglo original:")
    if (posicion != -1)
        println("  Valor $valorABuscar encontrado en el índice $posicion.")
    else
        println("  Valor $valorABuscar no encontrado.")
}

fun busquedaLineal(arreglo: IntArray, objetivo: Int): Int {
    for (i in arreglo.indices) {
        if (arreglo[i] == objetivo) return i
    }
    return -1
}
