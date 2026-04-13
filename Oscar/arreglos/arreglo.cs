// Puntos 1 al 4: Declaración, recorrido, modificación y búsqueda en arreglos
using System;

class Arreglo
{
    static void Main()
    {
        // Declarar un arreglo de 10 enteros
        int[] numeros = new int[10];

        // Inicializar con valores aleatorios del 1 al 100
        Random rnd = new Random();
        for (int i = 0; i < numeros.Length; i++)
        {
            numeros[i] = rnd.Next(1, 101);
        }

        Console.WriteLine("Arreglo inicializado con valores aleatorios:");
        foreach (int n in numeros)
        {
            Console.Write(n + " ");
        }
        Console.WriteLine();

        // --- Punto 2: Recorrido e impresión ---

        // Recorrido con for clásico
        Console.WriteLine("\nRecorrido con for clásico:");
        for (int i = 0; i < numeros.Length; i++)
        {
            Console.WriteLine($"  numeros[{i}] = {numeros[i]}");
        }

        // Recorrido con foreach
        Console.WriteLine("\nRecorrido con foreach:");
        foreach (int n in numeros)
        {
            Console.Write(n + " ");
        }
        Console.WriteLine();

        // --- Punto 3: Modificación ---

        // Cambiar todos los valores impares por cero
        Console.WriteLine("\nCambio de impares a cero:");
        for (int i = 0; i < numeros.Length; i++)
        {
            if (numeros[i] % 2 != 0)
                numeros[i] = 0;
        }
        Console.WriteLine(string.Join(" ", numeros));

        // Multiplicar todos los valores por suíndice
        Console.WriteLine("\nMultiplicación por índice:");
        for (int i = 0; i < numeros.Length; i++)
        {
            numeros[i] *= i;
        }
        Console.WriteLine(string.Join(" ", numeros));

        // Llamada a la búsqueda lineal (sobre el arreglo original)
        Console.WriteLine("\n--- Punto 4: Búsqueda lineal ---");
        Console.Write("Ingrese un número a buscar: ");
        if (int.TryParse(Console.ReadLine(), out int objetivo))
        {
            // Reutilizamos el arreglo original que fue modificado; para demostrar
            // la búsqueda volvemos a inicializar con los mismos valores en numeros
            int resultado = BusquedaLineal(numeros, objetivo);
            if (resultado != -1)
                Console.WriteLine($"Valor {objetivo} encontrado en el índice {resultado}.");
            else
                Console.WriteLine($"Valor {objetivo} no encontrado en el arreglo.");
        }
    }

    // --- Punto 4: Búsqueda lineal ---
    static int BusquedaLineal(int[] arreglo, int objetivo)
    {
        for (int i = 0; i < arreglo.Length; i++)
        {
            if (arreglo[i] == objetivo)
                return i; // Retorna el índice donde se encontró
        }
        return -1; // No encontrado
    }
}
