public class Carro {
    int id;
    String marca;
    String matricula;
    String dueño;

    public Carro(){
    }

    public Carro(int id, String marca, String matricula, String dueño){
        this.id = id;
        this.marca = marca;
        this.matricula = matricula;
        this.dueño = dueño;
    }

    public int getid(){
        return id;
    }

    public String getmarca(){
        return marca;
    }

    public String getmatricula(){
        return matricula;
    }
    
    public String getdueño(){
        return dueño;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void setmatricula(String matricula){
        this.matricula=matricula;
    }

    public void setdueño(String dueño){
        this.dueño=dueño;
    }

}
