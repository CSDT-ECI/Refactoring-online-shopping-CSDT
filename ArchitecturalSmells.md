# Architectural Smells

Los architectural smells son señales de posibles problemas en el diseño y estructura de un proyecto de software. En este proyecto de comercio electrónico, basado en Spring Boot y varias otras tecnologías, se identificaron algunos architectural smells. A continuación se describen cada uno de ellos.

## 1. Falta de Modularidad

La modularidad es crucial para un proyecto de software escalable y mantenible. La falta de modularidad ocurre cuando las capas del sistema están demasiado acopladas entre sí. En este proyecto, varios servicios dependen directamente de repositorios específicos y controladores, sin un nivel intermedio de abstracción.

### Problema
Este acoplamiento estrecho puede dificultar el mantenimiento y la escalabilidad. Cuando los servicios dependen de implementaciones concretas, cambiar el comportamiento del sistema se vuelve más complejo y propenso a errores.

### A mejorar
Para mejorar la modularidad, se recomienda desacoplar las dependencias entre servicios y repositorios mediante el uso de interfaces y patrones como Dependency Injection. Esto permite una mayor flexibilidad, facilitando el cambio de implementaciones sin afectar a otras partes del sistema.

## 2. Violación del Principio de Responsabilidad Única (SRP)

El Principio de Responsabilidad Única (Single Responsibility Principle, SRP) establece que cada clase debe tener una única razón para cambiar. Cuando una clase asume múltiples responsabilidades, se convierte en una fuente de confusión y puede llevar a errores y problemas de mantenimiento.

### Problema
En este proyecto, algunas clases asumen más de una responsabilidad. Por ejemplo, `UserServiceImpl` no solo maneja operaciones relacionadas con usuarios, sino también el cifrado de contraseñas. Este tipo de acoplamiento puede ser problemático, ya que aumenta la complejidad y dificulta las pruebas unitarias.

### A mejorar
Para abordar esta violación del SRP, se recomienda separar las responsabilidades en diferentes componentes o clases. En el caso de `UserServiceImpl`, el cifrado de contraseñas podría ser gestionado por un componente independiente, permitiendo que `UserServiceImpl` se concentre solo en las operaciones relacionadas con usuarios.

## 3. Violación del Principio de Inversión de Dependencia (DIP)

El Principio de Inversión de Dependencia (Dependency Inversion Principle, DIP) indica que las clases de alto nivel no deben depender de clases de bajo nivel, sino de abstracciones. Cuando las dependencias están fuertemente acopladas a implementaciones concretas, el sistema se vuelve rígido y difícil de modificar.

### Problema
En el proyecto, varios servicios dependen directamente de implementaciones concretas de repositorios. Por ejemplo, `CartServiceImpl` y `CategoryServiceImpl` están estrechamente acoplados con sus respectivos repositorios, violando el DIP.

### A mejorar 
Para mejorar el cumplimiento del DIP, se recomienda usar interfaces para definir las dependencias y aplicar Dependency Injection para inyectar implementaciones concretas en tiempo de ejecución. Esto permite cambiar las implementaciones subyacentes sin afectar a las clases de alto nivel.

## 4. Controladores con Excesiva Lógica de Negocio

Los controladores en Spring Boot deben centrarse en la interacción con el usuario y delegar la lógica de negocio a los servicios. Cuando los controladores incluyen demasiada lógica de negocio, puede ser una señal de una violación del principio de separación de preocupaciones.

### Problema
En el proyecto, el `CartController` maneja cierta lógica de negocio, como la manipulación de `CartLine` y cálculos relacionados con `Cart`. Esto puede llevar a un código más complejo y difícil de mantener.

### A mejorar 
Para abordar este problema, se recomienda mover la lógica de negocio fuera de los controladores y delegarla a servicios específicos. Esto mejora la claridad y la mantenibilidad del código, permitiendo que los controladores se enfoquen en la interacción con el usuario.

## 5. Uso de Variables Primitivas para Conceptos de Dominio

El uso de tipos primitivos para representar conceptos de dominio puede limitar la expresividad del código y dificultar su comprensión. En el proyecto, se observa el uso de enteros para representar identificadores, lo que puede ser menos expresivo que utilizar objetos que encapsulen esos conceptos.

### Problema
El uso de tipos primitivos para identificadores y otros conceptos de dominio puede hacer que el código sea menos comprensible y más propenso a errores. Además, limita la capacidad de agregar validación o comportamiento específico del dominio.

### A mejorar
Para mejorar la expresividad del código, se recomienda encapsular conceptos de dominio en clases pequeñas en lugar de usar tipos primitivos. Esto puede proporcionar más contexto y permitir la implementación de lógica específica para esos conceptos.

## 6. Duplicación de Código

La duplicación de código es un architectural smell común que puede aumentar la complejidad y llevar a inconsistencias y errores. En el proyecto, se observa duplicación de lógica en varias partes, como la validación de archivos de imagen y la lógica para filtrar productos inactivos.

### Problema
La duplicación de código no solo hace que el código sea más complejo y difícil de mantener, sino que también puede llevar a errores cuando las partes duplicadas no se actualizan de manera coherente.

### Recomendación
Para eliminar la duplicación de código, se recomienda refactorizar el código creando métodos o clases compartidas para la lógica repetitiva. Esto mejora la mantenibilidad y garantiza la coherencia del sistema.

## 7. Uso de Middle Man

Un middle man es una clase que actúa como intermediario, delegando la mayoría de sus operaciones a otros componentes. Cuando se utiliza sin agregar valor, puede ser una señal de estructuras innecesariamente complejas.

### Problema
En el proyecto, `CartServiceImpl` actúa como un middle man, delegando la mayoría de sus operaciones sin agregar valor. Esto puede ser un signo de una arquitectura innecesariamente compleja.

### A mejorar
Para abordar este problema, se recomienda eliminar las clases que actúan como intermediarios sin agregar valor. Si un método o clase solo delega operaciones, es preferible simplificar la arquitectura accediendo directamente a la fuente de información.

## Conclusión
Los architectural smells identificados representan áreas donde el proyecto podría beneficiarse de refactorización y mejoras para lograr una estructura de software más robusta y escalable. Abordar estos problemas puede ayudar a mejorar la mantenibilidad, flexibilidad y capacidad de adaptación del proyecto a medida que evoluciona. Con una arquitectura sólida, el proyecto estará mejor posicionado para enfrentar futuros desafíos y cambios en los requisitos de negocio.
