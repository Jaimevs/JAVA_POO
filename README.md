# JAVA_POO


La Programación Orientada a Objetos (POO) es un paradigma de programación que se basa en el concepto de "objetos". Los objetos son instancias de clases, y las clases son plantillas que definen la estructura y el comportamiento de esos objetos. Java es un lenguaje de programación que sigue el paradigma de la POO de manera sólida.

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

### V. METODOS CONSTRUCTORES y OBJETOS en JAVA

1. Objetos: Un objeto es una instancia de una clase

![Texto alternativo](https://i.ytimg.com/vi/jDkfTCGrQio/maxresdefault.jpg)

Es la representacion de un objeto que generalmente existe en la vida real.

2. Constructores: Son funciones especiales que contienen las clases para permitir la creacion de objetos. Se llaman SIEMPRE igual que la clase

Tipos:

Constructor vacío

Constructor con todos los parametros

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

### VI. Get (Traer) y Set (Colocar o Modificar)

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

    //Get = Traer
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    // SET = Colocar
    public void setid(int id) {
        this.id = id;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setapellido(String apellido) {
        this.apellido =apellido;
    }
}
```

```java
    public class POO {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(2, "Jaime", "Vazquez");

        System.out.println("-------------------------------");
        // Get = Traer
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        System.out.println("-------------------------------");
        // SET = Colocar o Modificar
        alu1.setid(8);
        alu1.setnombre("Luis");
        alu1.setapellido("Ortiz");

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

        System.out.println("-------------------------------");
        alu1.setid(35); //Cambio de valor, lo estoy sobrescribiendo

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

    }
}


```

### VIII. HERENCIA en JAVA

Hay clases que comparten gran parte de sus características. 

El mecanismo conocido con el nombre de herencia permite reutilizar clases: Se crea una nueva clase que extiende la funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.

La nueva clase, a la que se denomina subclase, puede poseer atributos y métodos que no existan en la clase original. 

![Texto alternativo](https://lh3.googleusercontent.com/nVpYEGH-S9y40tn0tB0rafK3_6i3ZLlYDyfNbsP_C7v3a7yshiyrP8SrLdnUZ2UR1fpGyVaR9Wf-uE9lEtqjeCRhk9HsIkd4wtLATpt4ZCOyNdrUl09sPf37YqIoDZnJAh9k5TeqTr5oYJx3QlnR4cKLAGEDxh6POk5DP2QW175Npo7G-KBf3-NGwwLWupOBokuOZRGn6wgT_35oXlCWwlc_4UjPG6zZqGDSdzZ63wLE4Aba0u1pnZ-6MwPosyGfA_3T0omLcdjh82EP6lBiHvRlNWiSa9d9Qac_teYv7Ww4gT-uP0KcLYUx2qdMO7JPp7y2t4S7NcbSfGsk7SLb7AH-zwcExNjHTsQVu2YG7tMlkwTljAP6BxWlLXOXiOpZAJr4gbx1xgBj-7gBSv4DGZdnWrkdcbWSa6IqTjaKB1YI7QStAwRk_zyri2CKrVWelbW_Hy_tcL2V4okgZgD-oVSEUFb9FYQEw9_MN9j3N36m1JaJEXb6d5YSQPfOq0kVUnZttw4wVCmx61e_QIrIguoVrlM2CmxOR_mmnx4AFMAoajfWStMyDe9B32moLCfJj0lJK1janDX5BFVKqj-uHHubjtqm3xLg_AXam4hFAWVzVbbDhdF2=w634-h463-no)



