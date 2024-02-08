public class POO {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(2, "Jaime", "Vazquez");

        System.out.println("-------------------------------");
        // Get = Traer
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        System.out.println("-------------------------------");
        // SET = Colocar o Modificar
        alu1.setid(8);
        alu1.setnombre("Luis");
        alu1.setapellido("Ortiz");

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

        System.out.println("-------------------------------");
        alu1.setid(35); //Cambio de valor, lo estoy sobrescribiendo

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

    }
}
