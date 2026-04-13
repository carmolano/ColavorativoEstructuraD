# Puntos 1 al 4: Declaración, recorrido, modificación y búsqueda en arreglos
import random

# Declarar una lista de 10 enteros con valores aleatorios del 1 al 100
numeros = [random.randint(1, 100) for _ in range(10)]

print("Arreglo inicializado con valores aleatorios:")
print(" ".join(map(str, numeros)))

# --- Punto 2: Recorrido e impresión ---

# Recorrido con for clásico (usando índice)
print("\nRecorrido con for clásico:")
for i in range(len(numeros)):
    print(f"  numeros[{i}] = {numeros[i]}")

# Recorrido for-each (iteración directa sobre elementos)
print("\nRecorrido for-each:")
for n in numeros:
    print(n, end=" ")
print()

# --- Punto 3: Modificación ---

# Cambiar todos los valores impares por cero (copia para no alterar el original)
numeros_modif = numeros[:]
print("\nCambio de impares a cero:")
for i in range(len(numeros_modif)):
    if numeros_modif[i] % 2 != 0:
        numeros_modif[i] = 0
print(" ".join(map(str, numeros_modif)))

# Multiplicar todos los valores por su índice
print("\nMultiplicación por índice:")
for i in range(len(numeros_modif)):
    numeros_modif[i] *= i
print(" ".join(map(str, numeros_modif)))

# --- Punto 4: Búsqueda lineal ---
def busqueda_lineal(arreglo, objetivo):
    for i in range(len(arreglo)):
        if arreglo[i] == objetivo:
            return i  # Índice encontrado
    return -1  # No encontrado

import random as _random
valor_a_buscar = numeros[_random.randint(0, len(numeros) - 1)]
posicion = busqueda_lineal(numeros, valor_a_buscar)
print(f"\nBuscar {valor_a_buscar} en el arreglo original:")
if posicion != -1:
    print(f"  Valor {valor_a_buscar} encontrado en el índice {posicion}.")
else:
    print(f"  Valor {valor_a_buscar} no encontrado.")
