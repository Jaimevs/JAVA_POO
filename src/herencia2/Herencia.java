package herencia2;

public class Herencia {
    public static void main(String[] args){
        Perros perro1=new Perros();
            perro1.setId(1);
            perro1.setTamaño("Grande");
            perro1.setHabilidad("Cazar");


        Gatos gato1=new Gatos();
            gato1.setId(1);
            gato1.setNombre("Negrito");
            gato1.setAutolimpeza("Muy Limpio");


        System.out.println("El id del perro 1 es: "+ perro1.getId());   
        System.out.println("El tamaño del perro 1 es: "+ perro1.getTamaño());
        System.out.println("La habilidad del perro 1 es: "+ perro1.getHabilidad()); 

        System.out.println("_________________________________________________________________");

        System.out.println("El id del gato 1 es: "+ gato1.getId());
        System.out.println("El nombre del gato 1 es: "+ gato1.getNombre());
        System.out.println("La autolimpeza del gato 1 es: "+ gato1.getAutolimpeza());
    }
}
