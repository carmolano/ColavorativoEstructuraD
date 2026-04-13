// Puntos 1 y 2: Declaración, inicialización, recorrido e impresión de arreglos
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
}
