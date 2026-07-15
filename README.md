# Llanquihue-Tour-App

# 🧠 Evaluación Desarrollo Orientado a Objetos I – Semana 8

## 👤 Autor del proyecto

- **Nombre completo:** Yessica Ximena Brevis Garnica
- **Sección:** 008A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online.

---

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la **Semana 8** de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema fue desarrollado en **Java** para representar distintas entidades que forman parte de la agencia turística **Llanquihue Tour**.

En esta versión se aplican los principales conceptos de la **Programación Orientada a Objetos**, utilizando:

- Interfaces.
- Herencia.
- Polimorfismo.
- Sobrescritura de métodos (@Override).
- Colecciones genéricas (`ArrayList<Registrable>`).
- Operador `instanceof`.
- Interfaz gráfica desarrollada con **JFrame** y **Swing**.

El sistema permite registrar distintas entidades de la agencia, almacenarlas en una misma colección y mostrar su información mediante una interfaz gráfica sencilla.

---

# 🧱 Estructura general del proyecto

```plaintext
📁 src/

├── data/
│   └── GestorEntidades.java
│      # Administra la colección de entidades registradas.

├── model/
│   ├── Registrable.java
│   │   # Interfaz que define el método mostrarResumen().
│   │
│   ├── Persona.java
│   │   # Clase base con los datos comunes de las personas.
│   │
│   ├── GuiaTuristico.java
│   │   # Hereda de Persona e implementa Registrable.
│   │
│   ├── ColaboradorExterno.java
│   │   # Hereda de Persona e implementa Registrable.
│   │
│   └── Vehiculo.java
│       # Implementa Registrable para representar vehículos de la agencia.

└── ui/
    └── Main.java
       # Interfaz gráfica desarrollada con JFrame.
```

---

# ✅ Funcionalidades desarrolladas

- Creación de una interfaz común llamada `Registrable`.
- Implementación de la interfaz en distintas clases del sistema.
- Aplicación de herencia mediante la clase `Persona`.
- Sobrescritura del método `mostrarResumen()` utilizando `@Override`.
- Uso de una colección `ArrayList<Registrable>`.
- Almacenamiento de distintos tipos de objetos en una misma colección.
- Recorrido de la colección mediante un ciclo **for-each**.
- Diferenciación de objetos utilizando el operador **instanceof**.
- Registro de entidades mediante una interfaz gráfica desarrollada en Swing.
- Visualización de todas las entidades registradas desde la interfaz.

---

# 🖥️ Funcionamiento de la aplicación

La interfaz gráfica permite:

- Ingresar un Guía Turístico.
- Ingresar un Colaborador Externo.
- Registrar las entidades en una colección.
- Mostrar todas las entidades registradas.
- Limpiar los campos del formulario.
- Salir de la aplicación mediante un mensaje de confirmación.

---

# ⚙️ Instrucciones para compilar y ejecutar

1. Clonar o descargar el repositorio desde GitHub.

```bash
https://github.com/yessica-brevis/Llanquihue-TourApp.git
```

2. Abrir el proyecto en **Apache NetBeans**.

3. Compilar el proyecto.

4. Ejecutar la clase **Main.java** ubicada en el paquete **ui**.

5. Utilizar la interfaz gráfica para registrar entidades y visualizar la información almacenada.

---

# 🛠️ Tecnologías utilizadas

- Java
- Apache NetBeans
- Java Swing (JFrame)
- Programación Orientada a Objetos (POO)

---

# 📂 Repositorio GitHub

```text
https://github.com/yessica-brevis/Llanquihue-TourApp.git
```

---

# 📅 Fecha de entrega
13/07/2026
