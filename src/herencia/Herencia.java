package herencia;
public class Herencia {

    public static void main(String[] args){
        Empleado empleado1 = new Empleado();
        empleado1.getNum_legajo(); 
        empleado1.getId();
        empleado1.getNombre();


        Consultor consultor1 =new Consultor();
        consultor1.getNombre_consultora();
        consultor1.getApellido();
        consultor1.getNombre();


    }

}
