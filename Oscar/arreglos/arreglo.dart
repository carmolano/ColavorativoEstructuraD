// Puntos 1 al 4: Declaración, recorrido, modificación y búsqueda en arreglos
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

  // --- Punto 3: Modificación ---

  // Cambiar todos los valores impares por cero
  List<int> numerosModif = List.from(numeros);
  print("\nCambio de impares a cero:");
  for (int i = 0; i < numerosModif.length; i++) {
    if (numerosModif[i] % 2 != 0) numerosModif[i] = 0;
  }
  print(numerosModif.join(" "));

  // Multiplicar todos los valores por su índice
  print("\nMultiplicación por índice:");
  for (int i = 0; i < numerosModif.length; i++) {
    numerosModif[i] *= i;
  }
  print(numerosModif.join(" "));

  // --- Punto 4: Búsqueda lineal ---
  int valorABuscar = numeros[random.nextInt(numeros.length)];
  int posicion = busquedaLineal(numeros, valorABuscar);
  print("\nBuscar $valorABuscar en el arreglo original:");
  if (posicion != -1) {
    print("  Valor $valorABuscar encontrado en el índice $posicion.");
  } else {
    print("  Valor $valorABuscar no encontrado.");
  }
}

int busquedaLineal(List<int> arreglo, int objetivo) {
  for (int i = 0; i < arreglo.length; i++) {
    if (arreglo[i] == objetivo) return i;
  }
  return -1;
}
