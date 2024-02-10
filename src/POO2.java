public class POO2 {
    
    public static void main(String[] args){
        Carro car1= new Carro();
        Carro car2= new Carro(1,"WWW","AUV2425","Jaime");

        System.out.println("El id del carro 2 es: "+car2.getid());
        System.out.println("La marca del carro es: "+car2.getmarca());
        System.out.println("La matricula del carro es: "+car2.getmatricula());
        System.out.println("El dueño del carro es: "+car2.getdueño());

        car1.setid(1);
        car1.setmarca("CCC");
        car1.setmatricula("UAJ29");
        car1.setdueño("Jose");

        System.out.println("_______________________________________");
        System.out.println("El id del carro 1: " +car1.getid());
        System.out.println("La marca del carro es:"+ car1.getmarca());
        System.out.println("La matricula del carro es: "+car1.getmatricula());
        System.out.println("El dueño del carro es: "+car1.getdueño());
        System.out.println("_______________________________________");
        car1.setdueño("Karla");
        System.out.println("El dueño del carro es: "+car1.getdueño());
    }


}
