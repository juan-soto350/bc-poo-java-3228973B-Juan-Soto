# Jerarquía de clases-Semana04 (Propiedas/caracteristicas)

---

    ElectronicProduct
           |
    +------+------+
    |             |
    Laptop      Smartphone

---

# Justificación

Elegí esta jerarquía porque en TechStore existen diferentes tipos de Productos electronicos que comparten características generales, pero también realizan funciones específicas.
Todos los Productos electronicos tienen atributos comunes como Marca, Modelo y Precio, por lo que es adecuado agruparlos en una clase padre llamada ElectronicProduct.
A partir de esta clase se derivan roles como Laptop, Smartphone y se podrian generar mas asi,
por lo tanto estos ejemplos representan Productos reales dentro de la tienda.

Esta estructura permite reutilizar código, mantener una organización más clara y reflejar de manera adecuada las diferencias entre los empleados dentro del dominio TechStore.


---
# Atributos Heredados

Los siguientes atributos pertenecen a la clase padre ElectronicProduct y son heredados por todas las clases hijas:

### Marca (String)

### Modelo (String)

### Precio (double)

---

# Métodos Sobrescritos

###  mostrarPrecio() 

El método mostrarPrecio() se sobrescribe porque cada tipo de producto electronico recibe su precio de forma distinta:


En la clase ElectronicProduct, el método devuelve únicamente el Precio base si lo podemos decir asi.

En Laptop, se sobrescribe para añadir un pequeño porcentaje de costo, modificando el Precio del producto en un 1.15% .

En Smartphone, se sobrescribe para añadir un pequeño porcentaje de costo, modificando el Precio del producto en un 1.10% .

En resumen, el método se sobrescribe porque cada tipo de Producto electronico tiene un Precio y informacion unica, aunque comparten la misma estructura básica heredada.

