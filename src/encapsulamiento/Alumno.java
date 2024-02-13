package encapsulamiento;

public class Alumno {

    //Estos atributos son privados
    private int id;
    private String nombre;
    private String apellido;

    public Alumno(){
    }

    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido=apellido;
    }

    private int getId() {  //esto esta Privado
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
