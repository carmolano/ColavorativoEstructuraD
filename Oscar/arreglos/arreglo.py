# Punto 1: Declaración e inicialización de un arreglo con valores aleatorios
import random

# Declarar una lista de 10 enteros con valores aleatorios del 1 al 100
numeros = [random.randint(1, 100) for _ in range(10)]

print("Arreglo inicializado con valores aleatorios:")
print(" ".join(map(str, numeros)))
