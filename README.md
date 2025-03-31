# **Spring Boot - Monitoring Tutorial**

* Katherin Juliana Moreno Carvajal
* Mariana Salas Gutiérrez
* Santiago Navarro Cuy

# Implementación de la Observabilidad

## Descripción de la Observabilidad

 La observabilidad en microservicios es fundamental para garantizar el correcto funcionamiento de sistemas distribuidos complejos,
 ya que permite obtener una visión clara del comportamiento de cada servicio en tiempo real. Mediante el uso de herramientas como logging, monitoring y tracing.

 - **Logging:** Se refiere al registro detallado de eventos que ocurren dentro de un microservicio, proporcionando información sobre su estado y ayudando a identificar errores. 
 - **Monitoring:**  Implica la recopilación de métricas en tiempo real sobre el rendimiento de los servicios, lo que permite detectar anomalías y responder proactivamente a problemas.
 - **Tracing:** Rastrea el recorrido de una solicitud a través de múltiples microservicios, facilitando la identificación de cuellos de botella y fallos en el sistema.

Estos conceptos, en conjunto, permiten una visibilidad completa, mejorando la eficiencia, reduciendo tiempos de respuesta y facilitando el diagn´ ostico de problemas en sistemas de microservicios.

---

## Estructura del Proyecto
La estructura del proyecto sigue el estándar de **Maven** y **Spring Boot**, también utilizando **Docker**:

```
DisenoCorte2
├── .git
├── .gitattributes
├── .gitignore
├── .idea
├── .mvn
|   └── maven-wrapper.properties
├── config
|   └── prometheus.yml
├── docker-compose.yml
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── kjuli
│   │   │           └── monitoringback
│   │   │               ├── api
│   │   │               ├── controller
│   │   │               ├── dto
│   │   │               ├── enums
│   │   │               ├── exception
│   │   │               ├── mapper
│   │   │               ├── model
│   │   │               ├── MonitoringbackApplication.java
│   │   │               ├── repository
│   │   │               └── service
│   │   └── resources
|   |       ├── application.properties
|   |       └── data.sql
│   └── test
|       └── MonitoringbackApplicationTests.java
└── target
```

---

## Dependencias Utilizadas
Este proyecto no utiliza dependencias adicionales que deban ser definidas en el archivo **pom.xml**.

---

## Instrucciones de Instalación

1. **Clonar el repositorio:**
```bash
git clone https://github.com/Syreus311/Prototype.git
cd Prototype
```

2. **Compilar el proyecto:**
```bash
mvn clean install
mvn clean compile         # Opcional
```

3. **Ejecutar el proyecto:**
```bash
mvn exec:java
```

---

## Ejemplo de Ejecución
Al ejecutar el programa, deberías ver la siguiente salida:

```
¡Bienvenido al sistema de clonación de vehículos
=============================================
              MENÚ PRINCIPAL
=============================================
1. Clonar un nuevo vehículo
2. Ver cuántos vehículos se han clonado y sus características
3. Comparar memoria entre dos vehículos clonados
4. Salir
Seleccione una opción (1-4):
```

## Explicación de la Implementación
El patrón Prototype ha sido implementado utilizando las siguientes clases principales:
- **Vehicle**: Vehicle es una implementación concreta que puede ser clonada. Contiene la lógica de negocio para modificar las propiedades del vehículo, pero también está definida para ser clonada mediante el método clone.
- **VehiclePrototype**: Funciona como una interfaz o clase base para los objetos que se van a clonar. Contiene el método clone(), que es implementado por la clase concreta para proporcionar la lógica de clonación.
- **VehicleRegistry**: Se encarga de almacenar y gestionar los prototipos de los vehículos. Contiene un mecanismo para recuperar una copia de un prototipo registrado mediante su identificador.
- **Main**: Main actúa como el cliente en este patrón, ya que es la clase encargada de solicitar la clonación de los objetos mediante la interacción con el VehicleRegistry para obtener las instancias clonadas.

---


Store application based on Java 17, Spring Boot, Microservices Architecture, Docker, K8s, Jenkins and CI/CD

To create database:

1. Install Docker
2. Enter on basepath of the project (store-app) where the docker-compose.yml file is located
3. Execute this command: docker-compose up -d
4. Verify in docker the correct creation of the container
