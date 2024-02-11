package herencia;

public class Herencia {

    public static void main(String[] args) {
        //Empleado empleado1 = new Empleado();
        //empleado1.getNum_legajo();
        //empleado1.getId();
        //empleado1.getNombre();

        //Consultor consultor1 = new Consultor();
        //consultor1.getNombre_consultora();
        //consultor1.getApellido();
        //consultor1.getNombre();

        Persona vector[] = new Persona[5]; //las clases empleado, consultro y jefe son clases hijas y son formas diferentes de representar una misma persona me permite que en un vector que pertenesca a la clases padre yo pueda guardar distintos tipos que pertenescan a clases hijas  
        vector[0] = new Persona(); // Clase Madre
        vector[1] = new Empleado(); // Clase hija
        vector[2] = new Consultor();// Clase hija
        vector[3] = new Jefe(); // Clase hija

        Persona perso=new Persona();
        Consultor consul=new Consultor();

        perso=consul;
    }

}
