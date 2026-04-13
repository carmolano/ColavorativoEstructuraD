// Punto 1: Declaración e inicialización de un arreglo con valores aleatorios

// Declarar un arreglo de 10 enteros con valores aleatorios del 1 al 100
const numeros = Array.from({ length: 10 }, () => Math.floor(Math.random() * 100) + 1);

console.log("Arreglo inicializado con valores aleatorios:");
console.log(numeros.join(" "));
