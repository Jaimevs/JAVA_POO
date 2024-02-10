package herencia;

public class Consultor extends Persona{ // extends Persona <--ya tengo una relacion entre la clase Consultor y Persona
    String nombre_consultora;
    int num_consultos;

    public Consultor(){
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
            String nombre_consultora, int num_consultos) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultos = num_consultos;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultos() {
        return num_consultos;
    }

    public void setNum_consultos(int num_consultos) {
        this.num_consultos = num_consultos;
    }

    

    
}
