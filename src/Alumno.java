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

    
}

