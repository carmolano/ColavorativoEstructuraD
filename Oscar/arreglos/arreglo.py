# Puntos 1, 2 y 3: Declaración, recorrido y modificación de arreglos
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
