// Punto 1: Declaración e inicialización de un arreglo con valores aleatorios
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
    }
}
