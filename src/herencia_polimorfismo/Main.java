package herencia_polimorfismo;

public class Main {

    public static void main(String[] args){
        Carbon carbonsito = new Carbon();
        Diamante diamante = new Diamante();

        carbonsito.destruir();
        diamante.destruir();
    }

}
