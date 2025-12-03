# Mejoras - Semana 03

Este documento resume las mejoras aplicadas en las carpetas `semana01-mejorada` y `semana02-mejorada`.

## Resumen general
- Se aplicó encapsulación en las clases: todos los atributos son privados y se exponen mediante getters y setters.
- Se añadieron validaciones básicas en setters para evitar valores inválidos (por ejemplo, precios y cantidades negativas).
- Se añadieron constructores claros y (cuando corresponde) sobrecargados para facilitar la creación de objetos.
- Se mejoró la legibilidad y robustez mediante mensajes de error (lanzamiento de `IllegalArgumentException`) cuando se reciben datos no válidos.

---

## Mejoras en `semana01-mejorada`

### Clase: `ElectronicProduct`
- Atributos privados: `marca`, `modelo`, `precio`, `cantidadStock`, `mesesGarantia`.
- Getters y setters implementados para todos los atributos.
- Validaciones en setters:
    - `setPrecio(double precio)`: valida que `precio >= 0`, lanza `IllegalArgumentException` si es negativo.
    - `setCantidadStock(int cantidadStock)`: valida que `cantidadStock >= 0`.
    - `setMesesGarantia(int mesesGarantia)`: valida que `mesesGarantia >= 0`.

**Beneficio:** evita valores inválidos (precios o cantidades negativas) y centraliza la lógica de validación en los setters.

### Clase: `TechnicianEmployee`
- Atributos privados: `nombre`, `cargo`, `especialidadTecnica`, `salario`, `reparacionesRealizadas`.
- Se añadió un constructor que inicializa todos los atributos.
- Getters y setters para cada atributo.
- Validación en `setSalario(double salario)`: valida `salario >= 0`, lanza `IllegalArgumentException` si es negativo.

**Beneficio:** objetos técnico con estado consistente desde la creación y validación de salario evitando valores negativos.

---

## Mejoras en `semana02-mejorada`

### Clase: `Accesorio`
- Atributos privados: `tipo`, `precio`, `marca`.
- Constructor que recibe `tipo`, `precio` y `marca`.
- Getters y setters implementados.
- Validación en `setPrecio(double precio)`: asegura `precio >= 0` y lanza `IllegalArgumentException` en caso contrario.

**Beneficio:** evita accesorios con precio negativo y facilita creación segura de instancias.

### Clase: `Proveedor`
- Atributos privados: `nombre`, `contacto`, `paisOrigen`.
- Constructor que inicializa los atributos.
- Métodos:
    - `obtenerInfo()`: devuelve una cadena resumida con el nombre, país de origen y contacto.
    - Getters y setters para cada atributo.

**Beneficio:** encapsula la información del proveedor y provee un método útil para mostrar datos resumidos.

---

## Recomendaciones y siguientes pasos
- Revisar los paquetes y la declaración de `package` en los archivos Java: en las versiones mejoradas algunos archivos comentan la declaración `package` — es recomendable colocar la declaración correcta (por ejemplo, `package co.edu.sena.semanas.semana03;`) y organizar los archivos en el paquete correspondiente.
- Ejecutar una compilación y/o pruebas locales para detectar errores de paquete o imports faltantes.
- Considerar añadir tests unitarios simples para validar las validaciones de setters y comportamiento de `obtenerInfo()`.
- Si quieres, puedo:
    - Hacer el commit de estos cambios y crear un `README` con instrucciones para compilar/ejecutar.
    - Añadir los `package` correctos y ajustar la estructura para que los archivos compilen sin errores.

---

## Estado actual
- `MEJORAS.md` actualizado con el resumen de las mejoras encontradas en las carpetas `semana01-mejorada` y `semana02-mejorada`.

---
Una unica cosa por decir y es que en la semana02 no pude subir un archivo porque me salia un error y lo intentaba solucionar y aun asi con IA no me dejaba

