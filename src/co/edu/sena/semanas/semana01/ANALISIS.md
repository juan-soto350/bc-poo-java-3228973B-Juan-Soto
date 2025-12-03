# Análisis Orientado a Objetos - TechStore

**Estudiante:** Juan Esteban Soto Perez  
**Ficha:** 3228973B  
**Fecha:** Novbiembre 2025  
**Semana:** 01 - Introducción al Paradigma Orientado a Objetos


Esto como tal se lo pedi a la IA ya que no sabi comno hacer muy bien y por eso salio muy largo
---

## 1. Identificación del Dominio

**Nombre del negocio:** TechStore  
**Tipo:** Tienda de Tecnología y Electrónica  
**Ubicación:** Bogotá, Centro Comercial Unicentro  
**Descripción:** TechStore es una tienda especializada en venta de equipos tecnológicos, smartphones, tablets, accesorios y servicio técnico. Cuenta con 10 asesores comerciales y técnicos, atendiendo aproximadamente 80 clientes al día. Se enfoca en productos de alta calidad con garantía y soporte técnico especializado.

---

## 2. Objetos Identificados

### Objeto Principal: ElectronicProduct (Producto Electrónico)

**¿Qué es?:** 
Un dispositivo tecnológico disponible para la venta en TechStore. Representa cualquier artículo del inventario que puede ser comercializado, desde laptops y smartphones hasta tablets y accesorios tecnológicos.

**Atributos identificados:**
- **brand** (String): Marca del producto (Apple, Samsung, HP, Lenovo, Dell, etc.)
- **model** (String): Modelo específico del dispositivo (MacBook Pro M3, Galaxy S24, etc.)
- **price** (double): Precio de venta en pesos colombianos
- **stockQuantity** (int): Cantidad disponible en inventario
- **hasWarranty** (boolean): Indica si el producto tiene garantía activa
- **category** (String): Categoría del producto (Laptop, Smartphone, Tablet, Accesorio)
- **warrantyMonths** (int): Duración de la garantía en meses

**Métodos identificados:**
- **showInfo()**: Muestra toda la información del producto de forma organizada en consola
- **calculateDiscountPrice(int discountPercentage)**: Calcula y retorna el precio con descuento aplicado
- **isAvailable()**: Verifica si el producto está disponible en stock
- **updateStock(int quantity)**: Actualiza la cantidad en inventario (suma o resta)
- **sellProduct(int quantity)**: Procesa una venta y reduce el stock automáticamente
- **setPrice(double price)**: Actualiza el precio del producto con validación
- **getBrand(), getModel(), getPrice(), getStockQuantity()**: Getters para acceder a los atributos
- **setWarrantyMonths(int months)**: Actualiza los meses de garantía

---

### Objeto Secundario: Customer (Cliente)

**¿Qué es?:** 
Una persona que realiza compras en TechStore. Representa a los clientes del negocio, almacenando su información de contacto, historial de compras y beneficios de membresía.

**Atributos identificados:**
- **customerId** (String): Identificador único del cliente en el sistema
- **fullName** (String): Nombre completo del cliente
- **email** (String): Correo electrónico de contacto
- **phoneNumber** (String): Número telefónico
- **totalPurchases** (int): Contador de compras realizadas
- **isVipMember** (boolean): Indica si es cliente VIP con descuentos especiales

**Métodos identificados:**
- **showCustomerInfo()**: Muestra toda la información del cliente incluyendo nivel de membresía
- **getDiscountPercentage()**: Calcula el porcentaje de descuento según historial (0%, 5%, 10% o 15%)
- **registerPurchase()**: Registra una nueva compra y actualiza el contador
- **isFrequentCustomer()**: Determina si es cliente frecuente (5+ compras)
- **promoteToVip()**: Promoción automática a VIP después de 10 compras
- **getCustomerId(), getFullName(), getEmail(), getTotalPurchases(), isVipMember()**: Getters
- **setEmail(String email), setPhoneNumber(String phoneNumber), setVipMember(boolean)**: Setters

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación (Cliente-Producto)

**Descripción:** 
En el contexto de TechStore, existe una relación de **asociación** entre Customer y ElectronicProduct. Un Cliente puede comprar múltiples Productos Electrónicos, y un Producto puede ser comprado por múltiples Clientes a lo largo del tiempo.

**Cómo funciona la relación:**
1. Un **Customer** realiza compras de **ElectronicProducts**
2. Cada vez que un Cliente compra un Producto:
   - Se registra la compra en el Customer (`registerPurchase()`)
   - Se reduce el stock del ElectronicProduct (`sellProduct()`)
   - El descuento del Cliente se actualiza automáticamente según su historial
3. Los Clientes VIP obtienen 15% de descuento en todos los productos
4. El sistema permite gestionar inventario y clientes de forma independiente pero relacionada

**Ejemplo práctico:**
```
María Fernández (Customer) → compra → MacBook Pro M3 (ElectronicProduct)
  - Se registra compra en el perfil de María
  - Stock de MacBook reduce de 5 a 4 unidades
  - María acumula puntos hacia membresía VIP
```

---

## 4. Justificación del Diseño

### ¿Por qué elegí estos objetos?

Elegí **ElectronicProduct** y **Customer** porque son los dos pilares fundamentales de cualquier sistema de ventas en una tienda de tecnología:

1. **ElectronicProduct** es el activo principal del negocio. Sin productos, no hay ventas.
2. **Customer** representa a quien genera los ingresos. TechStore necesita fidelizar clientes.
3. La relación entre ambos (compra-venta) es el proceso de negocio más importante.

### ¿Por qué estos atributos son importantes?

**Para ElectronicProduct:**
- **brand y model**: Identificación esencial para diferencias entre miles de productos similares
- **price**: Base para calcular ventas, descuentos y rentabilidad
- **stockQuantity**: Control de inventario crítico para evitar sobreventa o desabastecimiento
- **hasWarranty y warrantyMonths**: Diferenciador competitivo que afecta la decisión de compra
- **category**: Permite organizar productos y facilitar búsquedas

**Para Customer:**
- **customerId**: Identificador único necesario para sistemas de bases de datos
- **fullName, email, phoneNumber**: Datos de contacto esenciales para comunicación post-venta
- **totalPurchases**: Métrica clave para programas de fidelización
- **isVipMember**: Permite segmentar clientes y ofrecer beneficios exclusivos

### ¿Por qué estos métodos son necesarios?

**Lógica de negocio implementada:**

1. **showInfo() y showCustomerInfo()**: Necesarios para que empleados consulten información rápidamente
2. **calculateDiscountPrice()**: TechStore ofrece promociones constantes; este cálculo es crítico
3. **sellProduct()**: Automatiza la reducción de stock previniendo errores manuales
4. **registerPurchase()**: Acumula historial para recompensas automáticas
5. **getDiscountPercentage()**: Implementa reglas de negocio del programa de lealtad
6. **isAvailable()**: Evita vender productos agotados
7. **updateStock()**: Facilita entrada de nuevo inventario

---

## 5. Comparación: POO vs Programación Estructurada

### Sin POO (Programación Estructurada):

En programación estructurada, manejaríamos el sistema con **variables sueltas** y **funciones independientes**:

```java
//esta parte se la pedi a la IA 

// Variables sueltas para UN producto
String productBrand = "Apple";
String productModel = "MacBook Pro M3";
double productPrice = 9500000;
int productStock = 5;
boolean productWarranty = true;

// Variables sueltas para UN cliente
String clientId = "C001";
String clientName = "María Fernández";
String clientEmail = "maria@email.com";
int clientPurchases = 0;

// Funciones independientes
public static void showProduct(String brand, String model, double price, int stock) {
    System.out.println("Producto: " + brand + " " + model);
    System.out.println("Precio: $" + price);
    System.out.println("Stock: " + stock);
}

public static double applyDiscount(double price, int percentage) {
    return price - (price * percentage / 100);
}

public static void sellProduct(int quantity) {
    productStock -= quantity; // ¿Cuál producto? ¡Solo hay variables globales!
}
```

**Problemas de este enfoque:**
1.  Solo puedo manejar UN producto y UN cliente a la vez
2.  Si quiero 100 productos, necesito 700 variables (7 atributos × 100)
3.  Las funciones no saben a qué producto aplicar operaciones
4.  Código difícil de mantener y propenso a errores
5.  No hay encapsulación: cualquier parte del código puede modificar las variables

---

### Con POO:

```java
// Crear múltiples productos fácilmente
ElectronicProduct product1 = new ElectronicProduct("Apple", "MacBook Pro M3", 9500000, 5, "Laptop", 12);
ElectronicProduct product2 = new ElectronicProduct("Samsung", "Galaxy S24", 5200000, 12, "Smartphone", 24);
ElectronicProduct product3 = new ElectronicProduct("HP", "Pavilion 15", 2800000, 8, "Laptop", 12);

// Cada producto tiene sus propios métodos
product1.sellProduct(2);  // Vende 2 MacBooks
product2.setPrice(4900000);  // Cambia precio del Samsung
product3.showInfo();  // Muestra información del HP

// Crear múltiples clientes
Customer customer1 = new Customer("C001", "María Fernández", "maria@email.com", "3001234567");
Customer customer2 = new Customer("C002", "Carlos Rodríguez", "carlos@email.com", "3109876543");

// Cada cliente tiene su propio historial
customer1.registerPurchase();
customer2.registerPurchase();
```

---

### Ventajas específicas en mi dominio:

1. **Escalabilidad Real**
   - TechStore vende 80 clientes/día × 2 productos promedio = 160 transacciones diarias
   - Con POO: Crear 160 objetos de venta es simple
   - Sin POO: Necesitaría miles de variables y funciones complejas

2. **Gestión de Inventario Precisa**
   - Cada `ElectronicProduct` mantiene su propio stock
   - Imposible vender más unidades de las disponibles
   - El método `sellProduct()` valida automáticamente

3. **Programa de Fidelización Automático**
   - Cada `Customer` acumula compras individualmente
   - Promoción automática a VIP después de 10 compras
   - Descuentos calculados dinámicamente según historial

4. **Mantenibilidad del Código**
   - Si mañana TechStore quiere agregar "puntos de recompensa", solo modifico la clase `Customer`
   - Si hay un nuevo tipo de garantía, solo actualizo `ElectronicProduct`
   - El resto del sistema sigue funcionando sin cambios

5. **Reutilización**
   - Las clases pueden usarse en una app móvil, sitio web o sistema de punto de venta
   - No necesito reescribir la lógica de descuentos o gestión de stock

---

