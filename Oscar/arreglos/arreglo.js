// Puntos 1, 2 y 3: Declaración, recorrido y modificación de arreglos

// Declarar un arreglo de 10 enteros con valores aleatorios del 1 al 100
const numeros = Array.from({ length: 10 }, () => Math.floor(Math.random() * 100) + 1);

console.log("Arreglo inicializado con valores aleatorios:");
console.log(numeros.join(" "));

// --- Punto 2: Recorrido e impresión ---

// Recorrido con for clásico
console.log("\nRecorrido con for clásico:");
for (let i = 0; i < numeros.length; i++) {
    console.log(`  numeros[${i}] = ${numeros[i]}`);
}

// Recorrido con forEach (equivalente a for-each)
console.log("\nRecorrido con forEach:");
numeros.forEach((n) => {
    process.stdout.write(n + " ");
});
console.log();

// --- Punto 3: Modificación ---

// Cambiar todos los valores impares por cero (se necesita copia para modificar)
const numerosModif = [...numeros];
console.log("\nCambio de impares a cero:");
for (let i = 0; i < numerosModif.length; i++) {
    if (numerosModif[i] % 2 !== 0) numerosModif[i] = 0;
}
console.log(numerosModif.join(" "));

// Multiplicar todos los valores por su índice
console.log("\nMultiplicación por índice:");
for (let i = 0; i < numerosModif.length; i++) {
    numerosModif[i] *= i;
}
console.log(numerosModif.join(" "));
