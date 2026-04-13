// Puntos 1 y 2: Declaración, inicialización, recorrido e impresión de arreglos

// Declarar un arreglo de 10 enteros con tipo explícito
const numeros: number[] = Array.from({ length: 10 }, () => Math.floor(Math.random() * 100) + 1);

console.log("Arreglo inicializado con valores aleatorios:");
console.log(numeros.join(" "));

// --- Punto 2: Recorrido e impresión ---

// Recorrido con for clásico
console.log("\nRecorrido con for clásico:");
for (let i: number = 0; i < numeros.length; i++) {
    console.log(`  numeros[${i}] = ${numeros[i]}`);
}

// Recorrido con forEach (equivalente a for-each)
console.log("\nRecorrido con forEach:");
numeros.forEach((n: number) => {
    process.stdout.write(n + " ");
});
console.log();
