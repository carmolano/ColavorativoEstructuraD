// Punto 1: Declaración e inicialización de un arreglo con valores aleatorios
import 'dart:math';

void main() {
  final random = Random();

  // Declarar una lista de 10 enteros con valores aleatorios del 1 al 100
  List<int> numeros = List.generate(10, (_) => random.nextInt(100) + 1);

  print("Arreglo inicializado con valores aleatorios:");
  print(numeros.join(" "));
}
