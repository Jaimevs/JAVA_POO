package herencia2;

public class Gatos extends Mascotas{
    String autolimpeza;
    String comunicacion;

    public Gatos(){
    }

    public Gatos(String autolimpeza,String comunicacion, int id, String nombre, String raza){
        super(id,nombre,raza);
        this.autolimpeza = autolimpeza;
        this.comunicacion = comunicacion;
    }

    public String getAutolimpeza() {
        return autolimpeza;
    }

    public void setAutolimpeza(String autolimpeza) {
        this.autolimpeza = autolimpeza;
    }

    public String getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(String comunicacion) {
        this.comunicacion = comunicacion;
    }

    

}
