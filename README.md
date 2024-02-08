# JAVA_POO

Breve descripción del proyecto.

---

## POO con JAVA

### I. Introducción

Paradigma: Es todo modelo, patron o ejemplo que debe seguirse en determinada situación. 

POO: Se basa en la idea de un mundo lleno de objetos y que la resolución de problemas se realiza mediante el modelo/abstracción de objetos de la vida real.

Objetos: Los objetos pueden comunicarse entre sí mediante mensajes.

Características:
1. Abstracción
2. Encapsulamiento
3. Polimorfismo
4. Herencia
5. UML (Lenguaje Universidad de Modelado)

### III. CLASES

Es una plantilla, o molde que permite construir objetos. Por ejemplo, si tuviéramos la clase Auto, ésta sería el plano para construir el Objeto (en este caso uno o varios autos)

```java
    public class Alumno { //clase Alumno

      //Atributos de la clase Alumno
      int id;
      String nombre;
      String apellido;

}
```

### IV. METODOS en JAVA
Metodos son acciones contenidos en una clase, y definen su comportamiento
Dentro de un sistema las operaciones suelen detectarse como verbos en infinitivo
```java
//Acciones o Metodos
    public void mostrarNombre(){ //modificador de acceso-tipo de dato-nombre del metodo
        System.out.println("Mi nombre es Jaime Vazquez S");
    }

    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobe la materia");
        }else{
            System.out.println("Reprobe");
        }

    }
```

### METODOS CONSTRUCTORES y OBJETOS en JAVA

1. Objetos 
Un objeto es una instancia de una clase

![Texto alternativo](https://i.ytimg.com/vi/jDkfTCGrQio/maxresdefault.jpg)

