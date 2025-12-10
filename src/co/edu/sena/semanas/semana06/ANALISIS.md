# Análisis de Diseño - Semana 06: Dominio Productos Electrónicos

## 1. Identificación de Abstracciones

### Clase Abstracta
**Nombre:** ElectronicProduct

**¿Por qué es abstracta?**
- Representa el concepto general de un producto electrónico; comparte atributos comunes (marca, modelo, precio) y comportamiento reutilizable, pero el cálculo del precio final y la descripción dependen del tipo concreto (laptop, smartphone).

**Jerarquía (simplificada):**

```
ElectronicProduct (abstract)
├── Laptop
└── Smartphone
```

## 2. Interfaces Implementadas

### Interfaz 1: `Recargable`
**Capacidad que define:** carga y estado de batería.

**Métodos:**
- `void charge(int percent)` — añadir carga
- `boolean isBatteryLow()` — detectar batería baja
- `int getBatteryLevel()` — obtener nivel actual
**Clases que la implementan:**
- `Smartphone`: tiene batería y puede cargarse.

### Interfaz 2: `Connectable`
**Capacidad que define:** conectividad (WiFi).

**Métodos:**
- `void connectWiFi(String ssid)` — conectar a una red
- `boolean isConnected()` — estado de conexión

**Clases que la implementan:**
- `Smartphone`: puede conectarse a WiFi.
- `Laptop`: también implementa conectividad.

## 3. Decisiones de Diseño

### ¿Por qué Clase Abstracta vs Interface?

- Se eligió `ElectronicProduct` como clase abstracta porque hay una relación "es-un" clara (una laptop ES un producto electrónico) y se comparte estado (atributos como `marca`, `modelo`, `precio`). Además se quería compartir un método concreto (`showInfo`).
- Se eligieron interfaces para capacidades que no dependen de la jerarquía: cargar (`Recargable`) y conectividad (`Connectable`). Estas capacidades pueden aplicarse a diferentes productos sin forzar una relación de herencia.

## 4. Principios SOLID Aplicados

- SRP (Single Responsibility): Cada clase tiene una responsabilidad clara — `Laptop` y `Smartphone` modelan detalles de cada tipo; las interfaces representan capacidades puntuales.
- OCP (Open/Closed): Se pueden añadir nuevos tipos de `ElectronicProduct` (por ejemplo `Tablet`) sin modificar las clases existentes; solo se implementan los métodos abstractos.
- LSP (Liskov): Las subclases (`Laptop`, `Smartphone`) pueden sustituir a `ElectronicProduct` sin romper la lógica del programa (implementan `calcularpreciofinal` y `getDescription`).
- ISP (Interface Segregation): Las interfaces son pequeñas y específicas (`Recargable`, `Connectable`).

## 5. Mejoras logradas

**Antes (Semana 05):**
- Código con clases concretes dispersas y poca separación entre comportamiento y estado.

**Después (Semana 06):**
- Abstracción clara con `ElectronicProduct` y subclases.
- Capacidades separadas en interfaces para favorecer composición y reutilización.
- Programa de demostración que muestra polimorfismo e implementación de interfaces.

## 6. Próximos Pasos

- Añadir más tipos concretos (e.g., `Tablet`, `SmartWatch`).
- Implementar pruebas unitarias para `calcularpreciofinal` y métodos de interfaces.
- Añadir validaciones y manejo de errores (e.g., carga negativa).
