package CLASES_ABSTRACTAS;

public abstract class Figura {  //abstract es para crear clases abstractas

    protected double x; //posicion en x
    protected double y; //posicion en y

    protected Figura(){ //solo las hijas pueden verlo

    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea(); //declaro el metodo y lo pongo como abstracto




}
