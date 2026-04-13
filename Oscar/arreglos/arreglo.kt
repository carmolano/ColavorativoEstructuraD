// Punto 1: Declaración e inicialización de un arreglo con valores aleatorios
fun main() {
    // Declarar un arreglo de 10 enteros con valores aleatorios del 1 al 100
    val numeros = IntArray(10) { (1..100).random() }

    println("Arreglo inicializado con valores aleatorios:")
    println(numeros.joinToString(" "))
}
