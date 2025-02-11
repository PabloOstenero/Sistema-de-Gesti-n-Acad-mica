### **Ejercicio 9: Sistema de Gestión Académica**

 Descripción: Crea una jerarquía de clases para representar distintos roles en un entorno académico, como estudiantes y profesores.

 Clases a implementar:

  Clase Base Persona

  1. Propiedades comunes: nombre (String), edad (Int), id (String).
  2. Método mostrarRol(), que imprime el rol de la persona (Estudiante, Profesor, etc.).

  Clase Derivada Estudiante

  3. Propiedades específicas: curso (String), calificacionPromedio (Double).
  4. Implementa el método mostrarRol() y añade un método mostrarCalificacion() para imprimir la calificación promedio.

  Clase Derivada Profesor

  5. Propiedades específicas: departamento (String), aniosExperiencia (Int).
  6. Implementa el método mostrarRol() y añade un método mostrarExperiencia() para imprimir los años de experiencia.
