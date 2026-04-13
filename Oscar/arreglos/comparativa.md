# Comparativa de Lenguajes en el Manejo de Arreglos

## Tabla de Lenguajes Analizados

| Característica | C# | JavaScript | TypeScript | Python | Kotlin | Dart |
|---|---|---|---|---|---|---|
| **Tipado** | Estático y fuerte | Dinámico y débil | Estático y fuerte | Dinámico y fuerte | Estático y fuerte | Estático y fuerte |
| **Paradigma** | Multiparadigma (OO, funcional) | Multiparadigma | Multiparadigma | Multiparadigma | Multiparadigma (OO, funcional) | Multiparadigma (OO, funcional) |
| **Compilado/Interpretado** | Compilado (JIT con CLR) | Interpretado (JIT en motor JS) | Transpilado a JS | Interpretado | Compilado (JVM / Nativo) | AOT / JIT |
| **Declaración de arreglo** | `int[] arr = new int[10];` | `const arr = []` | `const arr: number[] = []` | `arr = []` | `val arr = IntArray(10)` | `List<int> arr = []` |
| **Tipo nulo** | Sí (`int?`) | Sí (undefined/null) | Sí (`number \| null`) | Sí (None) | Sí (`Int?`) | Sí (`int?`) |

---

## 1. Tipado: Estático vs Dinámico

### ¿Qué significa?

- **Tipado estático**: El tipo de una variable se define en tiempo de **compilación** y no puede cambiar.
- **Tipado dinámico**: El tipo se determina en tiempo de **ejecución** y puede variar.

### Lenguajes estáticos (C#, TypeScript, Kotlin, Dart)

Requieren que el tipo sea declarado explícitamente (o inferido en compilación):

```csharp
// C# — tipo definido en compilación
int[] numeros = new int[10];
```

```typescript
// TypeScript — tipo explícito o inferido
const numeros: number[] = [1, 2, 3];
```

```kotlin
// Kotlin — tipo inferido pero estático
val numeros = IntArray(10)
```

```dart
// Dart — tipo explícito
List<int> numeros = List.generate(10, (_) => 0);
```

### Lenguajes dinámicos (JavaScript, Python)

No requieren declarar el tipo; éste puede cambiar en tiempo de ejecución:

```javascript
// JavaScript — sin tipo declarado
const numeros = [1, 2, "tres"]; // válido, mezcla de tipos
```

```python
# Python — tipado dinámico, se puede reasignar a otro tipo
numeros = [1, 2, 3]
numeros = "ahora soy un string"  # válido en Python
```

---

## 2. Tipado Fuerte vs Débil

- **Tipado fuerte**: No se permiten conversiones implícitas entre tipos incompatibles.
- **Tipado débil**: Se permiten coerciones automáticas entre tipos.

### Ejemplo ilustrativo

```javascript
// JavaScript (débil): coerción automática
console.log("5" + 1);  // "51" (string, no error)
console.log("5" - 1);  // 4   (número, coerción implícita)
```

```python
# Python (fuerte): no hay coerción implícita
print("5" + 1)  # TypeError — no se puede sumar str e int
```

```csharp
// C# (fuerte): error de compilación
int x = "5" + 1;  // Error: no se puede convertir string a int
```

---

## 3. Declaración y Creación de Arreglos

Cada lenguaje tiene su propio mecanismo para declarar y crear arreglos:

| Lenguaje | Sintaxis |
|---|---|
| C# | `int[] arr = new int[10];` |
| JavaScript | `const arr = new Array(10).fill(0);` |
| TypeScript | `const arr: number[] = new Array(10).fill(0);` |
| Python | `arr = [0] * 10` |
| Kotlin | `val arr = IntArray(10)` |
| Dart | `List<int> arr = List.generate(10, (_) => 0);` |

### Diferencia clave

- **C# y Kotlin** trabajan con arreglos de tamaño fijo (`int[]`, `IntArray`) que no pueden crecer después de ser creados.
- **JavaScript, TypeScript, Python y Dart** trabajan principalmente con **listas dinámicas** que pueden crecer o decrecer.

---

## 4. Recorrido: `for` clásico vs `for-each`

El `for` clásico da acceso al **índice**, útil para modificar elementos o hacer cálculos posicionales.
El `for-each` itera directamente sobre los **valores**, más legible pero sin índice directo.

| Lenguaje | For clásico | For-each |
|---|---|---|
| C# | `for (int i = 0; i < arr.Length; i++)` | `foreach (int n in arr)` |
| JavaScript | `for (let i = 0; i < arr.length; i++)` | `arr.forEach(n => ...)` |
| TypeScript | `for (let i: number = 0; ...)` | `arr.forEach((n: number) => ...)` |
| Python | `for i in range(len(arr)):` | `for n in arr:` |
| Kotlin | `for (i in arr.indices)` | `arr.forEach { n -> ... }` |
| Dart | `for (int i = 0; i < arr.length; i++)` | `for (int n in arr)` |

---

## 5. Modificación de Arreglos

### Inmutabilidad por defecto

- **Kotlin**: al usar `val`, la referencia al arreglo es inmutable, pero los elementos del `IntArray` sí pueden modificarse.
- **JavaScript/TypeScript**: al usar `const`, la referencia no cambia, pero los contenidos del array sí.
- **C#, Python, Dart**: no tienen esa restricción por defecto.

### Ejemplo: cambiar impares a cero

```csharp
// C# — modificación directa
for (int i = 0; i < numeros.Length; i++)
    if (numeros[i] % 2 != 0) numeros[i] = 0;
```

```python
# Python — lista mutable por defecto
for i in range(len(numeros)):
    if numeros[i] % 2 != 0:
        numeros[i] = 0
```

---

## 6. Búsqueda Lineal

La búsqueda lineal recorre el arreglo elemento por elemento hasta encontrar el valor objetivo o llegar al final (complejidad O(n)).

| Lenguaje | Retorno de función | Manejo de no encontrado |
|---|---|---|
| C# | `int` (índice) | `return -1` |
| JavaScript | `number` (índice) | `return -1` |
| TypeScript | `number` (con tipo explícito) | `return -1` |
| Python | `int` o `None` (índice) | `return -1` |
| Kotlin | `Int` (índice) | `return -1` |
| Dart | `int` (índice) | `return -1` |

---

## 7. Conclusión General

| Aspecto | Ventaja del lenguaje | Desventaja |
|---|---|---|
| **C#** | Tipado fuerte + rendimiento JIT | Más verboso |
| **JavaScript** | Flexible, dinámico | Errores de tipo en runtime |
| **TypeScript** | Tipado opcional sobre JS | Requiere transpilación |
| **Python** | Legibilidad y simplicidad | Más lento, tipado dinámico |
| **Kotlin** | Conciso, null-safe, JVM | Curva de aprendizaje |
| **Dart** | Optimizado para Flutter/móvil | Ecosistema más pequeño |

> Los lenguajes **estáticos y fuertemente tipados** (C#, TypeScript, Kotlin, Dart) ofrecen mayor seguridad en tiempo de compilación,
> mientras que los **dinámicos** (JavaScript, Python) ofrecen más flexibilidad a costa de posibles errores en la ejecución.
