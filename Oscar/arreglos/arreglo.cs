// Puntos 1 y 2: Declaración, inicialización, recorrido e impresión de arreglos
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
    }
}
