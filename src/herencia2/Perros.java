package herencia2;

public class Perros extends Mascotas{
    String pelaje;
    String habilidad;
    String tamaño;

    
    public Perros() {
    }

    public Perros(String pelaje, String habilidad, String tamaño,int id,String nombre,String raza){
        super(id,nombre,raza);
        this.tamaño=tamaño;
        this.pelaje = pelaje;
        this.habilidad = habilidad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
