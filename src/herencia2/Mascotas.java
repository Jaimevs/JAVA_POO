package herencia2;

public class Mascotas {
    int id;
    String raza;
    String nombre;

    public Mascotas(){
    }

    public Mascotas(int id, String raza, String nombre){
        this.id = id;
        this.raza = raza;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
