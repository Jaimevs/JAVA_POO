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

1. Objetos: Un objeto es una instancia de una clase

![Texto alternativo](https://i.ytimg.com/vi/jDkfTCGrQio/maxresdefault.jpg)

Es la representacion de un objeto que generalmente existe en la vida real.

2. Constructores: Son funciones especiales que contienen las clases para permitir la creacion de objetos. Se llaman SIEMPRE igual que la clase

Tipos:
°Constructor vacío
°Constructor con todos los parametros

```java

public class Alumno {

    //Atributos de la clase Alumno
    int id;
    String nombre;
    String apellido;

    public Alumno() { //Constructor vacío     
    }

    //Objeto Alumno
    public Alumno(int id, String nombre, String apellido){ 
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Acciones o Metodos
    public void mostrarNombre(){ //modificador de acceso-tipo de dato-nombre del metodo
        System.out.println("Mi nombre es Jaime Vazquez S");
    }
}

```

```java
public class POO {
    public static void main(String[] args){
        
        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (2, "Jaime", "Vazquez");

    }
}
```

