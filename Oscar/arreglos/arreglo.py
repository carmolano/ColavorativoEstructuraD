# Puntos 1 y 2: Declaración, inicialización, recorrido e impresión de arreglos
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
