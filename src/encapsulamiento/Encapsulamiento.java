package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();  //Estamos intanciando de la clase Alumno
        Alumno alumno2 = new Alumno(15, "Jaime", "Vazquez");

        // System.out.println("id: " + alumno2.getId()); //El id esta provado en la clase Alumno
        System.out.println("nombre: " + alumno2.getNombre());
        System.out.println("apellido: "+alumno2.getApellido());

    }

}
