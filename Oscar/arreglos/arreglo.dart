// Puntos 1 y 2: Declaración, inicialización, recorrido e impresión de arreglos
import 'dart:math';
import 'dart:io';

void main() {
  final random = Random();

  // Declarar una lista de 10 enteros con valores aleatorios del 1 al 100
  List<int> numeros = List.generate(10, (_) => random.nextInt(100) + 1);

  print("Arreglo inicializado con valores aleatorios:");
  print(numeros.join(" "));

  // --- Punto 2: Recorrido e impresión ---

  // Recorrido con for clásico
  print("\nRecorrido con for clásico:");
  for (int i = 0; i < numeros.length; i++) {
    print("  numeros[$i] = ${numeros[i]}");
  }

  // Recorrido con for-in (equivalente a for-each en Dart)
  print("\nRecorrido con for-in:");
  for (int n in numeros) {
    stdout.write("$n ");
  }
  print("");
}
