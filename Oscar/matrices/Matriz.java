public class Matriz {
    public static void main(String[] args) {
        // Actividad 1: Declaración e inicialización
        // Crear una matriz 3x3 de enteros
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Punto 1: Matriz 3x3 declarada e inicializada.");

        // Actividad 2: Recorrido
        // Imprimir la matriz en forma de tabla
        System.out.println("\nImpresión de la matriz en forma de tabla:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Recorrer la matriz por columnas
        System.out.println("\nRecorrido por columnas:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" (Columna " + j + ")");
        }

        // Actividad 3: Operaciones
        // Sumar todos los elementos
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("\nSuma de todos los elementos: " + suma);

        // Intercambiar la primera fila con la última
        System.out.println("\nIntercambiando la primera fila con la última...");
        int[] temp = matriz[0];
        matriz[0] = matriz[matriz.length - 1];
        matriz[matriz.length - 1] = temp;

        // Mostrar resultado del intercambio
        System.out.println("Matriz después del intercambio:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
